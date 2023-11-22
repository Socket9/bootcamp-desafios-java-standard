package ar.com.educacionit.bootcamp.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.bootcamp.entities.Comment;
import ar.com.educacionit.bootcamp.entities.CovidDate;
import ar.com.educacionit.bootcamp.entities.CovidDateDto;

public class CovidRepositoryImpl extends BaseRepository<CovidDateDto> implements ICovidRepository {

	public CovidRepositoryImpl(String table) {
		super(table);
	}

	protected CovidDateDto fromResultSetToEntity(ResultSet resultSet) throws SQLException {
		Integer date = resultSet.getInt(1);
		Integer positives = resultSet.getInt(2);
		Integer negatives = resultSet.getInt(3);
		Integer hospitalizedCurrently = resultSet.getInt(4);
		Integer hospitalizedCumulative = resultSet.getInt(5);
		Integer deaths = resultSet.getInt(6);
		return new CovidDateDto(date, positives, negatives, hospitalizedCurrently, hospitalizedCumulative, deaths);
	}

	protected String getSaveSQL() {
		return " (date,positiveCases,negativeCases,hospitalizedCurrently,hospitalizedCumulative,deaths) VALUES (?,?,?,?,?,?)";
	}

	protected void saveEntity(CovidDateDto entity, PreparedStatement statement) throws SQLException {
		statement.setInt(1, entity.getDate());
		statement.setInt(2, entity.getPositiveCases());
		statement.setInt(3, entity.getNegativeCases());
		statement.setInt(4, entity.getHospitalizedCurrently());
		statement.setInt(5, entity.getHospitalizedCumulative());
		statement.setInt(6, entity.getDeaths());
	}

}
