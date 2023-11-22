package ar.com.educacionit.bootcamp.connectors;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.util.JacksonFeature;

import ar.com.educacionit.bootcamp.entities.CovidDate;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class CovidAPIConnector {

	private String url;

	public CovidAPIConnector(String url) {
		this.url = url;
	}

	public CovidDate getCovidStats(String endPoint) {
		Client client = ClientBuilder.newClient();
		System.out.println(url+endPoint);
		WebTarget target = client.target(this.url).path(endPoint);
	

		Invocation.Builder invocation = target.request(MediaType.APPLICATION_JSON);

		Response response = invocation.get();

		if (response.getStatus() != Status.OK.getStatusCode()) {
			throw new RuntimeException(response.getStatusInfo().getReasonPhrase());
		}
	
		CovidDate covidDate = response.readEntity(CovidDate.class);
		
		return covidDate;
	}
}
