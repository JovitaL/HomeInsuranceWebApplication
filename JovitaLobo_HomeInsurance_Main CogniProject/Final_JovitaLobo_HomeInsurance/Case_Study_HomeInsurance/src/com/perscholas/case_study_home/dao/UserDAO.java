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

import com.perscholas.case_study_home.models.User;

public class UserDAO {
	public int rowInserted;
	int rowcountRegister;

	// -------------------------Register-------------------------------------------------------------
	public int registerUser(User u) throws SQLException, IOException {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String qString = "INSERT INTO `USER` (`user_id`,`password`,`user_role`) VALUES(?,?,?)";
		int rowInserted = -1;
		try {
			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(qString);
			stmt.setString(1, u.getUser_id());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getUserRole());
			rowInserted = stmt.executeUpdate();
			if (rowInserted > 0) {
				String registeredID = u.getUser_id();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (Conn != null) {
				Conn.close();
			}
		}
		return rowInserted; // it should be greater than 0
	}
	// ---------------------------------------end---register---------------------------------------

	// ---------------------------------------login-page-----------------------------------------

	public boolean checkLogin(String user_id, String password)
			throws SQLException, ClassNotFoundException, IOException {
		boolean status = false;
		Connection Conn = null;
		PreparedStatement ps = null;
		ResultSet rs1 = null;
		try {
			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			String qString = "Select user_id,password,user_role from USER where user_id = ? and password =?";
			ps = Conn.prepareStatement(qString);
			ps.setString(1, user_id);
			ps.setString(2, password);
			rs1 = ps.executeQuery();
			status = rs1.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rs1.close();
		Conn.close();
		return status;
	}
}