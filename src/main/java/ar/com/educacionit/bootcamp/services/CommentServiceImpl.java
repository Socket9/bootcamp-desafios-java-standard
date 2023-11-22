package ar.com.educacionit.bootcamp.services;

import java.util.Collection;
import java.util.List;

import ar.com.educacionit.bootcamp.connectors.CommentConnector;
import ar.com.educacionit.bootcamp.entities.Pokemon;
import ar.com.educacionit.bootcamp.entities.Comment;
import ar.com.educacionit.bootcamp.repositories.ICommentRepository;
import ar.com.educacionit.bootcamp.repositories.IRepository;
import ar.com.educacionit.bootcamp.repositories.CommentRepositoryImpl;

public class CommentServiceImpl implements CommentService {

	private CommentConnector executor;
	private IRepository repository;

	public CommentServiceImpl(String url) {
		executor = new CommentConnector(url);
		repository = new CommentRepositoryImpl("comment");
	}

	public Collection<Comment> getCommentsFromAPI() {
		return executor.getComments("/comments");
	}

	@SuppressWarnings("unchecked")
	public Collection<Comment> getCommentsFromDB(){
		return (List<Comment>) repository.findAll();
	}

	public void saveList(Collection<Comment> list) {
		repository.saveList(list);
	}

}
