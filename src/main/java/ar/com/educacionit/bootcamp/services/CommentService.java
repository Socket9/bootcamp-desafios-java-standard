package ar.com.educacionit.bootcamp.services;

import java.util.Collection;

import ar.com.educacionit.bootcamp.entities.Comment;

public interface CommentService {

	public Collection<Comment> getCommentsFromAPI();
	public Collection<Comment> getCommentsFromDB();
	public void saveList(Collection<Comment> list);
}
