package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.findElement(By.cssSelector("div#hlGlobalFooter")).findElements(By.tagName("a")).size());
		int count=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).size();
		
		for(int i=0; i<count ;i++)
		{
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).get(i).getText());
			if (driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).get(i).getText().equals("Stores"))
				
			{
				String a=driver.getTitle();
				driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		String b=driver.getTitle();
		
		String a = null;
		if (a!=b)
		{
			System.out.println("PASS");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		//driver.quit();
	}

}
