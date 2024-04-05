package testpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Herballogin;
public class Herbaltest {

WebDriver driver;
@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
@Test
public void testlogin()
{
	Herballogin ob= new Herballogin(driver);
	ob.Myaccount();
	ob.selec11();
	ob.login();
	ob.setvalues("stephyasamuel@gmail.com", "Stephy@00");
	ob.loginclick();
	
}
}

