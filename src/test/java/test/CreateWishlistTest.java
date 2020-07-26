package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.DeleteWishlistPage;
import page.WishlistPage;

public class CreateWishlistTest {
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
	@Test(priority=1)
	public void logIn() {
		WishlistPage home = new WishlistPage(driver);
		home.Login();
		}
	@Test(priority=2)
		public void cretewishlist(){
		WishlistPage home = new WishlistPage(driver);
		home.createWishlist();
	}
	
	@Test(priority=3)
	public void countwishlist() {
		WishlistPage home = new WishlistPage(driver);
		home.numberorows();
	}
	
	@AfterClass
	public void tearDown () {
		WishlistPage home = new WishlistPage(driver);
		home.tearDown();
	}

}

