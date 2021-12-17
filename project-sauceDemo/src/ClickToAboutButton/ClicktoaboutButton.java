package ClickToAboutButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ClicktoaboutButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
				WebDriver driver=new ChromeDriver();
//				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com");
				WebElement username=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
				username.sendKeys("standard_user");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement password=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
				password.sendKeys("secret_sauce");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//login to application
				WebElement login=driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
				login.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//button[.='Open Menu']")).click();
				driver.findElement(By.xpath("//a[.='About']")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String actualtitle=driver.getTitle();
				String expectedtitle="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
				Assert.assertEquals(actualtitle, expectedtitle);
				System.out.println("Title of the page is correct as per the expectation");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.close();
				
			}

	}
