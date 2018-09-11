package com.perscholas.case_study_home.junitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.perscholas.case_study_home.categoryInterface.ParameterizedTests;
import com.perscholas.case_study_home.dao.LocationDAO;
import com.perscholas.case_study_home.enums.ResidenceTypeEn;
import com.perscholas.case_study_home.enums.ResidenceUseEn;
import com.perscholas.case_study_home.models.Location;

@RunWith(Parameterized.class)
@Category(ParameterizedTests.class)
public class LocationDAOParameterizedJunitTest {
	
	int location_id;
private	String residence_type; 
private	String address_line_1;
private	String address_line_2;
private	String city;
private String state;
private	int zip;
private	String residence_use;
private	String user_id_location;

LocationDAO lDAO=new LocationDAO();

public LocationDAOParameterizedJunitTest( String residence_type, String address_line_1, String address_line_2,
		String city, String state, int zip, String residence_use, String user_id_location) {	
	this.residence_type = residence_type;
	this.address_line_1 = address_line_1;
	this.address_line_2 = address_line_2;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.residence_use = residence_use;
	this.user_id_location = user_id_location;
}


@Parameterized.Parameters
	 public static Collection<Object[]> UserTestData() 
	 {
		 //Checking if records are getting inserted in my Location table (insertLocation(Location l) method)for user
		 return Arrays.asList(new Object[][] {
			{"Condo","112 Ervay","Downtown Dallas","Irving","Texas",8483,"RentalProperty","Jasmine7"},
			{"Townhouse","1806 Meadow Creek","Near NorthLake College","Irving","Texas",7234,"Secondary","Jasmine5"}});
	 }	


	@Test
	public void insertLocationtest() {
		Location location = new Location(residence_type,address_line_1,address_line_2,
				city,state,zip,residence_use,user_id_location);
		int locationID=lDAO.insertLocation(location) ;
		 assertThat(locationID,is(not(-1)));
	}

}
