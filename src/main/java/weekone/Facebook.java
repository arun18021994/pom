package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
        driver.manage().window().maximize();
        driver.findElementByLinkText("English (UK)").click();
        driver.findElementById("email").sendKeys("arunmech.18@hotmail.com");
        driver.findElementById("pass").sendKeys("Siva@1234");
        driver.findElementByLinkText("Create New Account").click();
        Thread.sleep(5000);
        driver.findElementByName("firstname").sendKeys("arun");
        driver.findElementByName("lastname").sendKeys("k");
        driver.findElementByName("reg_email__").sendKeys("arunmech.18@hotmail.com");
        driver.findElementByName("reg_email_confirmation__").sendKeys("arunmech.18@hotmail.com");
        driver.findElementById("password_step_input").sendKeys("siva@1234");
        driver.findElementByXPath("(//input[@name='sex'])[2]").click();
       
		
		

	}

}
