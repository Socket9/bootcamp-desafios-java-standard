package ar.com.educacionit.bootcamp.controllers;

import ar.com.educacionit.bootcamp.entities.Pokemon;
import ar.com.educacionit.bootcamp.repositories.PokemonRepositoryImpl;
import ar.com.educacionit.bootcamp.services.PokemonService;
import ar.com.educacionit.bootcamp.services.PokemonServiceImpl;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/api/pokemon")
public class PokemonController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PokemonService service = new PokemonServiceImpl("https://pokeapi.co/api/v2/");
		List<Pokemon> pokemonList = (List<Pokemon>) service.getPokemonFromDB();

		if (pokemonList.size() == 0) {
			pokemonList = (List<Pokemon>) service.getPokemonListFromAPI();
		} 	
		
		resp.getWriter().print(pokemonList);

	}

}
