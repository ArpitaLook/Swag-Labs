package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPageObject {
	public WebDriver driver;
	
	public CheckOutPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By firstName=By.xpath("//input[@placeholder='First Name']");
	By lastName=By.xpath("//input[@placeholder='Last Name']");
	By zipCode=By.xpath("//input[@placeholder='Zip/Postal Code']");
	By cont=By.xpath("//input[@type='submit']");
	
	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement getLastName()
	{
		return driver.findElement(lastName);
	}
	public WebElement getZipCode()
	{
		return driver.findElement(zipCode);
	}
	public WebElement getContinue()
	{
		return driver.findElement(cont);
	}
	
	

}
