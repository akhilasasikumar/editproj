package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div/div/div[2]/div/span/a[1]")
	WebElement Myaccount;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div/div/div[2]/form/input[2]")
	WebElement Searchcate;
	
	@FindBy(xpath="//*[@id=\"shopify-section-search-template\"]/div/div/div[1]/div[3]/a/div[1]/div/div/div/img")
	WebElement Furimage;
	
	@FindBy(xpath="//*[@id=\"addToCartText-product-template\"]")
	WebElement cartimg;
	
	//@FindBy(xpath="//*[@id=\"AccessibleNav\"]/li[3]/a")
	//WebElement hospitaldev;
	
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void search(String searchKey)
	{
		Searchcate.sendKeys(searchKey,Keys.ENTER);
		Furimage.click();
		cartimg.click();
		
	}


	
	public void account()
	{
		Myaccount.click();
	}
}


