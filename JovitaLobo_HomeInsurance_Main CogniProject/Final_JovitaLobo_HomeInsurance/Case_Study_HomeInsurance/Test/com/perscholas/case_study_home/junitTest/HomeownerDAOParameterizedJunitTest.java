package com.perscholas.case_study_home.junitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.perscholas.case_study_home.categoryInterface.ParameterizedTests;
import com.perscholas.case_study_home.dao.HomeownerDAO;
import com.perscholas.case_study_home.dao.LocationDAO;
import com.perscholas.case_study_home.enums.RetiredEn;
import com.perscholas.case_study_home.models.Homeowner;

@RunWith(Parameterized.class)
@Category(ParameterizedTests.class)

public class HomeownerDAOParameterizedJunitTest {
	private int homeowner_id;
	private String first_name;
	private String last_name;
	private Date birth_date;
	private String retired;
	private int SSN;
	private String email_id;
	private String user_id_homeowner;

HomeownerDAO hDAO=new HomeownerDAO();

public HomeownerDAOParameterizedJunitTest(String first_name, String last_name, Date birth_date, String retired, int SSN, String email_id,
		String user_id_homeowner) {

	this.first_name = first_name;
	this.last_name = last_name;
	this.birth_date = birth_date;
	this.retired = retired;
	this.SSN = SSN;
	this.email_id = email_id;
	this.user_id_homeowner = user_id_homeowner;
}

@Parameterized.Parameters
	 public static Collection<Object[]> UserTestData() throws ParseException 
	 {
		 
		 //Checking if records are getting inserted in my Homeowner table (insertHomeowner(Homeowner h) method)for user
		 return Arrays.asList(new Object[][] {
			{"Jasmine","Lobo",new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse("19/08/1988").getTime()),"Yes",950765900,"JasL@gmail.com","Jasmine7"},
			{"Jasmine","Mascarenhas",new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse("25/05/1970").getTime()),"No",830161000,"JasmineM@gmail.com","Jasmine5"}});
	 }	


	@Test
	public void insertHomeownertest() {
		Homeowner h = new Homeowner(first_name,last_name,birth_date,retired,SSN,email_id,user_id_homeowner);
		
		int HomeownerID = hDAO.insertHomeowner(h);
		
		 assertThat(HomeownerID,is(not(-1)));
	}


	

}
