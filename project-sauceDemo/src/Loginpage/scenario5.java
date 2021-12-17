package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//h3[.='Epic sadface: Username is required']")).getText();
		System.out.println(actual);

	}

}

//username & password both blank  then click to login button will throw error verify the error message and print the error message.

