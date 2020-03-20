package selections;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class TShirtsTest extends Common{
	
	@Test(enabled=true , description = "Dropdowns Selections")
	public void dropdownsSelection() {		
		index.goT_shirtsCategory();
		category.selectProductSortByValue("name:desc");
		Assert.assertEquals(item.getChargeBannerText(), "Loading...");
	}
}
