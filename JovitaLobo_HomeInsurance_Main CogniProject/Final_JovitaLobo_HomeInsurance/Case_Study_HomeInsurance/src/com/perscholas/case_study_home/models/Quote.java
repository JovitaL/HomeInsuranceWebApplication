package com.perscholas.case_study_home.models;

public class Quote {
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

	public Quote() {

		this.quote_id = 0;
		this.monthly_premimum = 0.0;
		this.dwelling_coverage = 0.0;
		this.detatched_structure = 0.0;
		this.personal_property = 0.0;
		this.additional_living_exp = 0.0;
		this.medical_expenses = 0.0;
		this.deductible = 0.0;
		this.location_id_Quote = 0;
		this.user_id_Quote = "";
	}

	public Quote(int quote_id, double monthly_premimum, double dwelling_coverage, double detatched_structure,
			double personal_property, double additional_living_exp, double medical_expenses, double deductible,
			int location_id_Quote, String user_id_Quote) {
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

	public Quote(double monthly_premimum, double dwelling_coverage, double detatched_structure,
			double personal_property, double additional_living_exp, double medical_expenses, double deductible,
			int location_id_Quote, String user_id_Quote) {
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
