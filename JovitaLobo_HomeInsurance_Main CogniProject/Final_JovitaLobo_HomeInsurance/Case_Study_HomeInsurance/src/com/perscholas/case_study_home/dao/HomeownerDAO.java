package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import com.perscholas.case_study_home.models.Homeowner;

public class HomeownerDAO {

	public Integer insertHomeowner(Homeowner h) {
		Integer HomeownerID = null;
		String[] COL = { "homeowner_id" };
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String postQuery = "INSERT INTO `homeowner`(`first_name`, `last_name`,`birth_date`,`retired`,`SSN`,`email_id`,`user_id_homeowner`) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {

			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(postQuery, COL);
			stmt.setString(1, h.getFirst_name());
			stmt.setString(2, h.getLast_name());
			stmt.setDate(3, (Date) h.getBirth_date());
			stmt.setString(4, h.getRetired());
			stmt.setInt(5, h.getSSN());
			stmt.setString(6, h.getEmail_id());
			stmt.setString(7, h.getUser_id_homeowner());
			stmt.executeUpdate();
			HomeownerID = -1;
			result = stmt.getGeneratedKeys();
			if (result.next()) {
				HomeownerID = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		return HomeownerID;
	}

}
