package com.perscholas.case_study_home.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.perscholas.case_study_home.models.RetrieveQuote;
import com.perscholas.case_study_home.models.ViewPolicy;
import com.perscholas.case_study_home.models.AdminViewPolicy;

public class ViewPolicyDAO {
	public List<ViewPolicy> ViewAllPolicyByUser(String user_id) {
		Connection Conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		ViewPolicy viewPol = null;
		String getQuery = "SELECT p.policy_number,p.policy_start_date,p.policy_end_date,p.policy_term,p.policy_status,p.quote_id_Policy "
				+ "FROM policy p " + "JOIN (Select * from quote where user_id_Quote=?) q "
				+ "ON p.quote_id_Policy= q.quote_id  group by q.quote_id ";

		List<ViewPolicy> viewPolList = null;
		MySqlConnection connection = new MySqlConnection();
		try {
			Conn = connection.getConnection();
			stmt = Conn.prepareStatement(getQuery);
			stmt.setString(1, user_id);
			result = stmt.executeQuery();
			viewPolList = new ArrayList<ViewPolicy>();
			while (result.next()) {
				viewPol = new ViewPolicy();
				viewPol.setPolicy_number(result.getInt(1));
				viewPol.setPolicy_start_date(result.getDate(2));
				viewPol.setPolicy_end_date(result.getDate(3));
				viewPol.setPolicy_term(result.getDouble(4));
				viewPol.setPolicy_status(result.getString(5));
				viewPol.setQuote_id_Policy(result.getInt(6));
				viewPolList.add(viewPol);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return viewPolList;
	}

}
