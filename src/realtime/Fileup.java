package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/dite/Desktop/filup.html");
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.id("input file"));
	    ele.sendKeys("C:\\Users\\dite\\test.txt");
	}

}
