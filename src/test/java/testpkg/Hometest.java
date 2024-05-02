package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Homepage;

public class Hometest extends Baseclass
{
	@Test

	public void testlogin()throws Exception

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.navigate().refresh();
				
				Homepage search= new Homepage(driver);
				search.search("hospital furnitures");
				search.account();
				Thread.sleep(3000);

}
}