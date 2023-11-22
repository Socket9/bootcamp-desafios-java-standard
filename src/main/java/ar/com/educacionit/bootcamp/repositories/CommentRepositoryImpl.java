package ar.com.educacionit.bootcamp.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.educacionit.bootcamp.entities.Pokemon;
import ar.com.educacionit.bootcamp.entities.Comment;

public class CommentRepositoryImpl extends BaseRepository<Comment> implements ICommentRepository{

	public CommentRepositoryImpl(String table) {
		super(table);
	}

	protected Comment fromResultSetToEntity(ResultSet resultSet) throws SQLException {	
		Integer postId = resultSet.getInt(1);
		Long id = resultSet.getLong(2);
		String name = resultSet.getString(3);
		String email = resultSet.getString(4);
		String body = resultSet.getString(5);
		return new Comment(postId, id, name, email, body);
	}

	protected String getSaveSQL() {
		return " (postId,id,name,email,body) VALUES (?,?,?,?,?)";
	}

	protected void saveEntity(Comment entity, PreparedStatement statement) throws SQLException {
		statement.setInt(1, entity.getPostId());
		statement.setLong(2, entity.getId());
		statement.setString(3, entity.getName());
		statement.setString(4, entity.getEmail());
		statement.setString(5, entity.getBody());
	}
	

}
