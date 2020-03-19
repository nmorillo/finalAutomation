package selections;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class WomenSectionTest extends Common{
	@Test(enabled=false , description = "Search by checks")
	public void searchByChecks() {		
		index.clickWomenLink();
		category.selectedSubcategory("Summer Dresses");
//		category.checkDress();
//		category.checkL();
//		category.clickColor(3);
	}
	

	
	@Test(enabled=false , description = "Verify Section Tops")
	public void verifySectionTops() {		
		index.goCategory("Women");
		String subCategory = "Tops";
		category.selectedSubcategory(subCategory);
		Assert.assertEquals(category.getCategoryNameText(), subCategory);
	}
	
	@Test(enabled=false , description = "Verify second dress color white in Section Tops")
	public void dressWhiteInSectionTops() {		
		index.goCategory("Women");
		String subCategory = "Tops";
		category.selectedSubcategory(subCategory);
		item.selectColor(8);		
		Assert.assertEquals(item.getItemNameText(), "Blouse");		
	}
}
