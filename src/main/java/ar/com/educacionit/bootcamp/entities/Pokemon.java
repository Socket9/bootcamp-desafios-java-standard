package ar.com.educacionit.bootcamp.entities;

import java.util.List;

public class Pokemon extends Entity{
    private Long id;
    private String name;

    public Pokemon() {
    }

	public Pokemon(Long id, String name) {
        this.id = id;
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
    
	public String toString() {
		return "ID: " + id + "\t Nombre: " + name + "\n";
	}
	
}