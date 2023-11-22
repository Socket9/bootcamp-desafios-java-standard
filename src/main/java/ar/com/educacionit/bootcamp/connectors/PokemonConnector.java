package ar.com.educacionit.bootcamp.connectors;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import ar.com.educacionit.bootcamp.entities.Pokemon;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class PokemonConnector {

	private String url;

	public PokemonConnector(String url) {
		this.url = url;
	}

	public List<Pokemon> getPokemons(String endPoint) {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(this.url).path(endPoint);

		Invocation.Builder invocation = target.request(MediaType.APPLICATION_JSON);

		Response response = invocation.get();

		if (response.getStatus() != Status.OK.getStatusCode()) {
			throw new RuntimeException(response.getStatusInfo().getReasonPhrase());
		}

		String jsonResp = response.readEntity(String.class);
		
		List<Pokemon> pokemonList = jsonToPokemonList(jsonResp);
		
		return pokemonList;
	}

	private List<Pokemon> jsonToPokemonList(String json) {

		Gson gson = new Gson();

		JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

		JsonArray results = jsonObject.getAsJsonArray("results");

		List<Pokemon> pokemonList = new ArrayList<>();

		for (JsonElement jsonElement : results) {

			JsonObject pokemonObject = jsonElement.getAsJsonObject();

			String url = pokemonObject.get("url").getAsString();

			Pokemon pokemon = getPokemonData(url);
			pokemonList.add(pokemon);
		}

		return pokemonList;
	}

	private Pokemon getPokemonData(String url) {

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(url);

		Invocation.Builder invocation = target.request(MediaType.APPLICATION_JSON);

		Response response = invocation.get();

		if (response.getStatus() != Response.Status.OK.getStatusCode()) {
			throw new RuntimeException(response.getStatusInfo().getReasonPhrase());
		}

		String jsonResponse = response.readEntity(String.class);

		Gson gson = new Gson();
		JsonObject pokemonObject = gson.fromJson(jsonResponse, JsonObject.class);

		Long id = pokemonObject.get("id").getAsLong();
		String name = pokemonObject.get("name").getAsString();


		return new Pokemon(id, name);
	}

}
