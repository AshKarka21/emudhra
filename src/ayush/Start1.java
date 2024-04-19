package ayush;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ayuslab.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='right-button hidden-xs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("karthikpngowda1998@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("karthiashu@ka21");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
