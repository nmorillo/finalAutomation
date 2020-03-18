package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.Configuration;
import helpers.Screenshots;
import pages.Category;
import pages.Index;
import pages.Items;

public class Common {
	protected int contadorPaso;
	protected int contadorFallo;
	protected WebDriver driver;
	protected Index index;
	protected Items item;
	protected Category category;

	@BeforeMethod
	public void setUp() {
		if(Configuration.browser.equals("Chrome")) {
			//System.out.println(System.getProperty("os.name"));
			if(System.getProperty("os.name").equals("Windows 10")) {
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			}else {
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			}
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");		
			driver = new ChromeDriver(options);			
		}else {
			if(System.getProperty("os.name").equals("Windows 10")) {
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			}else {
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");				
			}
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(Configuration.ulr_page);
		index = new Index(driver);
		category = new Category(driver);
		item = new Items(driver);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		String resultado;
		Reporter.setCurrentTestResult(result);
		System.out.println("============================================");
		if(result.getStatus()==1) {
			contadorPaso++;
			resultado = "Paso";
			Reporter.log("La prueba esta Ok");
		}else {
			resultado = "Fallo";

			Screenshots.takeScreenshot(result.getMethod().getDescription(), driver);			
			contadorFallo++;
			Reporter.log("La prueba esta Ok");
		}
		System.out.println("El test "+result.getMethod().getDescription()+" | "+result.getMethod().getMethodName()+" : "+resultado+" la prueba");
		System.out.println("============================================");
		driver.close();
		driver.quit();
	}

}
