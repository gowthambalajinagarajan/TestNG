package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import PracticePage.BasePage;
import PracticePage.HomePage;
import PracticePage.ProductPage;

public class ProductPageTest {
	BasePage bp;
	HomePage hp;
	ProductPage pp;
	
	public ProductPageTest() {
		bp=new BasePage();
		hp=new HomePage();
		pp=new ProductPage();
	}
	@Test
	public void VerifySize() {
		hp.getDressesTab().click();
		pp.getSize_S().click();
		Assert.assertTrue(pp.getSize_S().isDisplayed());
		pp.getSize_M().click();
		Assert.assertTrue(pp.getSize_M().isDisplayed());
		pp.getSize_L().click();
		Assert.assertTrue(pp.getSize_L().isDisplayed());
	}
	
	@Test
	public void VerifyProductCount() {
		hp.getDressesTab().click();
		int i=pp.getShowingCount().size();
		String a=Integer.toString(i);
		System.out.println(a);
		String count=pp.getProductCount().getText();
		System.out.println(count);
	}
	@Test
	public void VerifyTweetandShare() {
		hp.getDressesTab().click();
		pp.getPrintedDress().click();
		Assert.assertTrue(pp.getTweet().isDisplayed());
		Assert.assertTrue(pp.getShare().isDisplayed());
	}
	@Test
	public void VerifyAddedtoCart() {
		hp.getDressesTab().click();
		pp.getPrintedDress().click();
		pp.getAddCart().click();
		pp.getClose().click();
		//String a=pp.getAddedMessage().getAttribute("1");
		//System.out.println(a);
		}
	
	
	@Test
	public void VerifyDescription() {
		hp.getDressesTab().click();
		pp.getPrintedDress().click();
		String b=pp.getDescription().getText();
		Assert.assertTrue(b.contains("100% cotton double printed dress"),"Failed to display");
	}
}