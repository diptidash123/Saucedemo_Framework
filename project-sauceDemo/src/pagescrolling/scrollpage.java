package pagescrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com/");
				WebElement username=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
				username.sendKeys("standard_user");
				WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
				password.sendKeys("secret_sauce");
				WebElement loginbutton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
				loginbutton.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("execution done");
				
				//scroll action script
//				
			    JavascriptExecutor js=(JavascriptExecutor)driver;
			    for(int i=0;i<=2;i++)
			    {
			    js.executeScript("window.scrollBy(0,100)");
			    }
			    System.out.println("scroll downwards");
//			    Thread.sleep(5000);
//			    js.executeScript("window.scrollBy(0,-500)");
//			    System.out.println("scroll upwards");
//			    Thread.sleep(5000);
			   
			}

		}

