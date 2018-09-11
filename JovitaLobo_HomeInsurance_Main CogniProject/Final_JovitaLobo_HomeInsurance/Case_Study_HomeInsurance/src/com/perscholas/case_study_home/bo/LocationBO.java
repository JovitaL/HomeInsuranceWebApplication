package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;

import com.perscholas.case_study_home.dao.LocationDAO;
import com.perscholas.case_study_home.dao.UserDAO;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.User;

public class LocationBO {
	public Integer insertLocation(Location l) throws SQLException, IOException {
		LocationDAO locDAO = new LocationDAO();
		int locationID = locDAO.insertLocation(l);
		return locationID;
	}
}