package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class suggestdrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.expedia.com/");
		  driver.manage().window().maximize();
		  String name=driver.getTitle();
		  if (name.equalsIgnoreCase("Bot or Not?"))
		  {
     	  int number=framenumber(driver,By.xpath("//*[@id='recaptcha-anchor']"));
		  driver.switchTo().frame(number);
		  driver.findElement(By.xpath("//*[@id='recaptcha-anchor']")).click();
		  driver.switchTo().defaultContent();
		  
     	  int number1=framenumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		  driver.switchTo().frame(number1);
		  driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		  driver.switchTo().defaultContent();
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  }  
		  else
		  {
		  System.out.println("No Robot Check");
		  }
	      driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).click();
		  driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys("COS");
		  System.out.println(driver.findElements(By.xpath("//*[@class='autocomplete-dropdown']")).size());
		  Thread.sleep(2000L);
		  System.out.println(driver.findElement(By.xpath("//a[@id='aria-option-7']")).getText());
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//a[@id='aria-option-7']")).click();
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

