package ar.com.educacionit.bootcamp.mappers;

import ar.com.educacionit.bootcamp.entities.CovidDate;
import ar.com.educacionit.bootcamp.entities.CovidDateDto;

public class CovidDateMapperToDto {

	public static CovidDateDto map(CovidDate covidDate) {
		CovidDateDto dto = new CovidDateDto(covidDate.getDate(), covidDate.getPositive(), covidDate.getNegative(),
				covidDate.getHospitalizedCurrently(), covidDate.getHospitalizedCumulative(), covidDate.getDeath());
		return dto;
	}
}
