package RetailDSC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import emudhra.OTPvalidatio;

public class SSLEVoneyear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		//FirefoxOptions options=new FirefoxOptions();
		//options.addArguments("-disable-notifications");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://server3.qa.emudhra.net/EDWebsiteV5/buy_ssl_certificate");
		Thread.sleep(1000);
		WebElement AcceptCookie= driver.findElement(By.xpath("//a[text()='Accept Cookies']"));
		AcceptCookie.click();
		Thread.sleep(1000);
		WebElement Proddvbut= driver.findElement(By.xpath("//input[@id='ev']"));
		Proddvbut.click();
		WebElement dvmulti= driver.findElement(By.xpath("//input[@id='regular']"));
		dvmulti.click();
		WebElement dvval= driver.findElement(By.xpath("//input[@id='oneyear']"));
		dvval.click();
		WebElement dvcur= driver.findElement(By.xpath("//input[@id='inr']"));
		dvcur.click();
		By dvbuycer=By.xpath("//button[text()='Buy Certificate']");
		WebDriverWait Waitcert=new WebDriverWait(driver,5);
		Waitcert.until(ExpectedConditions.presenceOfElementLocated(dvbuycer));
		WebElement dvbuycert= driver.findElement(dvbuycer);
		dvbuycert.click();
		Thread.sleep(1000);
		WebElement dvname= driver.findElement(By.xpath("//input[@id='billingName']"));
		dvname.sendKeys("Karthik Pillenkevreg24");
		WebElement dvmobno= driver.findElement(By.xpath("//input[@id='billingMobile']"));
		dvmobno.sendKeys("7204311536");
		/*String mnOTP=OTPvalidatio.mobileOTP("7204411536");*/
		WebElement countinuebut= driver.findElement(By.xpath("//button[text()='Continue']"));
		countinuebut.click();
		Thread.sleep(1000);
		String mobOTP = OTPvalidatio.mobileOTP("7204311536");
		Thread.sleep(1000);
		WebElement OTPval= driver.findElement(By.xpath("//input[@id='otp']"));
		OTPval.sendKeys(mobOTP);
		Thread.sleep(1000);
		WebElement subOTP= driver.findElement(By.xpath("//button[@id='btnSubmitOtp']"));
		subOTP.click();
		Thread.sleep(4000);
		By BillingEmail=By.xpath("//input[@id='billingEmail']");
		WebDriverWait Waitemail=new WebDriverWait(driver,20);
		Waitemail.until(ExpectedConditions.presenceOfElementLocated(BillingEmail));
		WebElement BillingEmailID= driver.findElement(BillingEmail);
		BillingEmailID.sendKeys("karthik.pn@emudhra.com");
		Thread.sleep(1000);
		WebElement CompanyName= driver.findElement(By.xpath("//input[@id='companyName']"));
		CompanyName.sendKeys("ISIRI TECHNOLOGIES PRIVATE LIMITED");
		Thread.sleep(1000);
		WebElement BillingAddress= driver.findElement(By.xpath("//textarea[@id='billingAddress']"));
		BillingAddress.sendKeys("IH-10 HEMAVATHI NAGAR, ALAPE MANGALURU");
		Thread.sleep(1000);
		WebElement BillingCountry= driver.findElement(By.xpath("//select[@id='billingCountry']"));
		Select Sel_Country=new Select(BillingCountry);
		Sel_Country.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement IsGSTIN= driver.findElement(By.xpath("//input[@id='gstno']"));
		IsGSTIN.click();
		Thread.sleep(1000);
		/*WebElement GstNumber= driver.findElement(By.xpath("//input[@id='gstNumber']"));
		GstNumber.sendKeys("29AABCI9100R1Z3");
		Thread.sleep(2000);*/
		WebElement BillingState= driver.findElement(By.xpath("//select[@id='billingState']"));
		Select Sel_State=new Select(BillingState);
		Sel_State.selectByVisibleText("Karnataka");
		Thread.sleep(1000);
		WebElement BillingDistrict= driver.findElement(By.xpath("//select[@id='billingDistrict']"));
		Select Sel_District=new Select(BillingDistrict);
		Sel_District.selectByVisibleText("Dakshina Kannada");
		Thread.sleep(1000);
		WebElement BillingPincode= driver.findElement(By.xpath("//input[@id='billingPincode']"));
		BillingPincode.sendKeys("575007");
		Thread.sleep(1000);
		WebElement ProceedtoPay= driver.findElement(By.xpath("//button[@id='proceedBtnPriceSummary']"));
		ProceedtoPay.click();
		Thread.sleep(1000);
		By cardopt=By.xpath("//span[text()='Cards (Credit/Debit)']");
		WebDriverWait Waitcard=new WebDriverWait(driver,20);
		Waitcard.until(ExpectedConditions.presenceOfElementLocated(cardopt));
		WebElement Debitcard= driver.findElement(cardopt);
		Debitcard.click();
		Thread.sleep(1000);
		WebElement Cardnumber= driver.findElement(By.xpath("//input[@id='cardNumber']"));
		Cardnumber.sendKeys("5123456789012346");
		Thread.sleep(1000);
		WebElement Expiry_date_month= driver.findElement(By.xpath("//input[@id='cardExpiry']"));
		Expiry_date_month.sendKeys("0325");
		Thread.sleep(1000);
		WebElement CVV_number= driver.findElement(By.xpath("//input[@id='cardCvv']"));
		CVV_number.sendKeys("123");
		Thread.sleep(1000);
		WebElement Cnameoncard= driver.findElement(By.xpath("//input[@id='cardOwnerName']"));
		Cnameoncard.sendKeys("test");
		Thread.sleep(1000);
		WebElement PayProceed= driver.findElement(By.xpath("//span[text()='PROCEED']"));
		PayProceed.click();
		Thread.sleep(4000);
		By Passaxis=By.xpath("//input[@id='password']");
		WebDriverWait Waitaxis=new WebDriverWait(driver,20);
		Waitaxis.until(ExpectedConditions.presenceOfElementLocated(Passaxis));
		WebElement AxisSimlator= driver.findElement(Passaxis);
		AxisSimlator.sendKeys("123456");
		Thread.sleep(2000);
		/*WebElement AxisSimlator= driver.findElement(By.xpath("//input[@id='password']"));
		AxisSimlator.sendKeys("123456");*/
		Thread.sleep(2000);
		WebElement Pay_button= driver.findElement(By.xpath("//input[@id='submitBtn']"));
		Pay_button.click();
	}

}
