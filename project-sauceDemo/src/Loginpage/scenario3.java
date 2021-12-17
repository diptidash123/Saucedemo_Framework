package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wehenn");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")).getText();
//		String expected="Epic sadface: Username and password do not match any user in this service";
		String expected="dipti";
		Assert.assertEquals(actual, expected);
//		Assert.assertNotEquals(actual, expected);
		System.out.println("successfully verification done");

	}

}


//username correct & password wrong  then click to login button will throw error verify the error message.
//assert class used for verification
