package search;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseTest.Common;

public class SearchTest extends Common{
	@BeforeClass
	public void BoforeAll() {
		contadorPaso =0;
		contadorFallo=0;
	}
	
	@AfterClass
	public void arterAll() {	
	System.out.println("****************************** ");
	System.out.println("Test que pasaron la prueba : "+ contadorPaso);
	System.out.println("Test que fallaron la prueba : "+ contadorFallo);
	System.out.println("****************************** ");		
	}
	
	@Test(enabled=false , description="Search By Dress")
	public void searchByDress() {		
		index.search("dress");	
		Assert.assertEquals(item.getLighterBannerText(), "\"DRESS\"");
	}
	
	@Test(enabled=false , description="Search Cero Results")
	public void searchCeroResults() {		
		index.search("pepito");		
		Assert.assertEquals(item.getCeroResultsBannerText(), "0 results have been found.");		
	}
	
	@Test(enabled=false , description="Search no Results")
	public void searchNoResults() {		
		index.search("pepito");		
		Assert.assertEquals(item.getNoResultsBannerText(), "No results were found for your search \"pepito\"");		
	}
}
