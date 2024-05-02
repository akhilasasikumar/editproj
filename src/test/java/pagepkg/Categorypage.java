package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Categorypage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"AccessibleNav\"]/li[4]/a")
	WebElement device;
	
	@FindBy(xpath="//*[@id=\"CollectionSection\"]/div/div[1]/div[2]/div[1]/a/div[1]/div/div/div/img")
	WebElement firstpic;
	
	@FindBy(xpath="//*[@id=\"addToCart-product-template\"]")
	WebElement cartadd;
	
	@FindBy(xpath="//*[@id=\"your-shopping-cart\"]/main/form/div[6]/div/div[2]/button")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"AccessibleNav\"]/li[2]/a")
	WebElement sleepdrop ;
	
	
	
	
	public Categorypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickdevices()
	{
		device.click();
		firstpic.click();
		cartadd.click();
	}
	
		public void cartcheckclick()
		{
		checkout.click();
	}
		public void menubarclick()
		{
			sleepdrop.click();
		}

		
	

}
