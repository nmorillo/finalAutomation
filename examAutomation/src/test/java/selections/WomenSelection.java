package selections;

import org.testng.annotations.Test;

import baseTest.Common;

public class WomenSelection extends Common{
	@Test(description = "Search by checks")
	public void searchByChecks() {		
		index.clickWomenLink();
		category.checkDress();
		category.checkL();
		category.clickColor(3);
	}
}
