package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Quote;

public class QuoteDAO {
	public int calcinsertQuote(String userid, Location l, Quote q) throws SQLException, IOException {
		Integer QuoteID = null;
		String[] COL = { "quote_id" };
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String postQuery = "INSERT INTO `quote`(`monthly_premimum`, `dwelling_coverage`,`detatched_structure`,`personal_property`,`additional_living_exp`,`medical_expenses`,`deductible`,`location_id_Quote`,`user_id_Quote`) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {

			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(postQuery, COL);
			stmt.setDouble(1, q.getMonthly_premimum());
			stmt.setDouble(2, q.getDwelling_coverage());
			stmt.setDouble(3, q.getDetatched_structure());
			stmt.setDouble(4, q.getPersonal_property());
			stmt.setDouble(5, q.getAdditional_living_exp());
			stmt.setDouble(6, q.getMedical_expenses());
			stmt.setDouble(7, q.getDeductible());
			stmt.setInt(8, q.getLocation_id_Quote());
			stmt.setString(9, q.getUser_id_Quote());
			stmt.executeUpdate();
			QuoteID = -1;
			result = stmt.getGeneratedKeys();
			if (result.next()) {
				QuoteID = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		return QuoteID;
	}
}