package weektwo.assignments.windowsansdd;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.SettingsDocument;

public class IrctcTrainSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.irctc.co.in/nget/train-search");
     Thread.sleep(3000);	
     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
     driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
     Set<String> allWindowId = driver.getWindowHandles(); 
    
     Thread.sleep(3000);
     for(String eachId:allWindowId) {System.out.println(eachId);
     
     driver.switchTo().window(eachId);}
     driver.findElementById("sidebarCollapse").click();
     driver.findElementByLinkText("Book Your Coach/Train").click();
     Thread.sleep(3000);
     Set<String> afterBook = driver.getWindowHandles();
     for(String eachId:afterBook) {System.out.println("this is "+eachId);
     
     driver.switchTo().window(eachId);}
     driver.findElementByLinkText("New User? Signup").click();
     driver.findElementById("userId").sendKeys("aRUN18");
     driver.findElementById("password").sendKeys("Abc@9677");
     driver.findElementById("cnfPassword").sendKeys("Abc@9677");
     WebElement myQuestion = driver.findElementById("secQstn");
     Select question = new Select(myQuestion);
     question.selectByValue("0");
     driver.findElementById("secAnswer").sendKeys("cat");
     driver.findElementById("dateOfBirth").click();
     WebElement myMonth =  driver.findElementByClassName("ui-datepicker-month");
     Select month = new Select(myMonth);
     month.selectByIndex(1);
     Thread.sleep(3000);
     WebElement myYear = driver.findElementByClassName("ui-datepicker-year");     
     Select year = new Select(myYear);
     year.selectByValue("1994");
     driver.findElementByLinkText("18").click();
     
     driver.findElementById("gender0").click();
     driver.findElementById("maritalStatus0").click();
     driver.findElementById("email").sendKeys("arunmech.18@hotmail.com");
     WebElement work = driver.findElementById("occupation");
     Select occupation = new Select(work);
     occupation.selectByVisibleText("Self Employed");
     driver.findElementById("fname").sendKeys("arun");
     driver.findElementById("mname").sendKeys("karuppaiah");
     WebElement myNat = driver.findElementById("natinality");
     Select nation = new Select(myNat);
     nation.selectByVisibleText("Indian");
     Thread.sleep(3000);
     driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
     
     driver.findElementById("flatNo").sendKeys("no:154");
     Thread.sleep(2000);
     driver.findElementById("street").sendKeys("ssk avenue");
     driver.findElementById("area").sendKeys("ayyapanthangal");
     WebElement myCountry = driver.findElementById("country");
     Select country = new Select(myCountry);
     country.selectByValue("94");
     
     driver.findElementById("mobile").sendKeys("9677085001");
     driver.findElementById("pincode").sendKeys("600056",Keys.TAB);
     Thread.sleep(3000);
     WebElement myCity = driver.findElementById("city");
     Select city = new Select(myCity);
     city.selectByValue("Kanchipuram");
     //WebElement myState = driver.findElementById("state");
      WebElement myPost = driver.findElementById("postOffice");
      Select post = new Select(myPost);
     post.selectByValue("Iyyappanthangal S.O");
     Thread.sleep(3000);
     driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
     driver.findElementById("sameAddresses1").click();
     
     driver.findElementById("flatNoOffice").sendKeys("no:1/45");
     driver.findElementById("streetOffice").sendKeys("nehru street");
     driver.findElementById("areaOffice").sendKeys("kattupakkam");
     WebElement offCountry = driver.findElementById("countryOffice");
     Select officeCountry = new Select(offCountry);
     officeCountry.selectByVisibleText("India");
     driver.findElementById("mobileOffice").sendKeys("9677085001");
     driver.findElementById("pincodeOffice").sendKeys("600056",Keys.TAB);
     WebElement offCity= driver.findElementById("cityOffice");
     Select officeCity = new Select(offCity);
     officeCity.selectByValue("Kanchipuram");
     WebElement offPost = driver.findElementById("postOfficeOffice");
     Select officePost = new Select(offPost);
     officePost.selectByValue("Kattupakkam B.O");
     driver.quit();
    		 
	}

}
