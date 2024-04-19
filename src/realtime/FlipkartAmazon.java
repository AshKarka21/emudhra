package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		WebElement ele= driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (White, 64 GB)']/../following-sibling::div/div[1]/div[1]/div[1]"));
	    Thread.sleep(2000);
		String price = ele.getText();
		System.out.println("Iphone 12 price in Flipkart:"+price);
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Apple iPhone 12 (64GB) - White']/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
		Thread.sleep(2000);
		String price1 = ele1.getText();
		System.out.println("Iphone 12 price in Amazon:"+price1);
		Thread.sleep(2000);
		if(price.equals(price1))
		{
			System.out.println("Iphone 12 price same in Flipkart and Amazon");
		}
		else
		{
			System.out.println("Iphone 12 price different in Flipkart and Amazon");
		}
	}

}
