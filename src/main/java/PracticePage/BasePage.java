package PracticePage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static WebDriver driver;
	public String browser = "chrome";

	
	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Desktop\\Java\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
	

	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void setText(WebElement element, String name) {
		if (name != null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}

	public String getTxtAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public String selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
	}

	public boolean isElementVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void quitDriver() {
		driver.quit();
	}
	
	public void mouseover(WebElement element) {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void getSnapshot(String Path,String FileLocation) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f1=tk.getScreenshotAs(OutputType.FILE);
		File f2=new File(Path+FileLocation+".png");
		FileHandler.copy(f1,f2);
	}
	
	public void SwitchWindow(int index) {
		Set<String> window=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>();
		list.addAll(window);
		driver.switchTo().window(list.get(index));
	}
	
	public String getWebTableData(WebElement table,int row,int col) {
		String path="//table//tbody//tr['"+row+"']//td['"+col+"']";
		return table.findElement(By.xpath(path)).getText();
	}
	
	public String getExcelData(String FileLocation,String SheetName,int row,int col) throws IOException {
		File f=new File(FileLocation);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet(SheetName);
		return sh.getRow(row).getCell(col).getStringCellValue();
	}
}
