package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Suggestdrop {

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
		  driver.switchTo().activeElement();//This command needed to traverse the dropdown
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys(Keys.ARROW_DOWN);
		  /*Thread.sleep(2000L);
		  driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys(Keys.ENTER);*/
		  
		  
		  //Javascript is used to find hidden elements because Selenium can't do that.
		  //javascript Executor
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  //String any="value";
		  String location="return document.getElementById(\"package-origin-hp-package\").value;";
		  String locname=(String) js.executeScript(location);
		  System.out.println(locname);
		  Thread.sleep(2000L);
		  System.out.println(driver.findElement(By.xpath("//a[@id='aria-option-7']")).getText());
		  String loctname=driver.findElement(By.xpath("//a[@id='aria-option-7']")).getText();
		  while(!loctname.contains("Rio"))
		  {
			  driver.switchTo().activeElement();
			  Thread.sleep(2000L);
			  driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys(Keys.ARROW_DOWN);
/*			  Thread.sleep(2000L);
			  driver.findElement(By.xpath("//*[@id='package-origin-hp-package']")).sendKeys(Keys.ENTER);*/
			  locname=(String) js.executeScript(location);
			  System.out.println(locname);  
		  }
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
