package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Comp {
	private WebElement driver;
	List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	
	
	String product_name;
	String product_price;
	int int_product_price;
	HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
	for(int i=0;i<list_of_products.size();i++) {
		product_name = list_of_products.get(i).getText();
		product_price = list_of_products_price.get(i).getText();
		product_price = product_price.replaceAll("[^0-9]", "");
		int_product_price = Integer.parseInt(product_price);
		map_final_products.put(int_product_price,product_name);
	}
	Reporter.log("Product Name and price fetched from UI and saved in HashMap as:" + map_final_products.toString() + "<br>",true);
	
	
	
	private Object map_final_products1;
	Set<Integer> allkeys = map_final_products.keySet();
	ArrayList<Integer> array_list_values_product_prices = new ArrayList<Integer>(allkeys);
	
	
	Collections.sort(array_list_values_product_prices);
	
	
	int high_price = array_list_values_product_prices.get(array_list_values_product_prices.size()-1);
	
	
	int low_price = array_list_values_product_prices.get(0);
	
	Reporter.log("High Product Price is: " + high_price + " Product name is: " + map_final_products.get(high_price),true);
	Reporter.log("Low Product Price is: " + low_price + " Product name is: " + map_final_products.get(low_price),true);
}

