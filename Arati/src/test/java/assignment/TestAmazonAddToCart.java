package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAmazonAddToCart {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement S=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		S.sendKeys("iphone");
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
click.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(2000);
		
		String parent=driver.getWindowHandle();
		WebElement E=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		E.click();
		
	Set<String> tabs=driver.getWindowHandles();
	for (String ele:tabs) {
		
		if (!ele.equalsIgnoreCase(parent)) {
			
			driver.switchTo().window(ele);
			WebElement addcart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addcart.click();
			Thread.sleep(2000);	
			
		}
	}	
		Thread.sleep(4000);

	}

}
