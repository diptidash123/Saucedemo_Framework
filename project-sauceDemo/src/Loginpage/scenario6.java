package Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.saucedemo.com/");
				String title=driver.getTitle();
				System.out.println(title);
				String expected="Swag Labs";
				if (title.equals(expected))
				{
					System.out.println("correct title");
				}
				else
				{
					System.out.println("wrong title");
				}

			}

		}

		//title of the page verification
