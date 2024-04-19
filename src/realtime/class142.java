package realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class142 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dite/Desktop/test1d.html");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int size=ele.size();
		System.out.println(size);
		/*for(int i=0;i<size;i++)
		{
			WebElement we = ele.get(i);
			we.click();
			Thread.sleep(500);
		}*/
		for(WebElement we:ele)
		{
			we.click();
			Thread.sleep(500);
		}
		Thread.sleep(2000);
		for(int i=size-1;i>=0;i--)
		{
			WebElement xe = ele.get(i);
			xe.click();
			Thread.sleep(500);
		}
	}

}
