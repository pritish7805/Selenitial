package Seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class January {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\874531\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://home.fedex.com/Corporate/Pages/default.aspx");
driver.findElement(By.cssSelector("input#peopletext.searchfield")).sendKeys("874531");
driver.findElement(By.xpath("//*[@id=\'s4-titlerow\']/div[1]/div/table/tbody/tr[3]/td/div/div[1]/button")).click();
WebElement link = null;
//System.out.println(driver.findElement(By.cssSelector("")).getText());
System.out.println(link.getText());
	}

}
