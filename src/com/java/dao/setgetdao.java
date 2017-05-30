package com.java.dao;

import java.sql.Date;

public class setgetdao {

	private int id;
	private String username;
	private String content;
	private String memotype;
	private Date memotime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMemotype() {
		return memotype;
	}
	public void setMemotype(String memotype) {
		this.memotype = memotype;
	}
	public Date getMemotime() {
		return memotime;
	}
	public void setMemotime(Date memotime) {
		this.memotime = memotime;
	}

	
	
	
}
