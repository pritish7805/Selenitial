package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miscella {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();

		//Implicit Wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.dailyfantasycricket.com/");
		  driver.manage().window().maximize();
		  
		  int number=framenumber(driver,By.xpath("//div[@class='recaptcha-checkbox-checkmark'][@role='presentation']"));
		  driver.switchTo().frame(number);
		  driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark'][@role='presentation']")).click();
		  driver.switchTo().defaultContent();
		  
		  int number1=framenumber(driver,By.xpath("//button[@id='recaptcha-verify-button']"));
		  driver.switchTo().frame(number1);
		  driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")).click();

	}

	public static int framenumber(WebDriver driver ,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			
			int count=driver.findElements(by).size();
			
			if (count>0)
			{
				break;
			}
			else
			{
			System.out.println("Working");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}
