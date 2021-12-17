package Basicsscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
//		     	driver.get("https://www.saucedemo.com/");  
				driver.get("https://www.naukri.com/");                 //example purpose
//		     	closing browser we have two methods- close() and quit()
//		     	close()-current browser window close
//		     	quit()-current browser is having multiple windows or associated with with child browser//sub-child browser
				System.out.println("url launched sucessfully and closed done");
			  //driver.close();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.quit();
			}


}
