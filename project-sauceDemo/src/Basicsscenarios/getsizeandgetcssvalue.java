package Basicsscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getsizeandgetcssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		        driver.get("https://www.saucedemo.com/"); 
		        WebElement image=driver.findElement(By.xpath("//div[@class=\"bot_column\"]"));
		        System.out.println(image.getSize().getHeight()); //height of the image  //getSize() return type-int dimension present inside webElement
		        System.out.println(image.getSize().getWidth());  //width of the image
		        System.out.println(image.getSize().getClass());  //class properties
		       
		        //dom validation of image variable
		        
		        System.out.println(image.getCssValue("font-family"));
		        System.out.println(image.getCssValue("background-attachment"));
		        System.out.println(image.getCssValue("background-clip"));
		        System.out.println(image.getCssValue("background-color"));
		        System.out.println(image.getCssValue("background-image"));
		        System.out.println(image.getCssValue("background-origin"));
		        System.out.println(image.getCssValue("background-position-x"));
		        System.out.println(image.getCssValue("background-position-y"));
		        System.out.println(image.getCssValue("background-size"));
		        System.out.println(image.getCssValue("color"));                      //wrong on the page
		        System.out.println(image.getCssValue("display"));
		        System.out.println(image.getCssValue("float"));                      //wrong on the page
		        
		        //css validation of image variable
		        System.out.println(image.getTagName());
		        System.out.println(image.getText());
		        System.out.println(image.getLocation());
		        System.out.println(image.getRect());
		        driver.close();
		        
			}

		}
