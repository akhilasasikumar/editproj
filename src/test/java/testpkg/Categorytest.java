package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Categorypage;

public class Categorytest extends Baseclass {
	@Test

	public void test1login()throws Exception

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.navigate().refresh();
				
				Categorypage menu= new Categorypage(driver);
				menu.clickdevices();
				menu.cartcheckclick();
				Thread.sleep(2000);
				driver.navigate().back();
				menu.menubarclick();
				

}
}