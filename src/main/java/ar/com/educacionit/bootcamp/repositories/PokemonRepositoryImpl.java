package ar.com.educacionit.bootcamp.repositories;

import ar.com.educacionit.bootcamp.repositories.db.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.entities.Pokemon;

public class PokemonRepositoryImpl extends BaseRepository<Pokemon> implements IPokemonRepository {

	public PokemonRepositoryImpl(String table) {
		super(table);
	}

	protected Pokemon fromResultSetToEntity(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong(1);
		String name = resultSet.getString(2);
		return new Pokemon(id, name);
	}


	protected String getSaveSQL() {
		return " (id,name) VALUES (?,?)";
	}

	protected void saveEntity(Pokemon entity, PreparedStatement statement) throws SQLException {
		statement.setLong(1,entity.getId());
		statement.setString(2,entity.getName());
	}



	
	
	
	
//	private String table;
//
//	public PokemonRepositoryImpl(String table) {
//		this.table = table;
//	}
//
//	public List<Pokemon> findAll() {
//		String sql = "SELECT * FROM " + this.table;
//		List<Pokemon> list = new ArrayList<>();
//
//		try (Connection connection = ConnectionManager.getConnection()) {
//
//			PreparedStatement statement = connection.prepareStatement(sql);
//
//			ResultSet resultSet = statement.executeQuery();
//
//			while (resultSet.next()) {
//				int id = resultSet.getInt(1);
//				String name = resultSet.getString(2);
//
//				list.add(new Pokemon(id, name));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return list;
//	}
//
//	public void saveList(List<Pokemon> list) {
//	    String sql = "INSERT INTO " + this.table + " (id, name) VALUES (?, ?)";
//
//	    try (Connection connection = ConnectionManager.getConnection()) {
//	        PreparedStatement statement = connection.prepareStatement(sql);
//
//	        for (Pokemon pokemon : list) {
//	            statement.setInt(1, pokemon.getId());
//	            statement.setString(2, pokemon.getName());
//	            statement.addBatch();
//	        }
//
//	        statement.executeBatch();
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	}
//	

}
