package VerifyLogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sceanrio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logo available on the page or not ?
				// TODO Auto-generated method stub
//				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://www.saucedemo.com/");
////				String variable=driver.findElement(By.xpath("//div[@class='login_logo']")).getTagName();
////				System.out.println(variable);
//				
//				String variable1=driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
//				System.out.println(variable1);
//				String variable2="";
//				Assert.assertEquals(variable1,variable2);
//				System.out.println("logo is available");
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				String variable1=driver.findElement(By.xpath("//div[@class='bot_column']")).getText();
				System.out.println(variable1);
				String variable2="";
				Assert.assertEquals(variable1,variable2);
				System.out.println("Bot logo is available");
				

				
	}

}
