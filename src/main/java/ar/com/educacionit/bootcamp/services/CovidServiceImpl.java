package ar.com.educacionit.bootcamp.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.connectors.CovidAPIConnector;
import ar.com.educacionit.bootcamp.entities.CovidDate;
import ar.com.educacionit.bootcamp.entities.CovidDateDto;
import ar.com.educacionit.bootcamp.mappers.CovidDateMapperToDto;
import ar.com.educacionit.bootcamp.repositories.IRepository;
import ar.com.educacionit.bootcamp.repositories.CovidRepositoryImpl;

public class CovidServiceImpl implements CovidService {

	private CovidAPIConnector executor;
	private IRepository repository;

	public CovidServiceImpl(String url) {
		executor = new CovidAPIConnector(url);
		repository = new CovidRepositoryImpl("covid");
	}

	public Collection<CovidDateDto> getCovidStatsFromAPI() {
	    List<CovidDateDto> covidDateDtoList = new ArrayList<>();

	    for (int i = 1; i <= 20; i++) {
	    	String date = String.format("%d%02d%02d", 2020, 5, i);
	    	String dateEndPoint = date + ".json";
	        CovidDate covidDate = executor.getCovidStats(dateEndPoint);
	        CovidDateDto dto = CovidDateMapperToDto.map(covidDate);
	        covidDateDtoList.add(dto);
	    }

	    return covidDateDtoList;
	}

	@SuppressWarnings("unchecked")
	public Collection<CovidDateDto> getCovidStatsFromDB(){
		return repository.findAll();
	}

	public void saveList(Collection<CovidDateDto> list) {
		repository.saveList(list);
	}


}
