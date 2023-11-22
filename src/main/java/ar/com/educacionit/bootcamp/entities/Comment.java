package ar.com.educacionit.bootcamp.entities;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "postId", "id", "name", "email", "body" })
@Generated("jsonschema2pojo")
public class Comment extends Entity{

	@JsonProperty("postId")
	private Integer postId;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("email")
	private String email;
	@JsonProperty("body")
	private String body;

	public Comment() {
	}

	public Comment(Integer postId, Long id, String name, String email, String body) {
		this.postId = postId;
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	@JsonProperty("postId")
	public Integer getPostId() {
		return postId;
	}

	@JsonProperty("postId")
	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("body")
	public String getBody() {
		return body;
	}

	@JsonProperty("body")
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", POST_ID: " + postId + ", NOMBRE: " + name + ", EMAIL: " + email + " MENSAJE: " + body + "\n";
		
	}

}