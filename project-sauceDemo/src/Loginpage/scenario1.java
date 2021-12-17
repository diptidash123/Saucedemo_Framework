package Loginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  //wait timeout seconds
	      driver.manage().window().maximize();                             //maximize browser
	      driver.get("https://www.saucedemo.com/");
	      driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	      driver.findElement(By.xpath("//input[@id='login-button']")).click();
	      try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      System.out.println("succesfully login is done and redirect to the homepage");
	      driver.close();

		}

	}

	//username & password credentials if correct then click to login button will redirect to the home page.
