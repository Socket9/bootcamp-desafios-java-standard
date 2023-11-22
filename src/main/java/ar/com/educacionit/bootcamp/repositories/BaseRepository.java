package ar.com.educacionit.bootcamp.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.entities.Entity;
import ar.com.educacionit.bootcamp.entities.Pokemon;
import ar.com.educacionit.bootcamp.repositories.db.ConnectionManager;

public abstract class BaseRepository<T extends Entity> implements IRepository<T>{

	private String table;

	public BaseRepository(String table) {
		this.table = table;
	}
	
	public Collection<T> findAll(){
		String sql = "SELECT * FROM " + this.table;
		List<T> list = new ArrayList<>();
		
		try(Connection connection = ConnectionManager.getConnection()){
			
			// Seteamos la query en el statement
			PreparedStatement statement = connection.prepareStatement(sql);

			// Ejecutamos la query
			ResultSet resultSet = statement.executeQuery();
			
			// Si hay registros se parsean como Entidad y se agregan a la lista
			while(resultSet.next()) {
				list.add(this.fromResultSetToEntity(resultSet));
			}
			
		} catch(SQLException e ) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	protected abstract T fromResultSetToEntity(ResultSet resultSet) throws SQLException;
	
	public void saveList(Collection<T> list) {
		for(T obj : list) {
			this.save(obj);
		}
	}
	
	public void save(T entity) {
		String sql ="INSERT INTO " + this.table + this.getSaveSQL();
		try(Connection connection = ConnectionManager.getConnection()) {
			
			PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

			saveEntity(entity, statement);
			
			statement.executeUpdate();
			
			ResultSet resKey = statement.getGeneratedKeys();
			if(resKey.next()) {
				entity.setId(resKey.getLong(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	protected abstract String getSaveSQL();
	protected abstract void saveEntity(T entity, PreparedStatement statement) throws SQLException;
}
