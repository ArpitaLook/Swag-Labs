package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPageObject {
	public WebDriver driver;
	
	public OverviewPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txt=By.xpath("//div[@class='cart_item_label']//div");
	By finish=By.xpath("//button[text()='Finish']");
	
	public WebElement getTxt()
	{
		return driver.findElement(txt);
	}
	public WebElement getFinish()
	{
		return driver.findElement(finish);
	}
	
	

}
