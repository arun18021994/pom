package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();
	    driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
	    driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]").click();
	   // Thread.sleep(3000);
	    //driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    driver.findElementByXPath("//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/a[1]/label").click();
	    Thread.sleep(5000);
	    driver.findElementById("userName").sendKeys("arun180294");
	    driver.findElementById("usrPwd").sendKeys("Abcde1234");
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(3000);
	    driver.findElementById("cnfUsrPwd").sendKeys("Abcde1234");
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("cat");
	    driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	    Thread.sleep(3000);
	    driver.findElementById("firstName").sendKeys("rohit");
	    driver.findElementById("middleName").sendKeys("mohammed");
	    driver.findElementById("lastname").sendKeys("adam");
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
	    driver.findElementByLinkText("2").click();
	    Thread.sleep(3000);
	    driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click();
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]").click();
	    driver.findElementById("email").sendKeys("mohadam@gmail.com");
	    driver.findElementById("mobile").sendKeys("9677085001");
	    driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	    Thread.sleep(2000);
	    driver.findElementById("resAddress1").sendKeys("no-1/160,gblock");
	    driver.findElementById("resAddress2").sendKeys("rr nagar");
	    driver.findElementById("resAddress3").sendKeys("ayyapanthangal");
	    driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("600056");
	    driver.findElementById("resState").sendKeys("tamilnadu");
	    driver.findElementById("resPhone").sendKeys("9677085501");
	    driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]/span").click();
	    driver.findElementById("offAddress1").sendKeys("no-10/16");
	    driver.findElementById("offAddress2").sendKeys("balaji street");
	    driver.findElementById("offPinCode").sendKeys("600056");
	    driver.findElementById("offState").sendKeys("tamilnadu");
	    driver.findElementById("offPhone").sendKeys("8566019253"); 
	    driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	    
  }

}
