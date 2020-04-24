package TestPage;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import PracticePage.BasePage;
import PracticePage.HomePage;

public class HomePageTest 123{
	BasePage bp;
	HomePage hp;
	
	int random=new Random().nextInt(500000);
	String email="gowthambalaji18"+random+"@gmail.com";
	
	public HomePageTest() {
		bp=new BasePage();
		hp=new HomePage();
		}

	@Test
	public void VerifyWomenTab(){
		Assert.assertTrue(hp.getWomenTab().isDisplayed());
		hp.getWomenTab().click();
		}
	
	@Test
	public void VerifyDressesTab() {
		Assert.assertTrue(hp.getDressesTab().isDisplayed());
		hp.getDressesTab().click();
		}
	
	@Test
	public void VerifyTShirtsTab() {
		Assert.assertTrue(hp.getTShirtsTab().isDisplayed());
		hp.getTShirtsTab().click();
	}
	
	@Test
	public void VerifyNewsLetter() {
		hp.getNewsLetterInput().sendKeys(email);
		hp.getNewsLetterClick().click();
		//String w=hp.getAlertMessage().getText();
		//Assert.assertTrue(w.contains("Newsletter : You have successfully subscribed to this newsletter"));
		//System.out.println(w);
	}
}	