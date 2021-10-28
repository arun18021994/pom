package weektwo.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlearts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);
		
        driver.switchTo().frame(1);
        driver.findElementByXPath("/html/body/button").click();
        String aleartText = driver.switchTo().alert().getText();
        System.out.println(aleartText);
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.findElementById("tryhome").click();
	}

}
