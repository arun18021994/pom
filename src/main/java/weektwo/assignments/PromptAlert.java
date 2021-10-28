package weektwo.assignments;

import java.awt.Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		Thread.sleep(5000);
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("iframeResult");
		
		WebElement useFrame = driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		
		driver.switchTo().frame(useFrame);
		
		driver.findElementByXPath("/html/body/button").click();
		String myText = driver.switchTo().alert().getText();
		System.out.println(myText);
		if(myText.equals("Please enter your name:")) {
		System.out.println("pass");
		
		driver.switchTo().alert().sendKeys("Arun");
		driver.switchTo().alert().accept();
		String useName =  driver.findElementById("demo").getText();
		System.out.println(useName);
		if(useName.contains("Arun")) {System.out.println("working");
		}else {System.out.println("Not Working");
			}		
		driver.navigate().refresh();
		driver.switchTo().frame("iframeResult");
		
        driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("jack");
		
		String alertContent = driver.switchTo().alert().getText();
		
		System.out.println(alertContent);
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("cancelled");
        driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();
		
			
		}else {System.out.println("fail");
		}
		

	}

}
