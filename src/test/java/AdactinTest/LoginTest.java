package AdactinTest;

import org.testng.annotations.Test;

import Adactin.BasePage;
import Adactin.LoginPage;

public class LoginTest {
	BasePage bp;
	LoginPage lp;
	
	public LoginTest() {
		bp=new BasePage();
		lp=new LoginPage();
	}

	@Test
	public void VerifyLogin() {
		lp.LoginApplication("gowthambala", "balaji18");
		lp.getLogin().click();
	}
}
