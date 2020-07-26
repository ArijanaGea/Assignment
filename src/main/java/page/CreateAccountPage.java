package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {



	private WebDriver driver;

	
	private By loginBttn = By.className("login");
	private By enteremail = By.id("email_create");
	private By createBttn = By.id("SubmitCreate");

	private By genderBttn = By.id("id_gender2");
	private By name = By.id("customer_firstname");
	private By lastname = By.id("customer_lastname");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By DOBdays = By.id("days");
	private By DOBmonth = By.id("months");
	private By DOByear = By.id("years");
	private By checkbox = By.id("newsletter");
	private By secondoption = By.id("optin");
	private By checkname = By.xpath("//*[@id=\"firstname\"]");
	private By checklastname = By.xpath("//*[@id=\"lastname\"]");

	private By company = By.id("company");
	private By address = By.id("address1");
	private By city = By.id("city");
	private By state = By.id("id_state");
	private By zipcode = By.id("postcode");
	private By country = By.id("id_country");

	private By info = By.id("other");
	private By phone = By.id("phone");
	private By mobile = By.id("phone_mobile");
	private By addresalias = By.id("alias");
	private By submitBttn = By.id("submitAccount");
	private By signOut = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");

	
	public String email1 = "tjhihgju867jg@gmail.com";
	public String firstname = "arijana";
	public String surname = "prezime";
	private String pass = "sifra123";
	private String companyname = "Company";
	private String addressname = "Adresa1";
	private String cityname = "New York";
	private String code = "15233";
	private String additionalinfo = "Dodatne informacije";
	private String phoneno = "7946904";
	private String mobileno = "8356940";
	private String address2name = "Adresa2";

	// constructor
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	// click on Sign In link
	public void SignIn() {
		driver.findElement(loginBttn).click();
	}

	// get current URL
		
		public String verifyUrl() {
			return driver.getCurrentUrl();

	}

	// enter email
	public void enteremail() {
		driver.findElement(enteremail).sendKeys(email1);
	}

	public void submitBttn() {
		driver.findElement(createBttn).click();
	}

	// gender and name
	public void clickGender() {
		driver.findElement(genderBttn).click();
	}

	public void enterName() {
		driver.findElement(name).sendKeys(firstname);
	}

	public void enterLastName() {
		driver.findElement(lastname).sendKeys(surname);
	}

	// get email
	
	public String getemail() {
		WebElement ele = driver.findElement(email);
		String mailvalue = ele.getAttribute("value");
		System.out.println("Mail: "+ mailvalue);
		return mailvalue;
	}

	public void enterPass() {
		driver.findElement(password).sendKeys(pass);
	}

	// select date
	public String selectday() {
		Select daydropdown = new Select(driver.findElement(DOBdays));
		daydropdown.selectByValue("22");
		WebElement option = daydropdown.getFirstSelectedOption();
		return option.getText();
	}
	
	public String selectmonth() {
		Select monthdropdown = new Select(driver.findElement(DOBmonth));
		monthdropdown.selectByValue("5");
		WebElement option = monthdropdown.getFirstSelectedOption();
		return option.getText();
	}
	public String selectyear() {
		Select yeardropdown = new Select(driver.findElement(DOByear));
		yeardropdown.selectByValue("1992");
		WebElement option = yeardropdown.getFirstSelectedOption();
		return option.getText();
	}

	// checkbox
	public boolean checkBox() {
		driver.findElement(checkbox).click();
		return driver.findElement(checkbox).isSelected();

	}

	// checkbox not selected
	public boolean Receivedchecked() {
		driver.findElement(secondoption).isSelected();
		return driver.findElement(secondoption).isSelected();
	}

	// get name
	public String getName() {
		WebElement name = driver.findElement(checkname);
		String namevalue = name.getAttribute("value");
		System.out.println("Name is: "+namevalue);
		return namevalue;
	
}
	// get lastname

	public String getLastName() {
		WebElement lastname=driver.findElement(checklastname);
		String lastnameValue = lastname.getAttribute("value");
		System.out.println("Last name is: "+lastnameValue);
		return lastnameValue;
		
	}

	// company
	public void companyName() {
		driver.findElement(company).sendKeys(companyname);
	}

	// adderss
	public void addressName() {
		driver.findElement(address).sendKeys(addressname);
	}

	// city
	public void cityName() {
		driver.findElement(city).sendKeys(cityname);
	}
	// select state Alabama

	public String selectAlabama() {
		Select stateDropDown = new Select(driver.findElement(state));
		stateDropDown.selectByVisibleText("Alabama");
		WebElement option = stateDropDown.getFirstSelectedOption();
		return option.getText();
	}

	// zip code
	public void enterCode() {
		driver.findElement(zipcode).sendKeys(code);
	}

	// country USA
	public String selectUSA() {
		Select countryDropDown = new Select(driver.findElement(country));
		countryDropDown.selectByVisibleText("United States");
		WebElement country = countryDropDown.getFirstSelectedOption();
		return country.getText();
	}

	// add info
	public void additionalInfo() {
		driver.findElement(info).sendKeys(additionalinfo);
	}

	// phone
	public void enterPhone() {
		driver.findElement(phone).sendKeys(phoneno);
	}

	public void enterMobile() {
		driver.findElement(mobile).sendKeys(mobileno);
	}

	// alias address
	public void aliasAddress() {
		driver.findElement(addresalias).clear();
		driver.findElement(addresalias).sendKeys(address2name);
	}

	// click register
	public void RregisterBttn() {
		driver.findElement(submitBttn).click();
	}

	// verify URL
	public String getAccountURL() {
		return driver.getCurrentUrl();
	}

	// logout
	public void logOut() {
		driver.findElement(signOut).click();
	}

	// verify url
	public String getAuthenticationURL() {
		return driver.getCurrentUrl();
	}

	public void tearDown() {
		driver.quit();
		
	}

}
