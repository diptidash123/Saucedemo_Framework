package Addanyitemtocart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionality1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		
		
//Random user-1
//		WebElement firstname=driver.findElement(By.id("first-name"));
//		firstname.click();
//		firstname.sendKeys("diptiranjan");
//		
//		WebElement lastname=driver.findElement(By.id("last-name"));
//		lastname.click();
//		lastname.sendKeys("dash");
//		
//		WebElement zipcode=driver.findElement(By.id("postal-code"));
//		zipcode.click();
//		zipcode.sendKeys("78787");
		
//		//Random user-2
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.click();
		firstname.sendKeys("zyq");
		
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.click();
		lastname.sendKeys("asde");
		
		WebElement zipcode=driver.findElement(By.id("postal-code"));
		zipcode.click();
		zipcode.sendKeys("74567");
		
		driver.findElement(By.xpath("//input[@class=\"submit-button btn btn_primary cart_button btn_action\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		System.out.println("functionality is working fine");
		driver.close();
		
		
		
	}
}

//login to page click to any item add to cart click to checkout click to remove the item from the cart.
	
