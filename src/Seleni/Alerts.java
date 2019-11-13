package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("[value='Confirmation Alert']")).click();
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().sendKeys("XXXX");
        driver.switchTo().alert().accept();
        
        //driver.switchTo().alert().dismiss();
        
        
	}

}
