package selections;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Common;

public class WomenSectionTest extends Common{
	
	
	@Test(enabled=true , description = "Verify Section Tops")
	public void verifySectionTops() {		
		index.goCategory("Women");
		String subCategory = "Tops";
		category.selectedSubcategory(subCategory);
		Assert.assertEquals(category.getCategoryNameText(), subCategory);
	}
	
	@Test(enabled=true , description = "Verify second dress color white in Section Tops")
	public void dressWhiteInSectionTops() {		
		index.goCategory("Women");
		String subCategory = "Tops";
		category.selectedSubcategory(subCategory);
		item.selectColor(8);		
		Assert.assertEquals(item.getItemNameText(), "Blouse");		
	}
}
