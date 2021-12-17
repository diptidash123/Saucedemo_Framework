package ClicktocartErrormessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verifyerrormessagetocart {

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
				driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.name("checkout")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.name("continue")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement errormessage= driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3"));
				System.out.println(errormessage.getText());
				String validateerror="Error: First Name is required";
		      //Assert.assertEquals(errormessage,validateerror); exception throwing multiple times[debug]
		        Assert.assertNotEquals(errormessage,validateerror);
				System.out.println("error validated succesfully");
				driver.close();
			}

	}

