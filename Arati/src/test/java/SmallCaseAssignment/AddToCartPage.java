package SmallCaseAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage  {
     @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[7]/div/div/div/div[2]/div/div/div[1]/div/div[4]/div/a/div/div/div/img")
     WebElement itemImage;
     @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
     WebElement btnAddToCart;
     @FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/input")
     WebElement txtQuantity;
     @FindBy(xpath="//span[text()='Place Order']")
     WebElement btnPlaceOrder;
    
     BasePage selenium;
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium=new BasePage();
	}
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performMouseHower(itemImage, driver);
		selenium.click(btnAddToCart);
		selenium.clear(txtQuantity);
		selenium.seText("2", txtQuantity);
		selenium.click(btnPlaceOrder);
		return false;
		
	}
	
	
	
}
