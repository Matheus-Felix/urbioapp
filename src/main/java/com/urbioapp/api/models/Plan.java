package com.urbioapp.api.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Plan {
	@Id
	private int id;
	private String name_plan;
	private float vl_plan;
	private String due_date;
	private String start_date;
	
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName_plan() {
		return name_plan;
	}
	public void setName_plan(String name_plan) {
		this.name_plan = name_plan;
	}
	public float getVl_plan() {
		return vl_plan;
	}
	public void setVl_plan(float vl_plan) {
		this.vl_plan = vl_plan;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
		

}
