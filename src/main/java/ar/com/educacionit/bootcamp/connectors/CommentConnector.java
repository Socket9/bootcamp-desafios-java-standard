package ar.com.educacionit.bootcamp.connectors;

import java.util.List;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.core.util.JacksonFeature;

import ar.com.educacionit.bootcamp.entities.Comment;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class CommentConnector {

	private String url;

	public CommentConnector(String url) {
		this.url = url;
	}

	public List<Comment> getComments(String endPoint) {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(this.url).path(endPoint);

		Invocation.Builder invocation = target.request(MediaType.APPLICATION_JSON);

		Response response = invocation.get();

		if (response.getStatus() != Status.OK.getStatusCode()) {
			throw new RuntimeException(response.getStatusInfo().getReasonPhrase());
		}

		GenericType<List<Comment>> listType = new GenericType<List<Comment>>() {};
		
		List<Comment> list = response.readEntity(listType);
		
		return list;
	}
}
