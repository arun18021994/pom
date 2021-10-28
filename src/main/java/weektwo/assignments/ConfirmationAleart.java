package weektwo.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAleart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
        String textBox  = driver.switchTo().alert().getText();
		System.out.println(textBox);
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		WebElement myFrame = driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		driver.switchTo().frame(myFrame);
		driver.findElementByXPath("/html/body/button").click();
        String textBox1  = driver.switchTo().alert().getText();
		System.out.println(textBox1);
		driver.switchTo().alert().dismiss();
		System.out.println("canceled");
		
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		
	}

}
