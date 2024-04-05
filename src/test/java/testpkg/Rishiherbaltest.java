package testpkg;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import pagepkg.Rishiherbal;
 
	@Test
	public class Rishiherbaltest extends Baseclasse
	{
		
	public void test()
	{
		Rishiherbal ob= new Rishiherbal(driver);
		ob.health();
		ob.instock();
		ob.sort();
		ob.sortorder();
		ob.firstproduct();
		ob.whishlist();
	}
	}