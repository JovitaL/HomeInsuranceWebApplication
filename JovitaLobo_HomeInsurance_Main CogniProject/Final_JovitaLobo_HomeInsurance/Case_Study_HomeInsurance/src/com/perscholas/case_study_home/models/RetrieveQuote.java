package com.perscholas.case_study_home.models;

import java.sql.Date;

import com.perscholas.case_study_home.enums.GarageTypeEn;
import com.perscholas.case_study_home.enums.HomeRoofMaterialEn;
import com.perscholas.case_study_home.enums.HomeStyleEn;
import com.perscholas.case_study_home.enums.NumFullBathEn;
import com.perscholas.case_study_home.enums.NumFullBathEn;
import com.perscholas.case_study_home.enums.NumHalfBathEn;
import com.perscholas.case_study_home.enums.ResidenceTypeEn;
import com.perscholas.case_study_home.enums.ResidenceUseEn;
import com.perscholas.case_study_home.enums.RetiredEn;
import com.perscholas.case_study_home.enums.SwimmingPoolEn;

public class RetrieveQuote {
	// -----location-----
	int location_id;
	private ResidenceTypeEn residence_type; // enum
	private String address_line_1;
	private String address_line_2;
	private String city;
	private String state;
	private int zip;
	private ResidenceUseEn residence_use;// enum
	private String user_id_location;
	// -------------homeowner---
	private int homeowner_id;
	private String first_name;
	private String last_name;
	private Date birth_date;
	private RetiredEn retired;// enum
	private int SSN;
	private String email_id;
	private String user_id_homeowner;
	// --------------property--
	private int property_id;
	private double market_value;
	private int built_year; // YEAR(4)
	private double home_square_foot;
	private NumFullBathEn num_full_bath; // enum --
	private HomeRoofMaterialEn home_roof_material;// enum --
	private GarageTypeEn garage_type;// enum --
	private HomeStyleEn home_style;
	private NumHalfBathEn num_half_bath;// enum --
	private SwimmingPoolEn swimming_pool;// enum --
	int location_id_Property;
	// -----quote----
	private int quote_id;
	private double monthly_premimum;
	private double dwelling_coverage;
	private double detatched_structure;
	private double personal_property;
	private double additional_living_exp;
	private double medical_expenses;
	private double deductible;
	private int location_id_Quote;
	private String user_id_Quote;

	public RetrieveQuote() {

	}

