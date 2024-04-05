package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclasse {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
			driver=new ChromeDriver();
			driver.get("https://rishiherbalindia.linker.store/");
		}
}
