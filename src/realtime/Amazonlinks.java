package realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int size = ele.size();
		System.out.println(size);
		for(WebElement we:ele)
		{
			/*String name = we.getText();
			System.out.println(name);*/
			String link = we.getAttribute("href");
			System.out.println(link);
		}
	}

}
