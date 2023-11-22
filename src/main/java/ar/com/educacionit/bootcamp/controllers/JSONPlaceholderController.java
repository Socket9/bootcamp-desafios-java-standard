package ar.com.educacionit.bootcamp.controllers;

import ar.com.educacionit.bootcamp.entities.Comment;
import ar.com.educacionit.bootcamp.services.CommentService;
import ar.com.educacionit.bootcamp.services.CommentServiceImpl;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/api/comment")
public class JSONPlaceholderController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CommentService service = new CommentServiceImpl("https://jsonplaceholder.typicode.com/");
		List<Comment> commentList = (List<Comment>) service.getCommentsFromDB();
		
		if(commentList.size() != 0) {
			resp.getWriter().print(commentList);
		} else {
			commentList = (List<Comment>) service.getCommentsFromAPI();
			service.saveList(commentList);
			resp.getWriter().print(commentList);
		}

		
		
	}

}
