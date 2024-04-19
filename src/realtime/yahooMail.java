package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooMail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");//Karthiashu@abofrb21
		WebDriver driver=new ChromeDriver();//karthikpngowda1998dummy100@yahoo.com
		driver.get("https://login.yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username' and  @name='username']")).sendKeys("karthikpngowda1998@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin' and  @name='signin']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='password' and  @type='password']")).sendKeys("karthiashu@ka21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin' and  @type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon mail' and @title='Mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-test-id='compose-button' and text()='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field' and @type='text']")).sendKeys("karthikpngowda1998dummy100@yahoo.com"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject' and @placeholder='Subject']")).sendKeys("Testmail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body' and @role='textbox']")).sendKeys("testing mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username' and  @name='username']")).sendKeys("karthikpngowda1998dummy100@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin' and  @name='signin']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='password' and  @type='password']")).sendKeys("Karthiashu@abofrb21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin' and  @type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon mail' and @title='Mail']")).click();
	}

}
