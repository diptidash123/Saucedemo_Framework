package Basicsscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlepagewithALLgetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		        driver.get("https://www.saucedemo.com/"); 
//		        driver.navigate().to("https://www.naukri.com/");  //example purpose
		        System.out.println(driver.getTitle());            //title of the page               return type-string          //all present inside web-driver.
		        System.out.println(driver.getCurrentUrl());       //current url of the page         return type-string
		        System.out.println(driver.getPageSource());       //view page source of the page    return type-string
		        System.out.println(driver.getWindowHandle());     //handle current window           return type-string
		        System.out.println(driver.getWindowHandles());    //handles multiple windows        return type-set<string>
		        System.out.println(driver.getClass());            //class properties
		        driver.get("https://www.google.com");                                               //return type-void
//		        driver.close();
		        driver.quit();
		       
			}


	}

