package PracticePage;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends HomePage123{
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement Size_S;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement Size_M;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a/span")
	private WebElement Size_L;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement PrintedDress;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement AddCart;
	
	@FindBy(xpath="//span[@class='cross']")
	private WebElement Close;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	private WebElement AddedMessage;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement ProductCount;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul")
	private List<WebElement> ShowingCount;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
	private WebElement Tweet;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
	private WebElement Share;
	
	@FindBy(xpath="//*[@id=\"short_description_content\"]/p")
	private WebElement Description;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSize_S() {
		return Size_S;
	}

	public WebElement getSize_M() {
		return Size_M;
	}

	public WebElement getSize_L() {
		return Size_L;
	}

	public WebElement getPrintedDress() {
		return PrintedDress;
	}
	
	public WebElement getAddCart() {
		return AddCart;
	}
	
	public WebElement getProductCount() {
		return ProductCount;
	}
	
	public List<WebElement> getShowingCount() {
		return ShowingCount;
	}

	public WebElement getAddedMessage() {
		return AddedMessage;
	}
	
	public WebElement getTweet() {
		return Tweet;
	}
	
	public WebElement getShare() {
		return Share;
	}
	 
	public WebElement getDescription() {
		return Description;
	}
	
	public WebElement getClose() {
		return Close;
	}
	
	
}