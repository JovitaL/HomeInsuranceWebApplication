package com.perscholas.case_study_home.models;

import java.util.Date;

public class ViewPolicy {
	private int policy_number;
	private Date policy_start_date; // DATE
	private Date policy_end_date; // DATE
	private double policy_term;
	private String policy_status;
	private int quote_id_Policy;
	// --quote--
	private int quote_id;
	private String user_id_Quote;

	public ViewPolicy() {
		super();
	}

	public ViewPolicy(int policy_number, Date policy_start_date, Date policy_end_date, double policy_term,
			String policy_status, int quote_id_Policy, int quote_id, String user_id_Quote) {
		super();
		this.policy_number = policy_number;
		this.policy_start_date = policy_start_date;
		this.policy_end_date = policy_end_date;
		this.policy_term = policy_term;
		this.policy_status = policy_status;
		this.quote_id_Policy = quote_id_Policy;
		this.quote_id = quote_id;
		this.user_id_Quote = user_id_Quote;
	}

	public int getPolicy_number() {
		return policy_number;
	}

	public void setPolicy_number(int policy_number) {
		this.policy_number = policy_number;
	}

	public Date getPolicy_start_date() {
		return policy_start_date;
	}

	public void setPolicy_start_date(Date policy_start_date) {
		this.policy_start_date = policy_start_date;
	}

	public Date getPolicy_end_date() {
		return policy_end_date;
	}

	public void setPolicy_end_date(Date policy_end_date) {
		this.policy_end_date = policy_end_date;
	}

	public double getPolicy_term() {
		return policy_term;
	}

	public void setPolicy_term(double policy_term) {
		this.policy_term = policy_term;
	}

	public String getPolicy_status() {
		return policy_status;
	}

	public void setPolicy_status(String policy_status) {
		this.policy_status = policy_status;
	}

	public int getQuote_id_Policy() {
		return quote_id_Policy;
	}

	public void setQuote_id_Policy(int quote_id_Policy) {
		this.quote_id_Policy = quote_id_Policy;
	}

	public int getQuote_id() {
		return quote_id;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	public String getUser_id_Quote() {
		return user_id_Quote;
	}

	public void setUser_id_Quote(String user_id_Quote) {
		this.user_id_Quote = user_id_Quote;
	}
}
