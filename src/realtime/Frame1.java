package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/dite/Desktop/mainpage.html");
	    Thread.sleep(2000);
	    driver.findElement(By.id("a1")).sendKeys("Hello");
	    Thread.sleep(2000);
	    //driver.switchTo().frame(0);
	    //driver.switchTo().frame("f1");
	    WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
	    driver.switchTo().frame(ele);
	    Thread.sleep(2000);
	    driver.findElement(By.id("a2")).sendKeys("Bye");
	}

}
