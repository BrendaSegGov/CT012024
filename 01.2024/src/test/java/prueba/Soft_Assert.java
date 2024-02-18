package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		SoftAssert softAssert = new SoftAssert();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		String badTitle = "Labs";
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualTitle, badTitle);
		
		softAssert.assertAll();
		
  }
}
