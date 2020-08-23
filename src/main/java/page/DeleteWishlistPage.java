package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteWishlistPage {
	private WebDriver driver;

	private By loginBttn = By.className("login");
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By sigInBttn = By.id("SubmitLogin");
	private By wishlistBttn = By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a");

	private By deleteBttn = By.className("icon-remove");

	private String emailinput = "tes123@gmail.com";
	private String passwordinput = "1234sifra";

	public DeleteWishlistPage(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginAndWishlist() {
		driver.findElement(loginBttn).click();
		driver.findElement(email).sendKeys(emailinput);
		driver.findElement(password).sendKeys(passwordinput);
		driver.findElement(sigInBttn).click();
		driver.findElement(wishlistBttn).click();

	}

	public void deleteWishlist() {
		driver.findElement(deleteBttn).click();
		driver.switchTo().alert().accept();
	}

}
