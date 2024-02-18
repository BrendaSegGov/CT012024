package LoginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import NavigationPage.LoginPage;
import commonMethods.GlobalVariables;
import setupDriver.setupDriver;

public class TC01_Login {
	
	WebDriver driver = setupDriver.setupDriver();
	
	LoginPage loginPage  = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
  @Test
  public void fTC01() {
	  loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.password);
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
  
}
