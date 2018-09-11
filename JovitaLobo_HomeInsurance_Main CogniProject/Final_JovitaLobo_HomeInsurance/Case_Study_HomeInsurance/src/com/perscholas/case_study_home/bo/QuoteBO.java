package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;

import com.perscholas.case_study_home.dao.PropertyDAO;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Property;
import com.perscholas.case_study_home.models.Quote;
import com.perscholas.case_study_home.dao.QuoteDAO;

public class QuoteBO {

	private double monthly_premimum;
	private double dwelling_coverage;
	private double homevalue;
	private double detatched_structure;
	private double personal_property;
	private double additional_living_exp;
	private double medical_expenses;
	private double deductible;
	Quote q = new Quote();

	public Quote calcinsertQuote(String userid, Location l, Property p) throws SQLException, IOException {
		QuoteDAO quoteDAO = new QuoteDAO();
		homevalue = 120 * p.getHome_square_foot();
		Calendar now = Calendar.getInstance();
		int agehome = now.get(Calendar.YEAR) - p.getBuilt_year();
		if (agehome < 5) {
			homevalue -= .1 * homevalue;
		} else if (agehome < 10) {
			homevalue -= .2 * homevalue;
		} else if (agehome < 20) {
			homevalue -= .3 * homevalue;
		} else if (agehome > 20) {
			homevalue -= .5 * homevalue;
		}

		dwelling_coverage = homevalue + .5 * p.getMarket_value();

		detatched_structure = .1 * dwelling_coverage;
		personal_property = .6 * dwelling_coverage;
		additional_living_exp = .2 * dwelling_coverage;
		medical_expenses = 5000;
		deductible = .01 * p.getMarket_value();
		monthly_premimum = (5 * (dwelling_coverage / 1000)) / 12;

		// monthly_premimum = (5*(p.getMarket_value()/1000))/12;
		switch (l.getResidence_type()) {
		case "SingleFamilyHome": {
			monthly_premimum += .5 * monthly_premimum;
			break;
		}
		case "Condo": {
			monthly_premimum += .06 * monthly_premimum;
			break;
		}
		case "Townhouse": {
			monthly_premimum += .07 * monthly_premimum;
			break;
		}
		case "Rowhouse": {
			monthly_premimum += .07 * monthly_premimum;
			break;
		}
		case "Duplex": {
			monthly_premimum += .06 * monthly_premimum;
			break;
		}
		case "Apartment": {
			monthly_premimum += .06 * monthly_premimum;
			break;
		}
		}
		monthly_premimum = Math.round(monthly_premimum * 100) / 100;
		Quote q = new Quote(monthly_premimum, dwelling_coverage, detatched_structure, personal_property,
				additional_living_exp, medical_expenses, deductible, l.getLocation_id(), l.getUser_id_location());
		int QuoteID = quoteDAO.calcinsertQuote(userid, l, q);
		q.setQuote_id(QuoteID);
		return q;
	}
}