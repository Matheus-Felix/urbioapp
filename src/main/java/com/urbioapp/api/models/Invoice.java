package com.urbioapp.api.models;

public class Invoice {
	private String issue_date;
	private float total_invoice;
	
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public float getTotal_invoice() {
		return total_invoice;
	}
	public void setTotal_invoice(float total_invoice) {
		this.total_invoice = total_invoice;
	}
	
}
