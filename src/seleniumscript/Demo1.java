package seleniumscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		String key1="webdriver.chrome.driver";
		String value1="./software/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver driver1=new ChromeDriver();
	}

}
