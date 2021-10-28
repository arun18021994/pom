package weektwo.assignments.windowsansdd;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SaloonMandatoryCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.irctc.co.in/nget/train-search");
	     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
	     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
	     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
	     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
	     Set<String> allWindowId = driver.getWindowHandles(); 
	     System.out.println(allWindowId);
	     Thread.sleep(3000);
	     for(String eachId:allWindowId) {System.out.println(eachId);
	     
	     driver.switchTo().window(eachId);}
	     driver.findElementById("sidebarCollapse").click();
	     driver.findElementByLinkText("Charter").click();
	     Thread.sleep(4000);
	     driver.findElementById("enquiry-tab").click();
	     driver.findElementByName("name").sendKeys("arun");
	     driver.findElementByName("organization").sendKeys("aa construction");
	     driver.findElementByName("address").sendKeys("ayyapanthanagal");
	     driver.findElementByName("mobile").sendKeys("96770850");
	     driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[5]/input").sendKeys("arn.18@hotmail.com");
	     WebElement request = driver.findElementByName("requestFor");
	     Thread.sleep(3000);
	     Select myRequest = new Select(request);
	     myRequest.selectByIndex(1);
       	
	     driver.findElementByName("originStation").sendKeys("chennai");
	     driver.findElementByName("destnStation").sendKeys("delhi");
	     driver.findElementByName("checkInDate").click();
	     WebElement inYear= driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[2]/select");
	     
	     Select checkInYear = new Select(inYear);
	     checkInYear.selectByValue("2022");
	     Thread.sleep(2000);
	     for(int i=0;i<4;i++) {driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[1]/span[2]").click();}
	     Thread.sleep(2000);
	     
	     driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[2]/td[5]").click();
	    // driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	     Thread.sleep(2000);
	     driver.findElementByName("checkOutDate").click();
	     WebElement year = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[2]/select");
	     Select checkOutYear = new Select(year);
	     checkOutYear.selectByValue("2023");
	     Thread.sleep(2000);
	     for(int a=0;a<7;a++) {driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[1]/span[2]").click();}
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[3]/td[4]").click();
         
         Thread.sleep(3000);	    
         driver.findElementByName("durationPeriod").sendKeys("40");
	     driver.findElementByName("coachDetails").sendKeys("5"+" sl");
	     driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[13]/input").sendKeys("250");
	     driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[14]/input").sendKeys("240");
	     driver.findElementByName("charterPurpose").sendKeys("pilgrimist");
	     driver.findElementByName("services").sendKeys("catering services");
         driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
         String fields = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span").getText();
	     System.out.println(fields);
	     driver.quit();
	     
	     }
	     
		 
		

	}


