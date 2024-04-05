package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Loginfb;

public class Logintest {
WebDriver driver;
@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
@Test
public void testlogin()
{
	Loginfb ob= new Loginfb(driver);
	ob.setvalues("ste@gmail.com", "xyz");
	ob.login();
	
}
}
