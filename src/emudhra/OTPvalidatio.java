package emudhra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OTPvalidatio {
	private static final WebElement Null = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		mobileOTP("7204411536");
		emailIDOTP("karthik.pn@emudhra.com");
	}
	public static String mobileOTP(String mobno) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qaserver-int.emudhra.net:18006/OnlyForInternalUse/");
		Thread.sleep(1000);
		WebElement copybt= driver.findElement(By.xpath("//p[@class='copy']"));
		copybt.click();
		//Thread.sleep(000);
		WebElement mobOTP= driver.findElement(By.xpath("//textarea[@id='mobileSMS']"));
		mobOTP.sendKeys(mobno);
		mobOTP.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement OTPm= driver.findElement(By.xpath("//textarea[@id='mobileSMS']"));
		Thread.sleep(1000); 
		String OTPmbno=OTPm.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("mobile Number OTP is:" +OTPmbno);
		Thread.sleep(1000);
		String OTPmobno = OTPmbno.substring(0, 4);
		System.out.println("mobile Number OTP is:" +OTPmobno);
		driver.close();
		return OTPmobno;
	}
	static String emailIDOTP(String emailid) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qaserver-int.emudhra.net:18006/OnlyForInternalUse/");
		Thread.sleep(2000);
		WebElement emailOTP= driver.findElement(By.xpath("//input[@name='emailID']"));
		emailOTP.sendKeys(emailid);
		emailOTP.sendKeys(Keys.ENTER);
		WebElement OTPe= driver.findElement(By.xpath("//input[@name='emailID']"));
		Thread.sleep(2000);
		String OTPemid=OTPe.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("emailID OTP is:" +OTPemid);
		driver.close();
		return OTPemid;
	}

}
