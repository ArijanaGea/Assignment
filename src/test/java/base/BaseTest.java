package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import page.AddItemPage;

public class BaseTest {
	
	private WebDriver driver;

	
	@BeforeClass

	public void setUp() {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", dir + "\\executable\\chromedriver.exe");

		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		

	}

}
