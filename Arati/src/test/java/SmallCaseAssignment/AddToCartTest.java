package SmallCaseAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartTest  {
	
      
	@BeforeTest
	public static void main(String[] args) {
    	AddToCartPage Page;  
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
		Page =new AddToCartPage(driver);
		}
     @Test
     public void validateAddToCart(Object driver) {
		Assert.assertTrue(BasePage.validateAddToCart(driver));;
     }
}
