package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Downloads']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[.='versions']")).click();
	    Thread.sleep(2000);
	}

}
