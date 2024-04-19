package realtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dite/Desktop/dropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		//s.selectByValue("l");
		//s.selectByVisibleText("bajil");
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("it is multi select");
		}
		else
		{
			System.out.println("it is not multi select");
		}
		List<WebElement> se = s.getOptions();
		int size = se.size();
		System.out.println(size);
	}

}
