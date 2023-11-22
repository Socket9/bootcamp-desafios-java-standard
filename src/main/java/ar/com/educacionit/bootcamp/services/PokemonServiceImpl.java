package ar.com.educacionit.bootcamp.services;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.connectors.PokemonConnector;
import ar.com.educacionit.bootcamp.entities.Pokemon;
import ar.com.educacionit.bootcamp.repositories.IRepository;
import ar.com.educacionit.bootcamp.repositories.PokemonRepositoryImpl;

public class PokemonServiceImpl implements PokemonService {

	private PokemonConnector executor;
	@SuppressWarnings("rawtypes")
	private IRepository repository;

	public PokemonServiceImpl(String url) {
		executor = new PokemonConnector(url);
		repository = new PokemonRepositoryImpl("pokemon");
	}

	public Collection<Pokemon> getPokemonListFromAPI() {
		return executor.getPokemons("/pokemon");
	}

	@SuppressWarnings("unchecked")
	public Collection<Pokemon> getPokemonFromDB(){
		return (List<Pokemon>) repository.findAll();
	}

	@SuppressWarnings("unchecked")
	public void saveList(Collection<Pokemon> list) {
		repository.saveList(list);
	}


}
