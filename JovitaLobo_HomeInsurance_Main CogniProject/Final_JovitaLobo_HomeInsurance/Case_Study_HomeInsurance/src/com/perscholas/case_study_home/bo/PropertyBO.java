package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;

import com.perscholas.case_study_home.dao.PropertyDAO;
import com.perscholas.case_study_home.models.Property;

public class PropertyBO {
	public Integer insertProperty(Property p) throws SQLException, IOException {
		PropertyDAO propDAO = new PropertyDAO();
		int PropertyID = propDAO.insertProperty(p);
		return PropertyID;
	}
}