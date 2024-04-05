package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Herballogin {
		WebDriver driver;
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/span")
		WebElement myaccount;
		
		@FindBy(xpath="/html/body/div[1]/header/div/div/div/div[1]/div[2]/div/ul/li[1]/ul/li[2]/a")
		WebElement login;
		
		@FindBy(xpath="//*[@id='cont-login-with-email']/form/div[1]/input")
		WebElement email;
		
		@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
		WebElement loginclick;
		
		 public Herballogin(WebDriver driver)
	     {
	     	this.driver=driver;
	     	PageFactory.initElements(driver, this);
	     }
		 public void Myaccount ()
	        {
	        myaccount.click();
	        }

	    	public void setvalues(String Username,String Password)
			{
			email.sendKeys(Username);
	        password.sendKeys(Password);
			}
	    	public void loginclick ()
	        {
	        loginclick.click();
	        }
			
			public void selec11() {
				 Actions act=new Actions(driver);  
				 act.moveToElement(login).perform();
				
			}
			public void login() {
				login.click();
				
			}
	}
	
	
	