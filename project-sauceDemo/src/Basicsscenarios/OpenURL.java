package Basicsscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
//				driver.get("https://www.saucedemo.com/");              //Launching any url we have two methods- get()/navigate().to()
				driver.navigate().to("https://www.saucedemo.com/");
				System.out.println("url launched sucessfully");
				
				

			}

}
