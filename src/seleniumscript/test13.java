package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dite/Desktop/check.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		boolean b=ele.isSelected();
		if(b)
		{
			System.out.println("checkbox is selected");
		}else
		{
			System.out.println("checkbox is not selected");
		}
	}

}
