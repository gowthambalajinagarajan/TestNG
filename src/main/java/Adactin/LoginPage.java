package Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
		
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUserName() {
		return UserName;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public void LoginApplication(String user,String pass) {
		setText(UserName, user);
		setText(Password, pass);
	}
	
	public WebElement getLogin() {
		return btnLogin;
	}
	
	public String getUserName1() {
		return getUserName().getAttribute("value");
	}
}
