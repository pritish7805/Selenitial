package Seleni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
/*		System.setProperty("webdriver.gecko.driver", "C:\\Users\\874531\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/
/*		System.setProperty("webdriver.ie.driver", "C:\\Users\\874531\\Downloads\\MicrosoftWebDriver.exe");
		
        WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());*/	
		
		System.out.println(driver.getCurrentUrl()); //to get the current URL and to check whether there is any redirection
		
		//System.out.println(driver.getPageSource()); //to get the Page Source
		
		driver.get("https://www.yahoo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //closes current browser
		//driver.quit(); //closes all browsers opened by Selenium
	}

}
