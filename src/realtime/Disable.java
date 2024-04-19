package realtime;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/dite/Desktop/disbl.html");
	    Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("document.getElementById('t1').value='selenium'");//to pass value to element
	    Thread.sleep(5000);
	    js.executeScript("document.getElementById('t1').value=''");//to clear value from element
	}

}
