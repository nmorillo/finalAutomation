package selections;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class DressesTest extends Common{
	public String subCategory;
	
	@Test(enabled=false , description = "Verify Section Dresses")
	public void verifySectionDresses() {		
		index.goDressesCategory();
		subCategory = "Summer Dresses";
		category.selectedSubcategory(subCategory);
		Assert.assertEquals(category.getCategoryNameText(), subCategory);
	}
	
	@Test(enabled=false , description = "Verify first dress color blue in Section Dresses")
	public void dressBlueInSectionDresses() {		
		index.goDressesCategory();
		subCategory = "Summer Dresses";
		category.selectedSubcategory(subCategory);
		item.selectColor(20);
		
		Assert.assertEquals(item.getItemNameText(), "Printed Summer Dress");
		
	}
}
