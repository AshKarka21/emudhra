package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmap {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://maps.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mangaluru, Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
		Thread.sleep(10000);
	}
}
