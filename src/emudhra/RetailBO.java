package emudhra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetailBO {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://server3.qa.emudhra.net/RetailBO/");
		Thread.sleep(2000);
		WebElement oldemail= driver.findElement(By.xpath("//a[contains(text(),'Sign in with Email ID')]"));
		oldemail.click();
		WebElement emailid= driver.findElement(By.xpath("//input[@name='useremailid']"));
		emailid.sendKeys("harshitha.m@emudhra.com");
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("eMudhra@1");
		WebElement logout= driver.findElement(By.xpath("//input[@id='logoutforever']"));
		logout.click();
		WebElement login= driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
	}

}
