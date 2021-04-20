package BasePackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.CartPageObject;
import PageObjects.CheckOutPageObject;
import PageObjects.CompletePageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.OverviewPageObject;
import PageObjects.ProductPageObject;

public class Login extends Base{
	
	
  @Test(dataProvider="getData")
  public void login(String username, String password,String lastName) {
	  WebDriver driver=init();
	  LoginPageObjects lop=new LoginPageObjects(driver);
	  lop.getUsername().sendKeys(username);
	  lop.getPassword().sendKeys(password);
	  lop.getlogin().click();
	  ProductPageObject ppo=new ProductPageObject(driver);
	  Select s=new Select(ppo.getFilter());
	  s.selectByValue("lohi");
	  List<WebElement> products=ppo.getProducts();
	  List<WebElement> add_cart=ppo.getAddToCart();
	  for(int i=0;i<products.size();i++)
	  {
		 // product_value=ppo.getProducts().get(i).getText();
		 if(ppo.getProducts().get(i).getText().equalsIgnoreCase("Sauce Labs Fleece Jacket"))
		  {
			  //System.out.println("11111");
			  ppo.getAddToCart().get(i).click();
		  }
	  }
	  ppo.getCartLogo().click();
	  CartPageObject cpo=new CartPageObject(driver);
	  cpo.getCheckout().click();
	  CheckOutPageObject copo=new CheckOutPageObject(driver);
	  copo.getFirstName().sendKeys(username);
	  copo.getLastName().sendKeys(lastName);
	  copo.getZipCode().sendKeys("587-108");
	  copo.getContinue().click();
	  OverviewPageObject opo=new OverviewPageObject(driver);
	  Assert.assertEquals(opo.getTxt().getText(),"Sauce Labs Fleece Jacket");
	  opo.getFinish().click();
	  CompletePageObjects cp=new CompletePageObjects(driver);
	  Assert.assertEquals(cp.getTxtt().getText(),"THANK YOU FOR YOUR ORDER");
	  driver.close();
  }
  
  
  @DataProvider
  public Object[][] getData()
  {
	  Object[][] data=new Object[3][3];
	  data[0][0]="standard_user";
	  data[0][1]="secret_sauce";
	  data[0][2]="user";
	  
	  data[1][0]="locked_out_user";
	  data[1][1]="secret_sauce";
	  data[1][2]="user";
	  
	  data[2][0]="problem_user";
	  data[2][1]="secret_sauce";
	  data[2][2]="user";
	  
	  return data;
	  	  
  }
  
  
  
}
