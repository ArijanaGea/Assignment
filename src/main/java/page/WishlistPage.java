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
	
	private String emailinput ="tes123@gmail.com";
	private String passwordinput = "1234sifra";
	private String wishlist1 ="list" + Math.floor(Math.random() * 11111);
	private String wishlist2 ="list" + Math.floor(Math.random() * 11111);
	private String wishlist3 ="list" + Math.floor(Math.random() * 11111);
	
	


	
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
	
	

}
