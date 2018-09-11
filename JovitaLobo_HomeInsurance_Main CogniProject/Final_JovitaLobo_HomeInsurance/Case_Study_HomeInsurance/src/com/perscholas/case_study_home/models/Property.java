package com.perscholas.case_study_home.models;

import com.perscholas.case_study_home.enums.GarageTypeEn;
import com.perscholas.case_study_home.enums.HomeRoofMaterialEn;
import com.perscholas.case_study_home.enums.HomeStyleEn;
import com.perscholas.case_study_home.enums.NumFullBathEn;
import com.perscholas.case_study_home.enums.NumHalfBathEn;
import com.perscholas.case_study_home.enums.SwimmingPoolEn;
import com.perscholas.case_study_home.enums.UserRoleEn;

public class Property {

	private int property_id;
	private double market_value;
	private int built_year; // YEAR(4)
	private double home_square_foot;
	private HomeStyleEn home_style; // enum --
	private HomeRoofMaterialEn home_roof_material;// enum --
	private GarageTypeEn garage_type;// enum --
	private NumFullBathEn num_full_bath;// enum --
	private NumHalfBathEn num_half_bath;// enum --
	private SwimmingPoolEn swimming_pool;// enum --
	int location_id_Property;

	public Property(int property_id, double market_value, int built_year, double home_square_foot, String home_style,
			String home_roof_material, String garage_type, String num_full_bath, String num_half_bath,
			String swimming_pool, int location_id_Property) {

		this.property_id = property_id;
		this.market_value = market_value;
		this.built_year = built_year;
		this.home_square_foot = home_square_foot;
		this.home_style = HomeStyleEn.valueOf(home_style);
		this.home_roof_material = HomeRoofMaterialEn.valueOf(home_roof_material);
		this.garage_type = GarageTypeEn.valueOf(garage_type);
		this.num_full_bath = NumFullBathEn.valueOf(num_full_bath);
		this.num_half_bath = NumHalfBathEn.valueOf(num_half_bath);
		this.swimming_pool = SwimmingPoolEn.valueOf(swimming_pool);
		this.location_id_Property = location_id_Property;
	}

	public Property(double market_value, int built_year, double home_square_foot, String home_style,
			String home_roof_material, String garage_type, String num_full_bath, String num_half_bath,
			String swimming_pool, int location_id_Property) {
		this.market_value = market_value;
		this.built_year = built_year;
		this.home_square_foot = home_square_foot;
		this.home_style = HomeStyleEn.valueOf(home_style);
		this.home_roof_material = HomeRoofMaterialEn.valueOf(home_roof_material);
		this.garage_type = GarageTypeEn.valueOf(garage_type);
		this.num_full_bath = NumFullBathEn.valueOf(num_full_bath);
		this.num_half_bath = NumHalfBathEn.valueOf(num_half_bath);
		this.swimming_pool = SwimmingPoolEn.valueOf(swimming_pool);
		this.location_id_Property = location_id_Property;
	}

	public String getNum_half_bath() {
		return num_half_bath.getNumHalfBathValue();
	}

	public void setNum_half_bath(String num_half_bath) {
		this.num_half_bath = NumHalfBathEn.valueOf(num_half_bath);
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

	// public String getHome_styleName() {
	// return home_style.name();
	// }
	public void setHome_style(String home_style) {
		this.home_style = HomeStyleEn.valueOf(home_style);
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
		this.num_full_bath = NumFullBathEn.valueOf(num_full_bath);
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
}
