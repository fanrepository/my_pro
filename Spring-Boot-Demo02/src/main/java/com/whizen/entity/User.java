package com.whizen.entity;

public class User {
private Integer id ;
	
	private String username ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

	public User() {
		super();
	}

	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}

}
