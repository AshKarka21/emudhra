package realtime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closewin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyPress(KeyEvent.VK_C);
	    Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_C);
	}

}
