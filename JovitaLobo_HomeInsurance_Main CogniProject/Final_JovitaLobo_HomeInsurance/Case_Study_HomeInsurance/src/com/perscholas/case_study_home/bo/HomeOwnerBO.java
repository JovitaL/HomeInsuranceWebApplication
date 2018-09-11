package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;

import com.perscholas.case_study_home.dao.HomeownerDAO;
import com.perscholas.case_study_home.models.Homeowner;

public class HomeOwnerBO {
	public Integer insertHomeowner(Homeowner h) throws SQLException, IOException {
		HomeownerDAO ownerDAO = new HomeownerDAO();
		int HomeownerID = ownerDAO.insertHomeowner(h);
		return HomeownerID;
	}
}