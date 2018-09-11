package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.perscholas.case_study_home.models.Property;

public class PropertyDAO {

	public Integer insertProperty(Property p) {
		Integer PropertyID = null;
		String[] COL = { "property_id" };
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String postQuery = "INSERT INTO `property`(`market_value`, `built_year`,`home_square_foot`,`home_style`,`home_roof_material`,`garage_type`,`num_full_bath`,`num_half_bath`,`swimming_pool`,`location_id_Property`) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {

			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(postQuery, COL);
			stmt.setDouble(1, p.getMarket_value());
			stmt.setInt(2, p.getBuilt_year());
			stmt.setDouble(3, p.getHome_square_foot());
			stmt.setString(4, p.getHome_style());
			stmt.setString(5, p.getHome_roof_material());
			stmt.setString(6, p.getGarage_type());
			stmt.setString(7, p.getNum_full_bath());
			stmt.setString(8, p.getNum_half_bath());
			stmt.setString(9, p.getSwimming_pool());
			stmt.setInt(10, p.getLocation_id_Property());
			stmt.executeUpdate();
			PropertyID = -1;
			result = stmt.getGeneratedKeys();
			if (result.next()) {
				PropertyID = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		return PropertyID;
	}
}