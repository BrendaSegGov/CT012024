package homePageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.WrapClass;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElements LoginPage
	@FindBy (className="title")
	private WebElement subtitleLbl;
	@FindBy (id="password")
	private WebElement passwordTxt;
	@FindBy (id="login-button")
	private WebElement btnLogin;
	
	//Method LoginPage
	public void login(String user, String pwd) {
		WrapClass.sendKeys(userNameTxt, user);
		WrapClass.sendKeys(passwordTxt, pwd);
		WrapClass.click(btnLogin);
	}

}
