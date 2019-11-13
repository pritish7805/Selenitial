package Seleni;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://itg.prod.fedex.com/sf/projects/bst_qte/");
		driver.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("input#login")).sendKeys("874531");
		  driver.findElement(By.cssSelector("input#password")).sendKeys("Syntel12");
		  driver.findElement(By.cssSelector("input#submit")).click();
		  
		  Actions a = new Actions(driver);
		  driver.findElement(By.xpath("//a[@href='#projects']")).click();
		  a.moveToElement(driver.findElement(By.xpath("//*[@id=\'yui-gen8\']/a"))).build().perform();
		  WebDriverWait d = new WebDriverWait(driver,10);
	      d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/sf/projects/bst_qte']")));
		  driver.findElement(By.xpath("//a[@href='/sf/projects/bst_qte']")).click();
		  
		  driver.findElement(By.xpath("//img[@alt='Task Statistics Graph']")).click();
		  System.out.println(driver.getTitle());
		  Set <String> ids =driver.getWindowHandles();
		  Iterator<String> it =ids.iterator();
		  String parentid = it.next();
		  String childid = it.next();
		  driver.switchTo().window(childid);
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(parentid);
		  System.out.println(driver.getTitle());
		  
		  
		  
		  
		  
		  
		  
		//driver.quit(); //closes all browsers opened by Selenium

	}

}
