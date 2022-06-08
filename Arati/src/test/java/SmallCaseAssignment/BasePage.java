package SmallCaseAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class BasePage {
     Actions action;
	 public void performMouseHower(WebElement element, WebDriver driver) {
		 action= new Actions(driver);
		 action.moveToElement(element).build().perform();
	 }
      public void click(WebElement element) {
    	  element.click();
      }
      public void clickUsingJavaScriptExecutor(WebElement element,WebDriver driver) {
    	  JavascriptExecutor executor=(JavascriptExecutor)driver;
    	  executor.executeScript("arguments[0].click();",element);
      }
      public void clear(WebElement element) {
    	  element.clear();
      }
      public void seText(String text,WebElement element) {
    	  element.sendKeys(text);
      }
	public static boolean validateAddToCart(Object driver) {
		
		return false;
	}
      
}




