package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Loginpage;

public class Logintest extends Baseclass
{
	@Test

	public void testlogin()throws Exception

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.navigate().refresh();
		Loginpage login=new Loginpage(driver);
		login.clicksignin();
		login.setValue("akhilavishnu2896@gmail.com", "akhila@1234");
		login.signinbuttonClick();
		Thread.sleep(2000);
	}
	

}
