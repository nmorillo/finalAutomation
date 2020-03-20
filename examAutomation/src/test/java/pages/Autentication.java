package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autentication {
	private WebDriver driver;
	private By emailField;
	private By passField;
	private By submitLoginBtn;
	private By errorMessageBanner;
	
	public Autentication(WebDriver driver) {
		this.driver = driver;
		emailField = By.id("email");
		passField = By.id("passwd");
		submitLoginBtn = By.id("SubmitLogin");
		errorMessageBanner = By.xpath("//*[@id=\'center_column\']/div[1]/ol/li");
	}
	
	public void login(String email, String pass) {		
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passField).sendKeys(pass);
		driver.findElement(submitLoginBtn).click();
	}
	
	public String getErrorMessageText() {
		return driver.findElement(errorMessageBanner).getText();
	}

}
