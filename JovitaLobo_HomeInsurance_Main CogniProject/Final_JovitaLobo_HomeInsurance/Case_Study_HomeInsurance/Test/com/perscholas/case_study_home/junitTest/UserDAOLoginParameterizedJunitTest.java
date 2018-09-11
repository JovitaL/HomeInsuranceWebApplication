package com.perscholas.case_study_home.junitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.perscholas.case_study_home.categoryInterface.ParameterizedTests;
import com.perscholas.case_study_home.dao.UserDAO;
import com.perscholas.case_study_home.models.User;

@RunWith(Parameterized.class)
@Category(ParameterizedTests.class)
public class UserDAOLoginParameterizedJunitTest {
	
	
	  private String user_id;
	    private String password;
	    private String user_role;
	    UserDAO uDAO= new UserDAO();
	  
	    
    	
	
    public  UserDAOLoginParameterizedJunitTest(String user_id, String password) {
	
	this.user_id = user_id;
	this.password = password;	
   
	
}

    
    @Parameterized.Parameters
	 public static Collection<Object[]> UserTestData() 
	 {
		 return Arrays.asList(new Object[][] {
			{"Jasmine1","Jasmine2"},
			{"Jasmine10","Jasmine4"}});
	 }	
	 
	 @Test
	 
	
  public void checkLoginTest() throws SQLException, IOException, ClassNotFoundException  {
		 User u = new User(user_id,password);
		 
	  boolean status = uDAO.checkLogin(user_id,password) ;
	  assertThat(status,is(not(false)));//not error
	 
	 }}

