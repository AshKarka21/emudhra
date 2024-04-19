package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username' and  @name='username']")).sendKeys("karthikpngowda1998@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin' and  @name='signin']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='password' and  @type='password']")).sendKeys("karthiashu@ka21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin' and  @type='submit']")).click();
	}
}
