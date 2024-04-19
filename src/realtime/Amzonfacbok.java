package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amzonfacbok {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//a[.='Careers']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		Thread.sleep(3000);
		int x = loc.getX();
		int y=loc.getY();
		System.out.println(x+" "+y);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		TakesScreenshot ts=(TakesScreenshot) driver;
		js.executeScript("window.scrollBy('+x','+y')");
		
		Thread.sleep(6000);
		ele.click();
	}

}
