package Seleni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@contains(@class,'nav-a-2')]")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'link-account')]")).click();
		driver.findElement(By.cssSelector("a[id*='link-account']")).click();
		//driver.findElement(By.cssSelector("a#nav-link-accountList")).click();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("ayz@gmail.com");
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("ayz");
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@class='a-alert-content']/ul/li/span")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='a-list-item']/parent::div")).getText());
	}

}
