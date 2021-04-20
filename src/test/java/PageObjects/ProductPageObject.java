package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObject {
	
	public WebDriver driver;
	
	public ProductPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	By filter=By.xpath("//select[@class='product_sort_container']");
	By products=By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_label']//a//div");
	By add_cart=By.xpath("//button[text()='Add to cart']");
	By cartlogo=By.xpath("//a[@class='shopping_cart_link']");
	public WebElement getFilter()
	{
		return driver.findElement(filter);
	}
	public List<WebElement> getProducts()
	{
		return driver.findElements(products);
	}
	public List<WebElement> getAddToCart()
	{
		return driver.findElements(add_cart);
	}
	public WebElement getCartLogo()
	{
		return driver.findElement(cartlogo);
	}

}
