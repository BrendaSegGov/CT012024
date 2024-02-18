package LoginTestCases;

import org.testng.annotations.Test;

import NavigationPage.InventoryPage;
import NavigationPage.LoginPage;
import commonMethods.GlobalVariables;
import setupDriver.setupDriver;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC03 {
	
	WebDriver driver = setupDriver.setupDriver();
	
	LoginPage loginPage  = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	
	@BeforeTest
  public void startWebDriver() {
	  driver.get(GlobalVariables.HOME_PAGE);
  }
  @Test
  public void TC03_Verify() {
	  loginPage.login(GlobalVariables.STANDARD_USER,GlobalVariables.password);
	  boolean isDisplayed = inventoryPage.verifyRemoveBtn();
	  Assert.assertTrue(isDisplayed);
  }

  @AfterTest
  public void closeDriver() {
	  driver.quit();
	  
  }

}
