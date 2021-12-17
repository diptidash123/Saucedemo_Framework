package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asgsddd");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")).getText();
		String expected="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual,expected);
		System.out.println("correct verification done");

}
}

//username incorrect & password correct  then click to login button will throw error verify the error message.
