package ar.com.educacionit.bootcamp.entities;

public class CovidDateDto extends Entity{

	private Integer date;
	private Integer positiveCases;
	private Integer negativeCases;
	private Integer hospitalizedCurrently;
	private Integer hospitalizedCumulative;
	private Integer deaths;
	
	public CovidDateDto(Integer date, Integer positiveCases, Integer negativeCases, Integer hospitalizedCurrently,
			Integer hospitalizedCumulative, Integer deaths) {
		this.date = date;
		this.positiveCases = positiveCases;
		this.negativeCases = negativeCases;
		this.hospitalizedCurrently = hospitalizedCurrently;
		this.hospitalizedCumulative = hospitalizedCumulative;
		this.deaths = deaths;
	}

	public Integer getDate() {
		return date;
	}

	public Integer getPositiveCases() {
		return positiveCases;
	}

	public Integer getNegativeCases() {
		return negativeCases;
	}

	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	public Integer getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	public Integer getDeaths() {
		return deaths;
	}
	
	public String toString() {
		return "Fecha: " + date + ", Casos positivos: " + positiveCases + ", Casos negativos: " + negativeCases
				+ ", Hospitalizados actualmente: " + hospitalizedCurrently + ", Hospitalizados totales: "
				+ hospitalizedCumulative + ", Muertes totales: " + deaths + "\n";
	}
	
}
