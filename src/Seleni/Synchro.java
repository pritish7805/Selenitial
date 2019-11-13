package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//Implicit Wait
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://testsso.secure.fedex.com/L3/eShipmentGUI/MenuPage.iface");
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("input#username")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#submit")).click();
          driver.findElement(By.linkText("Scans")).click();
	      driver.findElement(By.linkText("eMassEntry")).click();
	      driver.findElement(By.cssSelector("input#locationField")).sendKeys("COSA");
	      driver.findElement(By.cssSelector("button.primaryButton")).click();
	      driver.findElement(By.linkText("Pickup")).click();
	      //driver.findElement(By.cssSelector("span.wijmo-wijmenu-text")).click();
	      //Explicit Wait
	      WebDriverWait d = new WebDriverWait(driver,20);
	      d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='wijmo-wijmenu-text'][contains(text(),'PUP - Package Pick Up')]")));
	      driver.findElement(By.xpath("//span[@class='wijmo-wijmenu-text'][contains(text(),'PUP - Package Pick Up')]")).click();
	  Thread.sleep(5000L);
	  //driver.findElement(By.xpath("//input[@name='massEntryForm:empNbr_inputtext']")).clear();
	  //  driver.findElement(By.xpath("//input[@name='massEntryForm:empNbr_inputtext']")).sendKeys("0000874531");
	      Actions a= new Actions(driver);
	      //a.moveToElement(driver.findElement(By.linkText("Delivery"))).build().perform();
	      //a.keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.cssSelector("input#massEntryForm:empNbr_inputtext.none")), "874531");
	      //a.moveToElement(driver.findElement(By.xpath("//*[@id='massEntryForm:empNbr_inputtext']"))).click().keyDown(Keys.SHIFT).sendKeys("874531").build().perform();
	      //d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='massEntryForm:empNbr_inputtext']")));
	      a.moveToElement(driver.findElement(By.xpath("//input[@id='massEntryForm:empNbr_inputtext']"))).click().sendKeys("874531").build().perform();
	  //  d.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='massEntryForm:empNbr_inputtext']")));
	      //driver.findElement(By.xpath("//input[@id='massEntryForm:empNbr_inputtext']")).sendKeys("874531");
	//    WebElement move = driver.findElement(By.id("massEntryForm:empNbr_inputtext"));
	//    a.moveToElement(move).sendKeys("874531").build().perform();
	      //driver.findElement(By.id("massEntryForm:empNbr_inputtext")).click();
	      //driver.findElement(By.name("massEntryForm:empNbr_inputtext")).sendKeys("874531");
       
	}

}
