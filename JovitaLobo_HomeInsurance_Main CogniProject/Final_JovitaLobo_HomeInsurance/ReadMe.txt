


For admin:(Just an Assumption as this case wont happen for admin in real scenario)
(Assumptions: The admin can be registered using Register page where his userid,password,re-entered password,userrole is equal to "admin". After registering or having his entry in User table 
I can login using 'admin' as userid and password)


For Database:
Please run the  query present in 'Homeinsurance_MySql_query' file in MySql which contains my schema as well as tables.


For Project:
My entry Jsp page is 'StartPage.jsp'.

Enum fields:
I have set Datatype as ENUM for columns like residence_type where  certain set of values had to be chosen. Just for your information.



For Tests:
 Tests present in Java Resources inside package as follows:

1)com.perscholas.case_study_home.junitTest
The above package contains independent Junit test for some of my DAO's in parameterised way


2)com.perscholas.case_study_home.Selenium
The above package contains my Selenium script trying to buy policy and checking for policy confirmation page




