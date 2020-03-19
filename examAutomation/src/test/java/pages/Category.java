package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Category {
	private By name;	
	private By sortDropDown;
	private By women;
	private By dresses;
	private WebDriver driver;
	private By dressesCheck;
	private By lCheck;
	private By colorsCheck;	
	
	
	public Category(WebDriver driver) {
		this.driver = driver;
		women = By.linkText("Women");
		sortDropDown = By.id("selectProductSort");
		dressesCheck = By.id("layered_category_8");
		lCheck = By.id("layered_id_attribute_group_3");
		colorsCheck = By.xpath("//input[@class='color-option  ']");
		name = By.className("category-name");
	}
	
	public String getCategoryNameText() {
		return driver.findElement(name).getText();
	}
	
	public void goWomenCategory(String category) {
		driver.findElement(By.linkText(category)).click();
	}
	
	public void selectProductSortByText(String textSearch) {
		Select order1 = new Select(driver.findElement(sortDropDown));
		order1.selectByVisibleText(textSearch);
	}
	public void selectProductSortByValue(String valueSearch) {
		Select order2 = new Select(driver.findElement(sortDropDown));
		order2.selectByValue(valueSearch);
	}
	
	public void selectProductSortByIndex(int item) {
		Select order3 = new Select(driver.findElement(sortDropDown));
		order3.selectByIndex(item);
	}
	
	public void checkDress() {
		driver.findElement(dressesCheck);
	}
	
	public void checkL() {
		driver.findElement(lCheck);
	}
	
	public void clickColor(int color) {
		//driver.findElement(colorsCheck).click();
		List<WebElement> colorElements = driver.findElements(colorsCheck);
		colorElements.get(color).click();
	}
	
	public void selectedSubcategory(String type) {
		driver.findElement(By.linkText(type)).click();
	}
	
	
}
