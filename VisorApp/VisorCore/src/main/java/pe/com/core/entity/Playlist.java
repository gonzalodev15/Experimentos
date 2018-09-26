package pe.com.core.entity;

import java.io.Serializable;

public class Playlist implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String description;
	
	public Playlist(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Playlist() {
		super();
	}
	
	public Playlist(Integer id) {
		super();
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
