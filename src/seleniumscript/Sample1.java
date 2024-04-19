package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
