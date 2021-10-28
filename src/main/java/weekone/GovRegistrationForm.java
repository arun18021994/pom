package weekone;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GovRegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
        driver.get("https://indianfrro.gov.in/frro/FormC/accom_reg.jsp?t4g=S1QRRSDS");		
		driver.findElementById("u_id").sendKeys("arun12345");
		driver.findElementById("u_pwd").sendKeys("pass1234");
		driver.findElementById("u_repwd").sendKeys("pass1234");
		driver.findElementById("u_secans").sendKeys("cat");
		driver.findElementById("u_name").sendKeys("arun");
		driver.findElementById("u_dob").sendKeys("02/02/1994");
		driver.findElementById("u_designation").sendKeys("engineer");
		driver.findElementById("u_emailid").sendKeys("arunme.12@gmail.com");
		driver.findElementById("u_mobile").sendKeys("8008008001");
		driver.findElementById("u_phone").sendKeys("1234567890");
		driver.findElementById("name").sendKeys("arun");
		driver.findElementById("capacity").sendKeys("50");
		driver.findElementById("address").sendKeys("3/89,rk nagar,chennai");
		driver.findElementById("email").sendKeys("arunme123@hotmail.com");
		driver.findElementById("mcontact").sendKeys("0987654321");
		driver.findElementById("contact").sendKeys("0011223344");
		driver.findElementByName("name_o").sendKeys("gowtham");
		driver.findElementByName("address_o").sendKeys("89,kknagar,chennai");
		driver.findElementByName("emailid_o").sendKeys("gow23@gmail.com");
		driver.findElementByName("phoneno_o").sendKeys("1122334455");
		driver.findElementByName("mobile_o").sendKeys("2233445566");
		//driver.findElementByName("add").click();
		
	    driver.findElementByName("submitb").click();
		
		
		

	}

}
