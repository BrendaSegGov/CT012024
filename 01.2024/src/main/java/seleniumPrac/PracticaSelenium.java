package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	public static void main(String[] args)  throws InterruptedException {
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
		
		// Metodos del explorador
		//Obtener el titulo de la pagina
		String title = driver.getTitle();
		System.out.println("el titulo de la pagina es: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es: " + url);
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(product) {
			System.out.println("El articulo es desplegado");
			
			}
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodText.contains("Sauce Labs Backpack");
		if(textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}
		else {
			System.out.println("ERROR: El producto no es correcto");
				}
		//Dropdown
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
		
		
			}
		
		}
			


