package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.case_study_home.models.RetrieveQuote;

public class RetrieveQuoteDAO {
	public List<RetrieveQuote> RetrieveAllQuoteByUser(String user_id) {

		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		RetrieveQuote retquo = null;
		String getQuery = "SELECT l.location_id,l.residence_type,l.address_line_1,l.address_line_2,l.city,l.state,l.zip,l.residence_use,l.user_id_location,p.property_id"
				+ ",p.market_value,p.built_year,p.home_square_foot,p.home_style,p.home_roof_material,p.garage_type,p.num_full_bath,p.num_half_bath,p.swimming_pool,p.location_id_Property "
				+ ",h.homeowner_id,h.first_name,h.last_name,h.birth_date,h.retired,h.SSN,h.email_id,h.user_id_homeowner,q.quote_id,q.monthly_premimum,q.dwelling_coverage,q.detatched_structure,q.personal_property,q.additional_living_exp,q.medical_expenses,q.deductible,q.location_id_Quote,q.user_id_Quote "
				+ "FROM (select * from location Where user_id_location = ?) l " + "JOIN property p "
				+ "ON l.location_id = p.location_id_Property " + "JOIN homeowner h "
				+ "ON l.user_id_location = h.user_id_homeowner " + "JOIN quote q "
				+ "ON l.location_id = q.location_id_Quote group by q.quote_id ";

		List<RetrieveQuote> retquoList = null;
		MySqlConnection connection = new MySqlConnection();
		try {
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(getQuery);
			stmt.setString(1, user_id);
			result = stmt.executeQuery();
			retquoList = new ArrayList<RetrieveQuote>();
			while (result.next()) {
				retquo = new RetrieveQuote();

				retquo.setLocation_id(result.getInt(1));
				retquo.setResidence_type(result.getString(2));
				retquo.setAddress_line_1(result.getString(3));
				retquo.setAddress_line_2(result.getString(4));
				retquo.setCity(result.getString(5));
				retquo.setState(result.getString(6));
				retquo.setZip(result.getInt(7));
				retquo.setResidence_use(result.getString(8));
				retquo.setUser_id_location(result.getString(9));
				retquo.setProperty_id(result.getInt(10));
				retquo.setMarket_value(result.getDouble(11));
				retquo.setBuilt_year(result.getInt(12));
				retquo.setHome_square_foot(result.getDouble(13));
				retquo.setHome_style(result.getString(14));
				retquo.setHome_roof_material(result.getString(15));
				retquo.setGarage_type(result.getString(16));
				retquo.setNum_full_bath(result.getString(17));
				retquo.setNum_half_bath(result.getString(18));
				retquo.setSwimming_pool(result.getString(19));
				retquo.setLocation_id_Property(result.getInt(20));
				retquo.setHomeowner_id(result.getInt(21));
				retquo.setFirst_name(result.getString(22));
				retquo.setLast_name(result.getString(23));
				retquo.setBirth_date(result.getDate(24));
				retquo.setRetired(result.getString(25));
				retquo.setSSN(result.getInt(26));
				retquo.setEmail_id(result.getString(27));
				retquo.setUser_id_homeowner(result.getString(28));
				retquo.setQuote_id(result.getInt(29));
				retquo.setMonthly_premimum(result.getDouble(30));
				retquo.setDwelling_coverage(result.getDouble(31));
				retquo.setDetatched_structure(result.getDouble(32));
				retquo.setPersonal_property(result.getDouble(33));
				retquo.setAdditional_living_exp(result.getDouble(34));
				retquo.setMedical_expenses(result.getDouble(35));
				retquo.setDeductible(result.getDouble(36));
				retquo.setLocation_id_Quote(result.getInt(37));
				retquo.setUser_id_Quote(result.getString(38));
				retquoList.add(retquo);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return retquoList;
	}
}
