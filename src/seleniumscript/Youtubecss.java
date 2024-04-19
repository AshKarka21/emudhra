package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubecss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kgf 2 trailer kannada");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
  }
}
