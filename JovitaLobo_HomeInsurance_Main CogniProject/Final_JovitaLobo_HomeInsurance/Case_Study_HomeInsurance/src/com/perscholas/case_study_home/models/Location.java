package com.perscholas.case_study_home.models;

import com.perscholas.case_study_home.enums.ResidenceTypeEn;
import com.perscholas.case_study_home.enums.ResidenceUseEn;

public class Location {
	int location_id;
	private ResidenceTypeEn residence_type; // enum
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String state;
	private int zip;
	private ResidenceUseEn residence_use;// enum
	private String user_id_location;

	public Location() {
		super();
	}

	public Location(int location_id, String residence_type, String address_line_1, String address_line_2, String city,
			String state, int zip, String residence_use, String user_id_location) {

		this.location_id = location_id;
		this.residence_type = ResidenceTypeEn.valueOf(residence_type);
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.residence_use = ResidenceUseEn.valueOf(residence_use);
		this.user_id_location = user_id_location;
	}

	public Location(String residence_type, String address_line_1, String address_line_2, String city, String state,
			int zip, String residence_use, String user_id_location) {
		this.residence_type = ResidenceTypeEn.valueOf(residence_type);
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.residence_use = ResidenceUseEn.valueOf(residence_use);
		this.user_id_location = user_id_location;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getResidence_type() {
		return residence_type.name();
	}

	public void setResidence_type(String residence_type) {
		this.residence_type = ResidenceTypeEn.valueOf(residence_type);
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getResidence_use() {
		return residence_use.name();
	}

	public void setResidence_use(String residence_use) {
		this.residence_use = ResidenceUseEn.valueOf(residence_use);
	}

	public String getUser_id_location() {
		return user_id_location;
	}

	public void setUser_id_location(String user_id_location) {
		this.user_id_location = user_id_location;
	}
}
