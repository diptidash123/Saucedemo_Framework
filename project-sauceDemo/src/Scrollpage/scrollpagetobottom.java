package Scrollpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpagetobottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
				WebDriver driver=new ChromeDriver();
//				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com");
				WebElement username=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
				username.sendKeys("standard_user");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement password=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
				password.sendKeys("secret_sauce");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//login to application
				WebElement login=driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
				login.click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//			    js.executeScript(Window.scrollby
				driver.findElement(By.xpath("//a[.='Twitter']")).click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println(driver.getTitle());
			    try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    driver.navigate().back();
			    try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			    driver.navigate().refresh();
//			    try {
//					Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			    driver.findElement(By.id("react-burger-menu-btn")).click();
//			    try {
//					Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			    driver.findElement(By.xpath("logout_sidebar_link")).click();
//			    try {
//					Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			    System.out.println("login page opened");
//			    driver.close();

			}

		}

