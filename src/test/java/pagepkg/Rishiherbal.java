package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Rishiherbal 
{
WebDriver driver;
@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
WebElement health;
@FindBy(xpath="//*[@id=\"outOfStockFilter\"]")
WebElement instock;
@FindBy(xpath="//*[@id=\"input-sort\"]")
WebElement sort;
@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")
 WebElement firstproduct;
 @FindBy(xpath="//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")
 WebElement whishlist;
               public Rishiherbal(WebDriver driver)
                {
                	this.driver=driver;
                	PageFactory.initElements(driver, this);
                }
        public void health ()
        {
        health.click();
        }
        public void instock ()
        {
        instock.click();
        }
        public void sort()
        {
         sort.click();
         }
        public void sortorder()
        {
        Select sortorder= new Select(sort);
        sortorder.selectByValue("alphabet-asc");
         }
        public void firstproduct  ()
        {
        firstproduct.click();
        }
        public void whishlist ()
       {
        whishlist.click();
       }
        }

