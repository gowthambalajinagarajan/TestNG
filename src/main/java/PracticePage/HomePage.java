package PracticePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage123{
	
	@FindBy(xpath="(//*[@title='Women'][1])")
	private WebElement WomenTab;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement DressesTab;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement TshirtsTab;
	
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement NewsLetterInput;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement NewsLetterClick;
	
	@FindBy(xpath="//*[@id=\"columns\"]/p']")
	private WebElement AlertMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomenTab() {
		return WomenTab;
	}
	
	public WebElement getDressesTab() {
		return DressesTab;
	}
	
	public WebElement getTShirtsTab() {
		return TshirtsTab;
	}
	
	public WebElement getNewsLetterInput() {
		return NewsLetterInput;
		}
	
	public WebElement getNewsLetterClick() {
		return NewsLetterClick;
	}
	
	public WebElement getAlertMessage() {
		return AlertMessage;
	}
}
