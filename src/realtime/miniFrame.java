package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class miniFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/dite/Desktop/mainpage1.html");
	    Thread.sleep(2000);
	    driver.findElement(By.id("a1")).sendKeys("Hello");
	    Thread.sleep(2000);
	    driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    driver.findElement(By.id("a2")).sendKeys("Bye");
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    driver.findElement(By.id("b1")).sendKeys("good");
	    driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    driver.findElement(By.id("b2")).sendKeys("see you");
	    driver.switchTo().frame(0);
	    Thread.sleep(2000);
	    driver.findElement(By.id("a3")).sendKeys("soon");
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    driver.findElement(By.id("c1")).sendKeys("Morning");
	}

}
