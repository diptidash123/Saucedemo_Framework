package VerifyTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String expected="Swag Labs";
		Assert.assertEquals(Title,expected);
		System.out.println("The title of page is correct as per valid data[user point]");
	}

}

