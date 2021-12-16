package scenariofunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scenario1 
{

	@Test
	public void functionality1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username=driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[1]"));
        username.sendKeys("standard_user");
        Thread.sleep(6000);
        WebElement password=driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[2]"));
        password.sendKeys("secret_sauce");
        Thread.sleep(6000);
        WebElement loginbutton=driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]"));
        loginbutton.click();
        Thread.sleep(6000);
        WebElement menubutton=driver.findElement(By.xpath("//button[.='Open Menu']"));
        menubutton.click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[.='All Items']")).click();
        driver.findElement(By.xpath("//button[.='Close Menu']")).click();
        String actualtext= driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();
        String expectedtext="Sauce Labs Backpack";
        Assert.assertEquals(actualtext,expectedtext);
        System.out.println("verification of the item is correct as per the requirement");
        WebElement addtocart=driver.findElement(By.xpath("(//button[.='Add to cart'])[1]"));
        addtocart.click();
        Thread.sleep(6000);
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        JavascriptExecutor js=(JavascriptExecutor)driver;
        for(int i=0;i<=1;i++)
        {
        js.executeScript("window.scrollBy(0,500)");
        }
        Thread.sleep(6000);
        WebElement carticon=driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
        carticon.click();
        Thread.sleep(6000);
        driver.findElement(By.id("checkout")).click();
        System.out.println("shoud navigate to CHECKOUT: YOUR INFORMATION page");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("abcdef");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("xyz");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("768999");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"btn btn_secondary btn_small cart_button\"]")).click();
        System.out.println("item removed successfully");
        driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
        System.out.println("scenario complete execution done");
        driver.close();
	}


}
