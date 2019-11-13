package Seleni;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\874531\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20061/mi-vs-csk-1st-match-indian-premier-league-2018");
		  driver.manage().window().maximize();
		  WebElement table=driver.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		  int rows=table.findElements(By.cssSelector("div.cb-col.cb-col-8.text-right.text-bold")).size();
		  int sum=0;

		  for(int i=0;i<rows-2;i++)
		  {
			  String value=table.findElements(By.cssSelector("div.cb-col.cb-col-8.text-right.text-bold")).get(i+1).getText();
			  int intvalue=Integer.parseInt(value); //Convert Numeric String Value to Integer
			  sum=sum+intvalue;
			  String total=table.findElements(By.cssSelector("div.cb-col.cb-col-8.text-right.text-bold")).get(i+2).getText();
			  int inttotal=Integer.parseInt(total);
			  
			  if(sum==inttotal)
			  {
				  System.out.println("Sum of all the runs scored is: "+sum);
				  System.out.println("Given score total is: "+inttotal);
				  System.out.println("PASS - Calculation Correct");
				  
			  }
		  }
		
}

}
