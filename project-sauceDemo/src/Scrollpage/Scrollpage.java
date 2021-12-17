package Scrollpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.saucedemo.com/");
				WebElement username=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
				username.sendKeys("standard_user");
				WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
				password.sendKeys("secret_sauce");
				WebElement loginbutton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
				loginbutton.click();
				Thread.sleep(5000);
				//scroll action script
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				

			}

		}


