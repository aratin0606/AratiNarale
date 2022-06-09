package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFlipkartAddToCart  {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/account/log')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8329271338");//Mail-Mob no
		driver.findElement(By.xpath("//input[contains(@class,'- _3mctLh')]")).sendKeys("Arati@5555");//Password
		driver.findElement(By.xpath("//button[contains(@class,'_3AWRsL')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@title,'ch for products,')]")).sendKeys("Apple iPhone 12 (128GB) - Blue");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(5000);
		/*String parent=driver.getWindowHandle();
		
	Set<String> tabs=driver.getWindowHandles();
	for (String ele:tabs) {
		
		if (!ele.equalsIgnoreCase(parent)) {
			
			driver.switchTo().window(ele);
		Thread.sleep(2000);
		//add to cart
		WebElement click=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		click.click();
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}
	}*/
	
	}
}
 

