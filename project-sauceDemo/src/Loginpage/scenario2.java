package Loginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");// we can launch url in two ways get()//navigate().to() method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("abcd");
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("random123");
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		String actualerror = driver.findElement(By.xpath("//h3[.='Epic sadface: Username and password do not match any user in this service']")).getText();
		String expectederror="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualerror, expectederror);
		System.out.println("verification is success");
		
		
}
}

//username & password credentials both wrong  then click to login button will throw an error verify it.
