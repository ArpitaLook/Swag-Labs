package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePageObjects {

	public WebDriver driver;
	
	public CompletePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txt=By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	public WebElement getTxtt()
	{
		return driver.findElement(txt);
	}
}
