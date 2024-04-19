package realtime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(5000);
		}
		for(int j=0;j<3;j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(5000);
		}
	}

}
