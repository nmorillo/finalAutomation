package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Items {
	private WebDriver driver;
	private By lighterBanner;
	private By ceroResultBanner;
	private By noResultsBanner;
	private By btnSelectColor;
	private By orangeColor;
	private By itemName;
	private By chargeBanner;
	
	public Items(WebDriver driver) {
		this.driver = driver;
		lighterBanner = By.className("lighter");
		ceroResultBanner = By.className("heading-counter");
		noResultsBanner = By.xpath("//*[@id=\'center_column\']/p");
		btnSelectColor = By.id("color_2");
		orangeColor = By.id("color_21");
		itemName = By.xpath("//*[@id=\'center_column\']/div/div/div[3]/h1");
		chargeBanner = By.xpath("//*[@id=\'center_column\']/ul/p");
		
	}
	
	public String getItemNameText() {
		return driver.findElement(itemName).getText();
	}
	
	public String getLighterBannerText() {
		return driver.findElement(lighterBanner).getText();	
	}
	
	public String getCeroResultsBannerText() {
		return driver.findElement(ceroResultBanner).getText();
	}
	
	public String getNoResultsBannerText() {
		return driver.findElement(noResultsBanner).getText();
	}
	
	public void selectColor(int num) {
		driver.findElement(By.id("color_"+num)).click();
	}
	
	public void clickOrangeColorWithTimeCondition() {
		//driver.findElement(orangeColor);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement orange = wait.until(ExpectedConditions.elementToBeClickable(orangeColor));
		orange.click();
	}
	
	public String getChargeBannerText() {
		return driver.findElement(chargeBanner).getText();
	}
}
