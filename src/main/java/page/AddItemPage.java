package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddItemPage {

	private WebDriver driver;

	private By loginBttn = By.className("login");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By sigInBttn = By.id("SubmitLogin");
	private By wishlistBttn = By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a");

	private By womenLink = By.className("sf-with-ul");

	private By leftMenu = By.className("grower");
	private By blouselink = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[2]/a");
	private By blouseimg = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	private By addItem = By.className("addToWishlist");
	
	
	
	

	private String emailinput = "tes123@gmail.com";
	private String passwordinput = "1234sifra";

	
	public AddItemPage(WebDriver driver) {
		this.driver = driver;
		
		
	}

	public void LoginAndWishlist() {
		driver.findElement(loginBttn).click();
		driver.findElement(email).sendKeys(emailinput);
		driver.findElement(password).sendKeys(passwordinput);
		driver.findElement(sigInBttn).click();
		driver.findElement(wishlistBttn).click();

	}

	public void clickWomen() {
		driver.findElement(womenLink).click();

	}

	public void expandLeftMenu() {
		driver.findElement(leftMenu).click();
		driver.findElement(blouselink).click();

	}

	public void addtolist() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)", "");
		
        //hover over img
        Actions builder = new Actions (driver);

        WebElement target = driver.findElement(blouseimg);
        builder.moveToElement(target).perform();
        driver.findElement(addItem).click();

	}



}
