package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	
public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://tentabs.in/");
		driver.manage().window().maximize();
	}
}
