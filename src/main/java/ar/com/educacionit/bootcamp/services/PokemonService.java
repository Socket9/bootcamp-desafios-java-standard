package ar.com.educacionit.bootcamp.services;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.entities.Pokemon;

public interface PokemonService {

	public Collection<Pokemon> getPokemonListFromAPI();
	public Collection<Pokemon> getPokemonFromDB();
	public void saveList(Collection<Pokemon> list);
}
