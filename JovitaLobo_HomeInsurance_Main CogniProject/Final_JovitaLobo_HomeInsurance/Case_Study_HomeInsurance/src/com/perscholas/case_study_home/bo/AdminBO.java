package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

import com.perscholas.case_study_home.dao.AdminDAO;
import com.perscholas.case_study_home.dao.UserDAO;
import com.perscholas.case_study_home.dao.ViewPolicyDAO;
import com.perscholas.case_study_home.models.AdminViewPolicy;
import com.perscholas.case_study_home.models.User;
import com.perscholas.case_study_home.models.ViewPolicy;

public class AdminBO {
	private String policy_status;
	private double policy_term;

	public int insertAdmin(User adminuser) throws SQLException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		int rowcountRegister = adminDAO.insertAdmin(adminuser);
		return rowcountRegister;
	}

	public boolean UpdatebyAdmintoCancelUserPolicy(AdminViewPolicy adminViewPolListitem)
			throws SQLException, IOException, ClassNotFoundException {
		AdminDAO admincancelsUserDAO = new AdminDAO();
		boolean rowcountRegister = admincancelsUserDAO.UpdatebyAdmintoCancelUserPolicy(adminViewPolListitem);
		return rowcountRegister;
	}

	public List<AdminViewPolicy> UpdatebyAdmintoRenewUserPolicy(AdminViewPolicy adminViewPolListitem)
			throws SQLException, IOException, ClassNotFoundException {
		AdminDAO adminrenewsUserDAO = new AdminDAO();
		List<AdminViewPolicy> adminRenewedPolList = adminrenewsUserDAO
				.UpdatebyAdmintoRenewUserPolicy(adminViewPolListitem);
		return adminRenewedPolList;
	}

	public boolean SearchUserforAdmin(String user_id) throws ClassNotFoundException, SQLException, IOException {
		AdminDAO adminDAO = new AdminDAO();
		boolean userstatus = adminDAO.SearchUserforAdmin(user_id);
		return userstatus;
	}

	public List<AdminViewPolicy> AdminViewAllPolicyByUser(String user_id) throws SQLException, IOException {
		AdminDAO adminViewPolDAO = new AdminDAO();
		List<AdminViewPolicy> adminViewPolList = adminViewPolDAO.AdminViewAllPolicyByUser(user_id);
		return adminViewPolList;
	}
}
