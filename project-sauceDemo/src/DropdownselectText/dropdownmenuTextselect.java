package DropdownselectText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmenuTextselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.navigate().to("https://www.saucedemo.com");
				WebElement username=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
				username.sendKeys("standard_user");
				WebElement password=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
				password.sendKeys("secret_sauce");
				//login to application
				WebElement login=driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
				login.click();
//				WebElement actualelement=driver.findElement(By.xpath("//span[text()='Products']"));
//				System.out.println(actualelement.getText());
//		    	String expectedelement="PRODUCTS";
//				Assert.assertEquals(actualelement, expectedelement);
//				System.out.println("successfully redirected to the home page");
				WebElement dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
				dropdown.click();
				Select s= new Select(dropdown);
				//check singel or multi select dropdown
//				System.out.println(s.isMultiple());
				s.selectByVisibleText("Name (Z to A)");
				System.out.println("correct text selected");
				driver.findElement(By.xpath("(//button[@class=\"btn btn_primary btn_small btn_inventory\"])[1]")).click();
				driver.findElement(By.xpath("//button[@class=\"btn btn_secondary btn_small btn_inventory\"]")).click();
				System.out.println("item added to cart and remove done success");
				
				
				

			}

}
	
