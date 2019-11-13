package Seleni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class GNSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testsso.secure.fedex.com/L3/egnsl/");
		System.out.println(driver.getTitle());
		
/*		System.setProperty("webdriver.gecko.driver", "C:\\Users\\874531\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/
/*		System.setProperty("webdriver.ie.driver", "C:\\Users\\874531\\Downloads\\MicrosoftWebDriver.exe");
		
        WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/	
		
		//System.out.println(driver.getCurrentUrl()); //to get the current URL and to check whether there is any redirection
		
		//System.out.println(driver.getPageSource()); //to get the Page Source
		
		//driver.findElement(By.id("username")).sendKeys("874531");
		//driver.findElement(By.cssSelector("input#username")).sendKeys("874531");
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("874531");
		driver.findElement(By.id("password")).sendKeys("874531");
		driver.findElement(By.id("submit")).click();
	
		//ESQI Button CLick
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/table/tbody/tr[1]/td/b/input")).click();
        
        //Location Summary
        //driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/table/tbody/tr[2]/td/input")).click();
        
        //get text
       System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/p/b[2]")).getText());
       
       //driver.findElement(By.xpath("//a[@href='sbaData.html']")).click();
       
       driver.findElement(By.cssSelector("[value='Location Summary']")).click();
       driver.findElement(By.xpath("//form[@name='GuiLayoutForm']/table/tbody/tr[3]/td/input")).click();
        //Get all values of a dropdown
       List<WebElement> allText = driver.findElements(By.xpath("//*[@name='productType.types']"));
       for ( WebElement element: allText) 
       { 
           System.out.println(element.getText());
        
      //driver.close(); //closes current browser
	   }


	}
}
