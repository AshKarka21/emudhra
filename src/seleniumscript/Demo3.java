package seleniumscript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		//driver.quit();
	}

}
