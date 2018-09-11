package com.perscholas.case_study_home.models;

import com.perscholas.case_study_home.enums.RetiredEn;
import java.sql.Date;

public class Homeowner {
	private int homeowner_id;
	private String first_name;
	private String last_name;
	private Date birth_date;
	private RetiredEn retired;// enum
	private int SSN;
	private String email_id;
	private String user_id_homeowner;

	public Homeowner(int homeowner_id, String first_name, String last_name, Date birth_date, String retired, int SSN,
			String email_id, String user_id_homeowner) {
		this.homeowner_id = homeowner_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_date = birth_date;
		this.retired = RetiredEn.valueOf(retired);
		this.SSN = SSN;
		this.email_id = email_id;
		this.user_id_homeowner = user_id_homeowner;
	}

	public Homeowner(String first_name, String last_name, Date birth_date, String retired, int SSN, String email_id,
			String user_id_homeowner) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_date = birth_date;
		this.retired = RetiredEn.valueOf(retired);
		this.SSN = SSN;
		this.email_id = email_id;
		this.user_id_homeowner = user_id_homeowner;
	}

	public int getHomeowner_id() {
		return homeowner_id;
	}

	public void setHomeowner_id(int homeowner_id) {
		this.homeowner_id = homeowner_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getRetired() {
		return retired.name();
	}

	public void setRetired(String retired) {
		this.retired = RetiredEn.valueOf(retired);
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int SSN) {
		SSN = SSN;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getUser_id_homeowner() {
		return user_id_homeowner;
	}

	public void setUser_id_homeowner(String user_id_homeowner) {
		this.user_id_homeowner = user_id_homeowner;
	}
}