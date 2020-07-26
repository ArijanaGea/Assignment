package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage {
	private WebDriver driver;
	
	//locators for signIn
	private By loginBttn = By.className("login");
	private By email = By.id("email");
	private By password =By.id("passwd");
	private By sigInBttn = By.id("SubmitLogin");
	
	private By wishlistBttn = By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a");
	private By inputfield = By.id("name");
	private By saveBttn = By.id("submitWishlist");
	
	private By table = By.className("table");

	private String emailinput ="tes83@gmail.com";
	private String passwordinput = "sifra123";
	private String wishlist1 ="new";
	private String wishlist2 ="old";
	private String wishlist3 ="phone";
	
	


	
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Login() {
		driver.findElement(loginBttn).click();
		driver.findElement(email).sendKeys(emailinput);
		driver.findElement(password).sendKeys(passwordinput);
		driver.findElement(sigInBttn).click();
		
	}
	
	public void createWishlist() {
		driver.findElement(wishlistBttn).click();
		driver.findElement(inputfield).sendKeys(wishlist1);
		driver.findElement(saveBttn).click();
		driver.findElement(inputfield).sendKeys(wishlist2);
		driver.findElement(saveBttn).click();
		driver.findElement(inputfield).sendKeys(wishlist3);
		driver.findElement(saveBttn).click();


	}
	
	public void numberorows() {
		List<WebElement> rows = driver.findElements(table);
		int count = rows.size();

		System.out.println("Numeber of rows: " + count);
	}
	public void tearDown() {
		driver.quit();
		
	}

}
