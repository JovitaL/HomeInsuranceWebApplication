package com.perscholas.case_study_home.junitTest;

import static org.junit.Assert.*;

import org.junit.Test; //
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.hasProperty;
import org.junit.runners.Parameterized.Parameters;
import com.perscholas.case_study_home.categoryInterface.ParameterizedTests;
import com.perscholas.case_study_home.dao.UserDAO;
import com.perscholas.case_study_home.enums.UserRoleEn;
import com.perscholas.case_study_home.models.User;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(Parameterized.class)
@Category(ParameterizedTests.class)
public class UserDAORegisterParameterizedJunitTest {
	
	
	  private String user_id;
	    private String password;
	    private String user_role;
	    UserDAO uDAO= new UserDAO();
	  
	    
    	
	
    public  UserDAORegisterParameterizedJunitTest(String user_id, String password, String user_role) {
	
	this.user_id = user_id;
	this.password = password;	
    this.user_role = user_role;
	
}

    
    @Parameterized.Parameters
	 public static Collection<Object[]> UserTestData() 
	 {
		 return Arrays.asList(new Object[][] {
			{"Jasmine7","Jasmine8","user"},
			{"Jovita3","Jovita4","user"}});
	 }	
	 
	 @Test
	 
	
  public void registerUserTest() throws SQLException, IOException  {
		 User u = new User(user_id,password,user_role);
		 
	  int rowcountRegister = uDAO.registerUser(u);
	  assertThat(rowcountRegister,is(not(-1)));//not error
	  assertThat(rowcountRegister,is(not(0)));//and inserted

	 }

}



