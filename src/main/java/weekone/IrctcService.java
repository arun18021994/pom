package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcService {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ftr.irctc.co.in/ftr/");
		driver.findElementByLinkText("New User? Signup").click();
		//driver.findElementByLinkText("Rules to create User Id").click();
		//driver.findElementByXPath("/html/body/div[5]/div[1]/button/span[1]");
		driver.findElementById("userId").sendKeys("abc_1234");
		driver.findElementById("password").sendKeys("PASS@123pas");
	    driver.findElementById("cnfPassword").sendKeys("PASS@123pas");
	    driver.findElementById("secAnswer").sendKeys("school");
	    driver.findElementById("dateOfBirth").click();
	    driver.findElementByLinkText("18").click();
	    Thread.sleep(2000);
	    driver.findElementByXPath("//*[@id=\"gender0\"]").click();
	    driver.findElementByXPath("//*[@id=\"maritalStatus0\"]").click();
	    driver.findElementById("email").sendKeys("arun.18@gmail.com");
	    driver.findElementById("fname").sendKeys("raghu");
	    driver.findElementById("mname").sendKeys("ram");
	    driver.findElementByXPath("//*[@id=\"lname\"]").sendKeys("ganesh");
	    driver.findElementById("flatNo").sendKeys("2/371");
	    driver.findElementById("street").sendKeys("nehrustreet");
	    driver.findElementById("area").sendKeys("chennai");
	    driver.findElementById("mobile").sendKeys("9677085001");
	    Thread.sleep(5000);
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
	    
	    driver.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[37]/td/button").click();
	    
	    	
		
	}

}
