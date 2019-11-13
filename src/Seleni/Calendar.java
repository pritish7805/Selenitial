package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\874531\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//Implicit Wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://testsso.secure.fedex.com/L3/eShipmentGUI/MenuPage.iface");
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("input#username")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#submit")).click();
		  driver.switchTo().alert().accept();
		  driver.switchTo().frame(1);
		  driver.findElement(By.cssSelector("select#appNav")).click();
		  driver.findElement(By.xpath("//option[@value='DisplayLinkHandler?id=351']")).click();
          //driver.findElement(By.linkText("Scans")).click();
	      //driver.findElement(By.linkText("eMassEntry")).click();
		  driver.switchTo().defaultContent();
	      driver.findElement(By.cssSelector("input#locationField")).sendKeys("COSA");
	      driver.findElement(By.cssSelector("button.primaryButton")).click();
	      driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/span[1]/div/div/div/ul/li[4]/a/span[1]/span")).click();
          //driver.findElement(By.cssSelector(".ui-state-focus > span:nth-child(1) > span:nth-child(1)")).click();
 	      //Explicit Wait
	      WebDriverWait d = new WebDriverWait(driver,20);
	      d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='wijmo-wijmenu-text'][contains(text(),'PUP - Package Pick Up')]")));
	      driver.findElement(By.xpath("//span[@class='wijmo-wijmenu-text'][contains(text(),'PUP - Package Pick Up')]")).click();
	      Thread.sleep(5000L);
	      Actions a= new Actions(driver);
	      a.moveToElement(driver.findElement(By.xpath("//input[@id='massEntryForm:empNbr_inputtext']"))).click().sendKeys("0000874531").build().perform();
	      driver.findElement(By.id("massEntryForm:scanDate_calendar_input")).click();
	      //driver.findElement(By.id("massEntryForm:scanDate_calendar_input")).click();
	      int count=driver.findElements(By.xpath("//td[@data-handler='selectDay']//a[@href='#']")).size();
	      
	      for (int i=0;i<count;i++)
	      {
	    	  String text=driver.findElements(By.xpath("//td[@data-handler='selectDay']//a[@href='#']")).get(i).getText();
	    	  //driver.findElement(By.linkText("16")).click();
	    	  if(text.equalsIgnoreCase("15"))
	    	  {
	    		  
	    		  driver.findElements(By.xpath("//td[@data-handler='selectDay']//a[@href='#']")).get(i).click();
	    		  break;
	    	  }	  
	      }
       
	}

}
