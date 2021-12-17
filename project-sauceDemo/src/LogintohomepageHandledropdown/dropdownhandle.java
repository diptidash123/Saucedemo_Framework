package LogintohomepageHandledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com/");
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				WebElement dropdwonbutton=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
				dropdwonbutton.click();
				Select s=new Select(dropdwonbutton);
				
//				boolean multiselect = s.isMultiple(); //check for singel select or multi select dropdown
//				System.out.println(multiselect);
				
				s.selectByVisibleText("Name (A to Z)");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("selected first item");
				
				s.selectByVisibleText("Name (Z to A)");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("selected second item");
				s.getFirstSelectedOption();
//				
//				s.selectByVisibleText("Price (low to high)");
//				Thread.sleep(5000);
//				System.out.println("selected third item");
//				
//				s.selectByVisibleText("Price (high to low)");
//				Thread.sleep(5000);
//				System.out.println("selected fourth item");
				
				
				
			

			}

		}

