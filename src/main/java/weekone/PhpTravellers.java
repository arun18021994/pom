package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravellers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.org/register.php");
		driver.manage().window().maximize();
		
		//driver.findElementById("Primary_Sidebar-Already_Registered-Login").click();
		//driver.findElementById("inputEmail").sendKeys("arunmech@gmail.com");
		//driver.findElementById("inputPassword").sendKeys("abcd@1234");
		//driver.findElementByName("rememberme").click();
		//driver.findElementByXPath("//*[@id=\"recaptcha-anchor\"]/div[1]").click();
		//driver.findElementByLinkText("Home").click();
		
		driver.findElementById("inputFirstName").sendKeys("samuel");
		driver.findElementById("inputLastName").sendKeys("jackson");
		driver.findElementById("inputEmail").sendKeys("samuel123@gmail.com");
		driver.findElementById("inputPhone").sendKeys("9677085001");
		driver.findElementById("inputCompanyName").sendKeys("infotech");
		driver.findElementByName("address1").sendKeys("sams street");
		driver.findElementByName("address2").sendKeys("tnagar");
		driver.findElementById("inputCity").sendKeys("chennai");
		driver.findElementById("stateinput").sendKeys("tamilnadu");
		driver.findElementById("inputPostcode").sendKeys("600056");
		driver.findElementById("inputCountry").click();
		driver.findElementByName("customfield[2]").sendKeys("9677085001");
		driver.findElementByName("password").sendKeys("12345678");
		driver.findElementByName("password2").sendKeys("12345678");
		driver.findElementByXPath("//*[@id=\"containerPassword\"]/div[4]/div/button").click();
		driver.findElementById("inputGeneratePasswordOutput").sendKeys("A@BC*1234567");
		driver.findElementById("btnGeneratePasswordInsert").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@id=\"rc-anchor-container\"]/div[3]/div[1]").click();
		
	}

}
