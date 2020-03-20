package selections;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class AutenticationTest extends Common{
	@Test(enabled=true, description="Autentication fail")
	public void loginIncorrectUser() {
		index.loginBtn();
		auth.login("emailtest@gmail.com", "12345678");
		Assert.assertEquals(auth.getErrorMessageText(), "Authentication failed.");
	}	

}
