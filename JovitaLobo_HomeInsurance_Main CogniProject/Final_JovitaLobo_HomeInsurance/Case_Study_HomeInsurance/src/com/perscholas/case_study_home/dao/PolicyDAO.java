package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.perscholas.case_study_home.models.Policy;

public class PolicyDAO {
	public int insertPolicyByStartDate(Policy p) {
		Integer PolicyNum = null;
		String[] COL = { "policy_number" };
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String postQuery = "INSERT INTO `policy`(`policy_start_date`, `policy_end_date`,`policy_term`,`policy_status`,`quote_id_Policy`) "
				+ "VALUES(?, ?, ?, ?, ?)";
		try {

			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(postQuery, COL);
			stmt.setDate(1, (Date) p.getPolicy_start_date());
			stmt.setDate(2, (Date) p.getPolicy_end_date());
			stmt.setDouble(3, p.getPolicy_term());
			stmt.setString(4, p.getPolicy_status());
			stmt.setInt(5, p.getQuote_id_Policy());
			stmt.executeUpdate();
			PolicyNum = -1;
			result = stmt.getGeneratedKeys();
			if (result.next()) {
				PolicyNum = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		return PolicyNum;
	}
}