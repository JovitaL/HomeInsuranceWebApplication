package com.perscholas.case_study_home.Selenium;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBuyPolicyTest {


    WebDriver driver;
	
    @BeforeClass
	    public static void setProperty() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\selenium_chrome\\chromedriver.exe");
    }

	    
	    @Before
    public void setUp() {
	
	        driver = new ChromeDriver();
//	        action = new Actions(driver);
	        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/Case_Study_HomeInsurance/StartPage.jsp");
		//Thread.sleep(1000);
		WebElement UserId=driver.findElement(By.name("UserId"));
		UserId.sendKeys("Jasmine3"); //User Id already exists in my table
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("Jasmine4"); //password for the corresponding user id already exists in my table
		WebElement login=driver.findElement(By.xpath("/html/body/center/form/input[3]"));
		login.click();///html/body/center/form/input[3]
	
		WebElement getQuote=driver.findElement(By.xpath("/html/body/center/center[2]/input[1]"));///html/body/center/center[2]/input[1]
		getQuote.click();
		Select selResidenceType=new Select( driver.findElement(By.name("Residence Type")));
		selResidenceType.selectByVisibleText("Condo");
		
		WebElement Address1=driver.findElement(By.name("AddressLine1"));
		Address1.sendKeys("Hello11");
		WebElement State=driver.findElement(By.name("State"));
		State.sendKeys("Hello11");
		WebElement city=driver.findElement(By.name("City"));
		city.sendKeys("Hello11");
		WebElement zip=driver.findElement(By.name("Zip"));
		zip.sendKeys("5756");
		
		Select selResidenceUse=new Select( driver.findElement(By.name("Residence Use")));
		selResidenceUse.selectByVisibleText("RentalProperty");
		WebElement continuehomeinf=driver.findElement(By.xpath("/html/body/center/form/center[2]/input[6]"));
		continuehomeinf.click();
		
		WebElement firstN=driver.findElement(By.name("FirstName"));
		firstN.sendKeys("Hello11");
		WebElement LastN=driver.findElement(By.name("LastName"));
		LastN.sendKeys("Hello11");
		WebElement Datebirth=driver.findElement(By.name("DateOfBirth"));
		Datebirth.sendKeys("08/03/1980");
		//Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.name("retired"));
		list.get(1).click();
	//	Thread.sleep(1000);
		WebElement SSN=driver.findElement(By.name("SSN"));
		SSN.sendKeys("141460091");
	//	Thread.sleep(1000);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Hello11@gmail.com");
	//	Thread.sleep(2000);
		WebElement continue2=driver.findElement(By.xpath("/html/body/center/form/center[2]/input[8]"));
		continue2.click();
	//	Thread.sleep(1000);
	//	assertTrue(driver.findElement(By.xpath("/html/body/center/form/center[2]/input[1]")).isDisplayed());
		WebElement marketValue=driver.findElement(By.name("market value"));
		marketValue.sendKeys("350000");
		WebElement builtYear=driver.findElement(By.name("built year"));
		builtYear.sendKeys("2005");
		WebElement Squarefoot=driver.findElement(By.name("home square foot"));
		Squarefoot.sendKeys("1500");
		//Thread.sleep(1000);
		Select DwelStyle=new Select(driver.findElement(By.name("Home Style")));
		DwelStyle.selectByVisibleText("1.5 story");
	//	Thread.sleep(1000);
		Select RoofMaterial=new Select(driver.findElement(By.name("Home Roof Material")));
		RoofMaterial.selectByValue("Rubber");
		Select GarageType=new Select(driver.findElement(By.name("Garage Type")));
		GarageType.selectByIndex(2);
		//Thread.sleep(1000);
		Select NumFullbaths=new Select(driver.findElement(By.name("NumFullBath")));
		NumFullbaths.selectByValue("threeBath");
	//	Thread.sleep(1000);
		Select Numhalfbaths=new Select(driver.findElement(By.name("NumHalfBath")));
		Numhalfbaths.selectByIndex(2);
		List<WebElement> swimpool=driver.findElements(By.name("swimming pool"));
		swimpool.get(1).click();//select "No"
		//Thread.sleep(1000);
		WebElement continueproperty=driver.findElement(By.xpath("/html/body/center/form/center[2]/input[6]"));
		continueproperty.click();
//		assertTrue(driver.findElement(By.xpath("/html/body/center[2]/h3")).isDisplayed());
		WebElement proceedBuyButton=driver.findElement(By.xpath("/html/body/center[2]/form/input"));
		proceedBuyButton.click();
//		assertTrue(driver.findElement(By.xpath("/html/body/h3")).isDisplayed());
		WebElement clickquotedet=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[9]/form/input"));
		clickquotedet.click();
//		assertTrue(driver.findElement(By.xpath("/html/body/h1")).isDisplayed());
		WebElement buyquotebutton=driver.findElement(By.xpath("/html/body/form/input[1]"));
		buyquotebutton.click();
//		assertTrue(driver.findElement(By.xpath("/html/body/center/form/center[2]/h3")).isDisplayed());
		WebElement policyStartdate=driver.findElement(By.name("PolicyStartDate"));
		policyStartdate.sendKeys("10/09/2018");
		WebElement checkbox1=driver.findElement(By.name("TermsRead"));
		checkbox1.click(); 
	    }
        
        
    @Test   //Test to see you are able to buy policy and confirmation page is displayed
    public void policyConfirmationTest() throws InterruptedException { //Test if the policy confirmation page is displayed
    	 WebElement submitPolicy=driver.findElement(By.xpath("/html/body/center/form/center[3]/pre/input[3]"));
 	    submitPolicy.click();
 	    assertTrue(driver.findElement(By.xpath("/html/body/center[2]/h3")).isDisplayed()); 
	        Thread.sleep(3000);
	        driver.close();

}}

