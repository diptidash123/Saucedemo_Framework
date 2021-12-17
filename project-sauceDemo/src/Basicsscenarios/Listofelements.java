package Basicsscenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listofelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		        driver.get("https://www.google.com/");
		        WebElement searchbar=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		        searchbar.sendKeys("selenium");
		        Thread.sleep(5000);
		        List<WebElement> ListofElements=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		        System.out.println(ListofElements.size());
		        
//		        for(int i=0;i<searchbar.getSize(); i++)
//		        {
//		        	System.out.println(listofelements.get(i).get);
//		        }
		//
//			}


		}
	
}
