package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testsso.secure.fedex.com/L3/egnsl/");
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("874531");
		driver.findElement(By.id("password")).sendKeys("874531");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/table/tbody/tr[1]/td/b/input")).click();
		driver.findElement(By.cssSelector("[value='Location Summary']")).click();
		
		driver.findElement(By.cssSelector("[name='jobName.jobName']")).sendKeys("TestAuto");
		//driver.findElement(By.xpath("*enter your xpath here*")).sendKeys(Keys.chord(Keys.CONTROL, "a"),*enter the new value here*);
		driver.findElement(By.cssSelector("[name='jobName.fromDate']")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"04012018");
		//driver.findElement(By.cssSelector("[name='jobName.thruDate']")).sendKeys("04072018");
		driver.findElement(By.cssSelector("[name='jobName.thruDate']")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"04072018");
		
		Select s =new Select(driver.findElement(By.cssSelector("[name='locations.subTypes']")));
		s.selectByValue("AD");
		s.selectByIndex(6);
		s.selectByVisibleText("CE Customer Center");
		
		driver.findElement(By.cssSelector("[name='locations.orig']")).click();
		System.out.println(driver.findElement(By.cssSelector("[name='locations.orig']")).isSelected());
		
		//System.out.println(driver.findElement(By.cssSelector("[value='T']")).isSelected());
		//driver.findElement(By.cssSelector("[value='T']")).click();
		//System.out.println(driver.findElement(By.cssSelector("[value='T']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("[name='reportView.view']")).size());
		
		int count=driver.findElements(By.cssSelector("[name='reportView.view']")).size();
		/*for (int i=0; i<count; i++)
		{
			driver.findElements(By.cssSelector("[name='reportView.view']")).get(i).click();	
		}*/
		
	    for (int i=0; i<count; i++)
	    {
	    	String text =driver.findElements(By.cssSelector("[name='reportView.view']")).get(i).getAttribute("value");
	    	if (text.equals("L"))
	    	{
	    		driver.findElements(By.cssSelector("[name='reportView.view']")).get(i).click();
	    	}
	    }
		
	}

}
