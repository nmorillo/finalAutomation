package selections;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class TShirtsTest extends Common{
	@Test(enabled=true , description = "Dropdowns Selections")
	public void dropdownsSelection() {		
		index.goT_shirtsCategory();
		category.selectProductSortByValue("name:desc");
		System.out.println(item.getChargeBannerText());
		//Assert.assertEquals(item.getItemNameText(), "Loading...");
	}
}
