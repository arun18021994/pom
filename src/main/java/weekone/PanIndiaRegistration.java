package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class PanIndiaRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://panind.com/india/new_pan/");
		//driver.findElementByLinkText("Process").click();
		//drive.findElementByLinkText("Process").click();
		driver.findElementById("pan_firstname").sendKeys("raghu");
		driver.findElementById("pan_middlename").sendKeys("ram");
		driver.findElementById("pan_lastname").sendKeys("ganesh");
		driver.findElementById("pan_fatherfirstname").sendKeys("raja");
		driver.findElementById("pan_fathermiddlename").sendKeys("ram");
		driver.findElementById("pan_fatherlastname").sendKeys("ganesh");
		driver.findElementById("pan_mobilenumber").sendKeys("9677085001");
		driver.findElementById("pan_email").sendKeys("rajaram@gmail.com");
		driver.findElementById("office").click();
	    driver.findElementById("pan_dob").sendKeys("20121971");
		driver.findElementById("office").click();
		driver.findElementById("pan_dob").sendKeys("20121971");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		driver.findElementByName("pan_addressline1").sendKeys("4/269,ssk nagar");
		driver.findElementByName("pan_addressline2").sendKeys("ayyapanthangal");
		//driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElementByName("pan_cityname").sendKeys("chennai");
		driver.findElementById("pan_pincode").sendKeys("600056");
		driver.findElementByName("pan_officename").sendKeys("inc tradres");
		driver.findElementByName("pan_officeaddressline1").sendKeys("1/160");
		driver.findElementByName("pan_officeaddressline2").sendKeys("main road");
		driver.findElementByName("pan_officecityname").sendKeys("chennai");
		driver.findElementById("pan_officepincode").sendKeys("600056");
		Thread.sleep(4000);
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		driver.findElementById("pan_source").click();
		driver.findElementByXPath("//*[@id=\"msform\"]/div[16]/div[2]/input[2]").click();

	}

}
