package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.makemytrip.com/");
  System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
  driver.findElement(By.cssSelector("label[for='switch__input_3']")).click();
  System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
  
  
  
  
  
	}

}
