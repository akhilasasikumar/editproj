package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"customer_login_link\"]")
	WebElement tlabssignin;
	
	@FindBy(xpath="//*[@id=\"customer_email\"]")
	WebElement tlabsemail;
	
	@FindBy(xpath="//*[@id=\"customer_password\"]")
	WebElement tlabspaswd;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/p/input")
	WebElement tlabsloginclick;
	
	
	

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicksignin()
	{
		tlabssignin.click();
 }
	public void setValue(String email,String pwd )
	{
		tlabsemail.sendKeys(email);
		tlabspaswd.sendKeys(pwd);
		
	}
	public void signinbuttonClick()
	{
		tlabsloginclick.click();
	}

}


