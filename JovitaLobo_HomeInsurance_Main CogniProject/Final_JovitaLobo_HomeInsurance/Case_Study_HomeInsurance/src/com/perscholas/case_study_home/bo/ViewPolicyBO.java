package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.perscholas.case_study_home.dao.RetrieveQuoteDAO;
import com.perscholas.case_study_home.dao.ViewPolicyDAO;
import com.perscholas.case_study_home.models.RetrieveQuote;
import com.perscholas.case_study_home.models.ViewPolicy;
import com.perscholas.case_study_home.models.AdminViewPolicy;

public class ViewPolicyBO {
	public List<ViewPolicy> ViewAllPolicyByUser(String user_id) throws SQLException, IOException {
		ViewPolicyDAO viewPolDAO = new ViewPolicyDAO();
		List<ViewPolicy> viewPolList = viewPolDAO.ViewAllPolicyByUser(user_id);
		return viewPolList;
	}
}