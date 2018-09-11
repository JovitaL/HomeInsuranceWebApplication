package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;

import com.perscholas.case_study_home.dao.UserDAO;
import com.perscholas.case_study_home.models.User;

public class UserBO {
	public int registerUser(User u) throws SQLException, IOException {
		UserDAO uDAO = new UserDAO();
		int rowcountRegister = uDAO.registerUser(u);
		return rowcountRegister;
	}

	public boolean checkLogin(String user_id, String password)
			throws ClassNotFoundException, SQLException, IOException {
		UserDAO uDAO = new UserDAO();
		boolean loginstatus = uDAO.checkLogin(user_id, password);
		return loginstatus;
	}
}