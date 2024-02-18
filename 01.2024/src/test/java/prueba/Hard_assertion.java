package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class Hard_assertion {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		
		Assert.assertEquals(actualTitle,  expectedTitle);
		
		driver.quit();
  }
}
