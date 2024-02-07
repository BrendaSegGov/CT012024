package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Practica2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();		
		Thread.sleep(2000);
		
		WebElement Backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		Backpack.click();
		System.out.println("Tu articulo se agrego " );
		
		WebElement CarShop = driver.findElement(By.className("shopping_cart_link"));
		CarShop.click();
		
		WebElement Checkout = driver.findElement(By.id("checkout"));
		Checkout.click();
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Brenda");
		
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Segovia");
		
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		postalCode.sendKeys("200003");
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		Thread.sleep(2000);
		WebElement finishBtn = driver.findElement(By.name("finish"));
		finishBtn.click();
		
		WebElement ordenCompletada = driver.findElement(By.className("complete-header"));
		ordenCompletada.isDisplayed();
		
		driver.close();
		}

	}

