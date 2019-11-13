package Seleni;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.os.WindowsUtils;
public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
			driver.get("https://testsso.secure.fedex.com/L3/egnsl/");
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//input[contains(@id,'userna')]")).sendKeys("874531");
			driver.findElement(By.id("password")).sendKeys("874531");
			driver.findElement(By.id("submit")).click();
			driver.findElement(By.xpath("//a[@href='sbaData.html']")).click();
			driver.findElement(By.xpath("//a[@href='sbaData.html#baseService']")).click();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("F:\\Testing\\All_Load_docs\\2018July\\SOX\\PPM38305 - eGNSL Updates\\Results\\Screenshots\\gnsl.png"));
			driver.close();
			//Kill or close opened excel or any file/window
			WindowsUtils.killByName("excel.exe");
	}

}
