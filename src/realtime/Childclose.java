package realtime;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childclose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");
	    Thread.sleep(2000);
	    driver.findElement(By.name("NewWindow")).click();
	    Set<String> allwh = driver.getWindowHandles();
	    for(String wh:allwh)
	    {
	    	driver.switchTo().window(wh);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	Thread.sleep(6000);
	    	if(title.equals("About me - qavalidation"))
	    	{
	    		driver.close();
	    	}
	    }
	}

}
