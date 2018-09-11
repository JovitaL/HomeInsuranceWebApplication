package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.case_study_home.models.AdminViewPolicy;
import com.perscholas.case_study_home.models.User;

public class AdminDAO {
	public int insertAdmin(User adminuser) throws SQLException, IOException {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String qString = "INSERT INTO `USER` (`user_id`,`password`,`user_role`) VALUES(?,?,?)";
		int rowInserted = -1;
		try {
			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(qString);
			stmt.setString(1, adminuser.getUser_id());
			stmt.setString(2, adminuser.getPassword());
			stmt.setString(3, adminuser.getUserRole());
			rowInserted = stmt.executeUpdate();
			if (rowInserted > 0) {
				String registeredID = adminuser.getUser_id();
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

	public boolean UpdatebyAdmintoCancelUserPolicy(AdminViewPolicy adminViewPolListitem)
			throws SQLException, ClassNotFoundException, IOException {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "UPDATE policy SET policy_status = 'CANCELLED' , policy_end_date= policy_start_date "
				+ "WHERE policy_number = ?";

		MySqlConnection connection = new MySqlConnection();
		Conn = connection.getConnection();
		stmt = Conn.prepareStatement(sql);
		stmt.setInt(1, adminViewPolListitem.getPolicy_number());
		boolean rowUpdated = stmt.executeUpdate() > 0;
		return rowUpdated;
	}

	public List<AdminViewPolicy> UpdatebyAdmintoRenewUserPolicy(AdminViewPolicy adminViewPolListitem)
			throws SQLException, ClassNotFoundException, IOException {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<AdminViewPolicy> adminRenewedPolList = null;
		String sql = "UPDATE policy SET policy_status = 'RENEWED' ,policy_term=2,policy_end_date= DATE_ADD(policy_end_date,INTERVAL 1 YEAR) "
				+ "WHERE policy_number = ?";

		MySqlConnection connection = new MySqlConnection();
		Conn = connection.getConnection();
		stmt = Conn.prepareStatement(sql);
		stmt.setInt(1, adminViewPolListitem.getPolicy_number());
		boolean rowUpdated = stmt.executeUpdate() > 0;		
		if (rowUpdated) {
			adminRenewedPolList = SelectUpdatedRenewUserPolicy(adminViewPolListitem);
		}
		return adminRenewedPolList;
	}

	public List<AdminViewPolicy> SelectUpdatedRenewUserPolicy(AdminViewPolicy adminViewPolListitem) {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		String getQuery = "SELECT policy_number,policy_start_date,policy_end_date,policy_term,policy_status,quote_id_Policy "
				+ "FROM policy " + "WHERE policy_number = ?";

		List<AdminViewPolicy> adminRenewedPolList = null;
		MySqlConnection connection = new MySqlConnection();
		try {
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(getQuery);
			stmt.setInt(1, adminViewPolListitem.getPolicy_number());
			result = stmt.executeQuery();
			adminRenewedPolList = new ArrayList<AdminViewPolicy>();
			while (result.next()) {
				AdminViewPolicy adminRenewPol = new AdminViewPolicy();
				adminRenewPol.setPolicy_number(result.getInt(1));
				adminRenewPol.setPolicy_start_date(result.getDate(2));
				adminRenewPol.setPolicy_end_date(result.getDate(3));
				adminRenewPol.setPolicy_term(result.getDouble(4));
				adminRenewPol.setPolicy_status(result.getString(5));
				adminRenewPol.setQuote_id_Policy(result.getInt(6));
				adminRenewedPolList.add(adminRenewPol);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminRenewedPolList;
	}

	public boolean SearchUserforAdmin(String user_id) throws SQLException, ClassNotFoundException, IOException {
		boolean status = false;
		Connection Conn = null;
		PreparedStatement ps = null;
		ResultSet rs1 = null;
		try {
			MySqlConnection connection = new MySqlConnection();
			Conn = connection.getConnection();
			String qString = "Select* from USER where user_id = ?";
			ps = Conn.prepareStatement(qString);
			ps.setString(1, user_id);
			rs1 = ps.executeQuery();
			status = rs1.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rs1.close();
		Conn.close();
		return status;
	}

	public List<AdminViewPolicy> AdminViewAllPolicyByUser(String user_id) {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		AdminViewPolicy adminViewPol = null;
		String getQuery = "SELECT p.policy_number,p.policy_start_date,p.policy_end_date,p.policy_term,p.policy_status,p.quote_id_Policy "
				+ "FROM policy p " + "JOIN (Select * from quote where user_id_Quote=?) q "
				+ "ON p.quote_id_Policy= q.quote_id ";
		List<AdminViewPolicy> adminViewPolList = null;
		MySqlConnection connection = new MySqlConnection();
		try {
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(getQuery);
			stmt.setString(1, user_id);
			result = stmt.executeQuery();
			adminViewPolList = new ArrayList<AdminViewPolicy>();
			while (result.next()) {
				adminViewPol = new AdminViewPolicy();
				adminViewPol.setPolicy_number(result.getInt(1));
				adminViewPol.setPolicy_start_date(result.getDate(2));
				adminViewPol.setPolicy_end_date(result.getDate(3));
				adminViewPol.setPolicy_term(result.getDouble(4));
				adminViewPol.setPolicy_status(result.getString(5));
				adminViewPol.setQuote_id_Policy(result.getInt(6));
				adminViewPolList.add(adminViewPol);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminViewPolList;
	}
}
