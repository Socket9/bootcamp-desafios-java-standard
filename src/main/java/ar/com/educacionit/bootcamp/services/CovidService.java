package ar.com.educacionit.bootcamp.services;

import java.util.Collection;

import ar.com.educacionit.bootcamp.entities.CovidDate;
import ar.com.educacionit.bootcamp.entities.CovidDateDto;

public interface CovidService {

	public Collection<CovidDateDto> getCovidStatsFromAPI();
	public Collection<CovidDateDto> getCovidStatsFromDB();
	public void saveList(Collection<CovidDateDto> list);
}
