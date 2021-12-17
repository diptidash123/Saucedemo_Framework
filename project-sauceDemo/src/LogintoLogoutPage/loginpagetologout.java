package LogintoLogoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpagetologout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com");
		WebElement username=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		username.sendKeys("standard_user");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		password.sendKeys("secret_sauce");
		Thread.sleep(5000);
		//login to application
		WebElement login=driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		login.click();
		Thread.sleep(5000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		System.out.println("login page showing successfully");

	}

}

