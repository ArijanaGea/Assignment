package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import page.AddItemPage;
import page.CreateAccountPage;

public class TC4Test {
	@BeforeClass


	public void setUp() {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", dir + "\\executable\\chromedriver.exe");

		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
}
	private WebDriver driver;

	

	@Test(priority=1)
	public void logIn() {
		AddItemPage home = new AddItemPage (driver);
		home.LoginAndWishlist();
		}
	
	@Test(priority =2)
	public void clickWomen() {
		AddItemPage home = new AddItemPage (driver);
		home.clickWomen();
	}
	
	@Test(priority =3)
	public void openMenu() {
		AddItemPage home = new AddItemPage (driver);
		home.expandLeftMenu();
		
	}
	
	@Test(priority =4)
	public void addItem(){
		AddItemPage home = new AddItemPage (driver);
		home.addtolist();
	}
	
	@Test (priority =5)
	
	public void checkItems() {
		AddItemPage home = new AddItemPage (driver);
		home.checkWishlist();
		
		
		//verify number of items in the wishlist
		
		
		
	}
	@AfterClass
	public void tearDown () {
		AddItemPage home = new AddItemPage (driver);
		home.tearDown();
	}
}
