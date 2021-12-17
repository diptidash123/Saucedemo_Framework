package Scrollpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.google.com");
				WebElement variable=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
				variable.sendKeys("selenium");
				
				List<WebElement> storevar=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				System.out.println(((List<WebElement>) variable).size());

			}

		}

