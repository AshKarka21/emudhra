package realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class141 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/dite/Desktop/testt.html");
    Thread.sleep(2000);
     List<WebElement> ele = driver.findElements(By.xpath("//input"));
    for(WebElement we:ele)
    {
	 we.sendKeys("admin");
    }
	}

}
