package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dite/Desktop/text.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		boolean b=ele.isEnabled();
		if(b)
		{
			System.out.println("textfield is enabled");
		}else
		{
			System.out.println("textfield is disabled");
		}
	}

}