	public RetrieveQuote(int location_id, String residence_type, String address_line_1, String address_line_2,
			String city, String state, int zip, String residence_use, String user_id_location, int property_id,
			double market_value, int built_year, double home_square_foot, String home_style, String home_roof_material,
			String garage_type, String num_full_bath, String num_half_bath, String swimming_pool,
			int location_id_Property, int homeowner_id, String first_name, String last_name, Date birth_date,
			String retired, int SSN, String email_id, String user_id_homeowner, int quote_id, double monthly_premimum,
			double dwelling_coverage, double detatched_structure, double personal_property,
			double additional_living_exp, double medical_expenses, double deductible, int location_id_Quote,
			String user_id_Quote) {
		// loc
		this.location_id = location_id;
		this.residence_type = ResidenceTypeEn.valueOf(residence_type);
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.residence_use = ResidenceUseEn.valueOf(residence_use);
		this.user_id_location = user_id_location;
		// -----prop
		this.property_id = property_id;
		this.market_value = market_value;
		this.built_year = built_year;
		this.home_square_foot = home_square_foot;
		this.num_full_bath = NumFullBathEn.valueOf(home_style);
		this.home_roof_material = HomeRoofMaterialEn.valueOf(home_roof_material);
		this.garage_type = GarageTypeEn.valueOf(garage_type);
		this.num_full_bath = NumFullBathEn.valueOf(num_full_bath);
		this.num_half_bath = NumHalfBathEn.valueOf(num_half_bath);
		this.swimming_pool = SwimmingPoolEn.valueOf(swimming_pool);
		this.location_id_Property = location_id_Property;
		// ----homeowner
		this.homeowner_id = homeowner_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_date = birth_date;
		this.retired = RetiredEn.valueOf(retired);
		this.SSN = SSN;
		this.email_id = email_id;
		this.user_id_homeowner = user_id_homeowner;
		// quote
		this.quote_id = quote_id;
		this.monthly_premimum = monthly_premimum;
		this.dwelling_coverage = dwelling_coverage;
		this.detatched_structure = detatched_structure;
		this.personal_property = personal_property;
		this.additional_living_exp = additional_living_exp;
		this.medical_expenses = medical_expenses;
		this.deductible = deductible;
		this.location_id_Quote = location_id_Quote;
		this.user_id_Quote = user_id_Quote;
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

	public void setSSN(int ssn) {
		SSN = ssn;
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

	public int getProperty_id() {
		return property_id;
	}

	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}

	public double getMarket_value() {
		return market_value;
	}

	public void setMarket_value(double market_value) {
		this.market_value = market_value;
	}

	public int getBuilt_year() {
		return built_year;
	}

	public void setBuilt_year(int built_year) {
		this.built_year = built_year;
	}

	public double getHome_square_foot() {
		return home_square_foot;
	}

	public void setHome_square_foot(double home_square_foot) {
		this.home_square_foot = home_square_foot;
	}

	public String getHome_style() {
		return home_style.getHomeStyleValue();
	}

	public void setHome_style(String home_style) {
		switch (home_style) {
		case "1 story":
			this.home_style = HomeStyleEn.oneStory;
			break;
		case "1.5 story":
			this.home_style = HomeStyleEn.oneHalfStory;
			break;
		case "2 story":
			this.home_style = HomeStyleEn.twoStory;
			break;
		case "2.5 story":
			this.home_style = HomeStyleEn.twohalfStory;
			break;
		case "3 story":
			this.home_style = HomeStyleEn.threeStory;
			break;
		}
	}

	public String getHome_roof_material() {
		return this.home_roof_material.name();
	}

	public void setHome_roof_material(String home_roof_material) {
		this.home_roof_material = HomeRoofMaterialEn.valueOf(home_roof_material);
	}

	public String getGarage_type() {
		return this.garage_type.name();
	}

	public void setGarage_type(String garage_type) {
		this.garage_type = GarageTypeEn.valueOf(garage_type);
	}

	public String getNum_full_bath() {
		return num_full_bath.getNumFullBathValue();
	}

	public void setNum_full_bath(String num_full_bath) {
		switch (num_full_bath) {
		case "1":
			this.num_full_bath = NumFullBathEn.oneBath;
			break;
		case "2":
			this.num_full_bath = NumFullBathEn.twoBath;
			break;
		case "3":
			this.num_full_bath = NumFullBathEn.threeBath;
			break;
		case "more":
			this.num_full_bath = NumFullBathEn.moreBath;
			break;
		}
	}

	public String getNum_half_bath() {
		return num_half_bath.getNumHalfBathValue();
	}

	public void setNum_half_bath(String num_half_bath) {
		switch (num_half_bath) {
		case "1":
			this.num_half_bath = NumHalfBathEn.oneHalfBath;
			break;
		case "2":
			this.num_half_bath = NumHalfBathEn.twoHalfBath;
			break;
		case "3":
			this.num_half_bath = NumHalfBathEn.threeHalfBath;
			break;
		case "more":
			this.num_half_bath = NumHalfBathEn.moreHalfBath;
			break;
		}
	}

	public String getSwimming_pool() {
		return swimming_pool.name();
	}

	public void setSwimming_pool(String swimming_pool) {
		this.swimming_pool = SwimmingPoolEn.valueOf(swimming_pool);
	}

	public int getLocation_id_Property() {
		return location_id_Property;
	}

	public void setLocation_id_Property(int location_id_Property) {
		this.location_id_Property = location_id_Property;
	}

	public int getQuote_id() {
		return quote_id;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	public double getMonthly_premimum() {
		return monthly_premimum;
	}

	public void setMonthly_premimum(double monthly_premimum) {
		this.monthly_premimum = monthly_premimum;
	}

	public double getDwelling_coverage() {
		return dwelling_coverage;
	}

	public void setDwelling_coverage(double dwelling_coverage) {
		this.dwelling_coverage = dwelling_coverage;
	}

	public double getDetatched_structure() {
		return detatched_structure;
	}

	public void setDetatched_structure(double detatched_structure) {
		this.detatched_structure = detatched_structure;
	}

	public double getPersonal_property() {
		return personal_property;
	}

	public void setPersonal_property(double personal_property) {
		this.personal_property = personal_property;
	}

	public double getAdditional_living_exp() {
		return additional_living_exp;
	}

	public void setAdditional_living_exp(double additional_living_exp) {
		this.additional_living_exp = additional_living_exp;
	}

	public double getMedical_expenses() {
		return medical_expenses;
	}

	public void setMedical_expenses(double medical_expenses) {
		this.medical_expenses = medical_expenses;
	}

	public double getDeductible() {
		return deductible;
	}

	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}

	public int getLocation_id_Quote() {
		return location_id_Quote;
	}

	public void setLocation_id_Quote(int location_id_Quote) {
		this.location_id_Quote = location_id_Quote;
	}

	public String getUser_id_Quote() {
		return user_id_Quote;
	}

	public void setUser_id_Quote(String user_id_Quote) {
		this.user_id_Quote = user_id_Quote;
	}

}
