package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.CreateAccountPage;

public class AccountTest {

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

	// sign in
	@Test(priority = 1)
	public void clickSignInLink() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.SignIn();
	}

	// Verify URL login page
	@Test(priority = 2)
	public void verifyURL() {
		CreateAccountPage home = new CreateAccountPage(driver);
		Assert.assertEquals(home.verifyUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account", "User is not on correct URL");
	}

	@Test(priority = 3)
	public void enterEmail() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enteremail();
	}

	@Test(priority = 4)
	public void submit() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.submitBttn();
		}

	@Test(priority=5)
	public void clickGender() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.clickGender();
		
	}
	
	@Test(priority=6)
		public void enterName() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterName();
	}
	
	@Test(priority=7)
	public void enterLastName() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterLastName();
	}
	
	
	// Verify email
	@Test(priority = 8)
	public void verifyEmail() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.getemail();
		String mailvalue = home.getemail();
		Assert.assertEquals(mailvalue, home.email1, "Emails are not the same.");
	}

	@Test(priority = 9)
	public void password() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterPass();
	}
	
   //DOB
	@Test(priority=10)
	public void selectday() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.selectday();
	}
	
	@Test(priority=11)
	public void selectMonth() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.selectmonth();
	}
	@Test(priority=12)
	public void selectYear() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.selectyear();
		}
	
	// Verify SignUp checked
	@Test(priority = 13)
	public void checkbox() {
		CreateAccountPage home = new CreateAccountPage(driver);
		Assert.assertTrue(home.checkBox(), "Checkbox is not selected");

	}

	// verify received..unchecked
	@Test(priority = 14)
	public void recieved() {
		CreateAccountPage home = new CreateAccountPage(driver);
		Assert.assertFalse(home.Receivedchecked(), "Checkbox is selected");
		

	}

	// verify firstname
	@Test (priority =15)
	public void verifyName() {
		CreateAccountPage home = new CreateAccountPage(driver);
		String namecheck = home.getName();
		Assert.assertEquals(namecheck, home.firstname, "Names do not match");
		

	}
	// verify lastname
	@Test (priority =16)
	public void verifylastName() {
		CreateAccountPage home = new CreateAccountPage(driver);
		String lastnamecheck = home.getLastName();
		Assert.assertEquals(lastnamecheck, home.surname, "Last Names do not match");
	}
	//company
	@Test(priority =17)
	public void enterCompany() {
	CreateAccountPage home = new CreateAccountPage(driver);
	home.companyName();
	}
	
	//address
	@Test(priority=18)
	public void enterAdderss() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.addressName();
	}	
	//city
	@Test(priority =19)
	public void enterCity() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.cityName();
	}
	
	//state
	@Test(priority=20)
	public void selectState() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.selectAlabama();
		
	}
	//zip
	@Test(priority=21)
	public void enterCode() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterCode();	
	}
	
	//country
	@Test(priority=22)
	public void selectCountry() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.selectUSA();
	}
	//add info
	@Test(priority=23)
	public void addInfo() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.additionalInfo();
	}
	//phone
	@Test(priority=24)
	public void addPhone() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterPhone();
	}
	@Test(priority=25)
	public void addMobile() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.enterMobile();
	}
	
	//alias add
	@Test(priority =26)
	public void addressAlias() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.aliasAddress();
	}
	
	//register
	@Test(priority =27)
	public void createAccount() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.RregisterBttn();
	}
	
	// verify Account page URL
	@Test (priority =28)
	public void verifyAccountURL() {
		CreateAccountPage home = new CreateAccountPage(driver);
		Assert.assertEquals(home.getAccountURL(), "http://automationpractice.com/index.php?controller=my-account", "User is not on correct page");;
	}
	@Test(priority =29)
	public void logOut() {
		CreateAccountPage home = new CreateAccountPage(driver);
		home.logOut();
	}
	
	// verify Login page URL
	@Test (priority =30)
	public void verifyAuthURL() {
		CreateAccountPage home = new CreateAccountPage(driver);
		Assert.assertEquals(home.getAuthenticationURL(), "http://automationpractice.com/index.php?controller=authentication&back=my-account", "User is not on correct page");;
	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}
}

