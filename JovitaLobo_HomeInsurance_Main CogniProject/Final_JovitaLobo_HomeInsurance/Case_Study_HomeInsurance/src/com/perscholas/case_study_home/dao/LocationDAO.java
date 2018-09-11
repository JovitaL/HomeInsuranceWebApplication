package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import com.perscholas.case_study_home.models.Location;

public class LocationDAO {
	public Integer insertLocation(Location l) {
		Integer locationID = null;
		String[] COL = { "location_id" };
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String postQuery = "INSERT INTO `location`(`residence_type`, `address_line_1`,`address_line_2`,`city`,`state`,`zip`,`residence_use`,`user_id_location`) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		try {

			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(postQuery, COL);

			stmt.setString(1, l.getResidence_type());
			stmt.setString(2, l.getAddress_line_1());
			stmt.setString(3, l.getAddress_line_2());
			stmt.setString(4, l.getCity());
			stmt.setString(5, l.getState());
			stmt.setInt(6, l.getZip());
			stmt.setString(7, l.getResidence_use());
			stmt.setString(8, l.getUser_id_location());
			stmt.executeUpdate();
			locationID = -1;
			result = stmt.getGeneratedKeys();
			if (result.next()) {
				locationID = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		return locationID;
	}
}
