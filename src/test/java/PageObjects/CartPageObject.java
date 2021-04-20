package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageObject {
	
	public WebDriver driver;
	
	public CartPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By checkout=By.xpath("//button[text()='Checkout']");
	
	public WebElement getCheckout()
	{
		return driver.findElement(checkout);
	}

}
