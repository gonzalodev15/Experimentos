package pe.com.core.entity;

import java.io.Serializable;

public class Title implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer titleId;
	private Integer playlistId;
	private String name;
	private String year;
	
	public Title() {
		super();
	}
	public Title(Integer titleId) {
		super();
		this.titleId = titleId;
	}
	
	public Title(Integer titleId, Integer playlistId, String name, String year) {
		super();
		this.titleId = titleId;
		this.playlistId = playlistId;
		this.name = name;
		this.year = year;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public Integer getPlaylistId() {
		return playlistId;
	}
	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
