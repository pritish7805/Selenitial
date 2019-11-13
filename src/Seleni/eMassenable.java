package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class eMassenable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //driver.get("https://testsso.secure.fedex.com/L3/Event-Entry-5539/");
		  driver.get("https://testsso.secure.fedex.com/L3/eShipmentGUI/MenuPage.iface");
		  driver.findElement(By.cssSelector("input#username")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#submit")).click();
          driver.manage().timeouts().implicitlyWait(02, TimeUnit.SECONDS);
	      WebElement a = driver.findElement(By.xpath("//*[@title='Quick Navigation']"));
	      Actions action = new Actions(driver);
	      action.moveToElement(a).click().build().perform();
	      driver.findElement(By.linkText("eMassEntry")).click();  

		  
/*		  driver.findElement(By.cssSelector("div.global-header table:nth-child(1) tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) > select:nth-child(1)")).click();
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[3]/td[1]/select[1]")).click();
		  Select dropdown = new Select(driver.findElement(By.xpath("//*[@title='Quick Navigation']")));
		  dropdown.selectByVisibleText("eMassEntry");*/
		  
/*		  driver.switchTo().frame(driver.findElement(By.id("appNav")));
		  System.out.println(driver.findElement(By.id("appNav")).isEnabled());
		  System.out.println(driver.findElement(By.cssSelector("select#appNav")).isEnabled());
		  System.out.println(driver.findElement(By.xpath("//*[@title='Quick Navigation']")).isEnabled());
		  Select s = new Select(driver.findElement(By.cssSelector("select#appNav")));*/
		  
		  //s.selectByValue("DisplayLinkHandler?id=51");

		  //driver.findElement(By.cssSelector("select#appNav")).click();
		  
		  /*driver.findElement(By.id("appNav")).click();*/
		  
	/*	  driver.findElement(By.cssSelector("[value='DisplayLinkHandler?id=51']")).click();
		  driver.findElement(By.cssSelector("input#locationField")).sendKeys("COSA");
		  driver.findElement(By.cssSelector("class.ui-icon.ui-icon-triangle-1-s")).click();*/
		  
/*		  System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
		  driver.findElement(By.cssSelector("label[for='switch__input_3']")).click();
		  System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());*/
	}

}
