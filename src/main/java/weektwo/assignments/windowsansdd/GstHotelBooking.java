package weektwo.assignments.windowsansdd;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GstHotelBooking {

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
		     Set<String> lounge=driver.getWindowHandles();
		     for(String eachId:lounge) {driver.switchTo().window(eachId);}
		     Thread.sleep(3000);
		     driver.findElementByLinkText("Hotels").click();
		     Set<String> hotelsId = driver.getWindowHandles();
		     for(String eachId:hotelsId) {driver.switchTo().window(eachId);}
		     driver.findElementByLinkText("Login").click();
		     Thread.sleep(5000);
		     driver.findElementById("profile-tab").click();
		     driver.findElementByName("email").sendKeys("arn.19@gmail.com");
		     driver.findElementByName("mobileNo").sendKeys("9677085001");
		     driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
		     driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		     Thread.sleep(3000);
		     driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/input").sendKeys("chennai");
		     
		     Thread.sleep(3000);
		     driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/div/ul/li[1]/a/div[1]/span").click();
		     Thread.sleep(5000);
		     driver.findElementByName("dt12").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[1]/div/button/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[2]/td[3]/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[3]/td[1]/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span").click();
		     Thread.sleep(3000);
		     driver.findElementByName("dt13").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[1]/div/button/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[2]/td[3]/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[3]/td[1]/span").click();
		     driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[5]/span").click();
		     driver.findElementById("user-data-wrapper-id").click();
		     WebElement room = driver.findElementByName("hotelRoom");
		     Select myRoom = new Select(room);
		     myRoom.selectByIndex(0);
		     WebElement adult =driver.findElementByName("hotelAdult");
		     Select myAdult = new Select(adult);
		     myAdult.selectByValue("3");
		     driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click();
		     driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[5]").click();
		     Thread.sleep(5000);
		     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[3]/div/div/div[3]/button").click();
		     Thread.sleep(5000);
		     String myText = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3/a").getText();
		     System.out.println(" the hotel name is : "+myText);
		     String myPrice = driver.findElementByXPath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/p").getText();
		     System.out.println("The price for the selected hotel  is " +myPrice);
		     driver.findElementByXPath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/div[4]/button").click();
		     Thread.sleep(4000);
		     WebElement title = driver.findElementByName("title");
		     Select myTitle = new Select(title);
		     myTitle.selectByValue("1");
		     driver.findElementByName("firstName").sendKeys("krishnan");
		     driver.findElementByName("lastName").sendKeys("raj");
		     WebElement country = driver.findElementByName("country");
		     Select myCountry = new Select(country);
		     myCountry.selectByValue("India");
		     WebElement state = driver.findElementByName("state");
		     Select myState = new Select(state);
		     myState.selectByValue("TN");
		     WebElement tax = driver.findElementByName("gst");
		     Select gst = new Select(tax);
		     gst.selectByValue("Yes");
		     driver.findElementByName("companyName").sendKeys("ar traders");
		     driver.findElementByName("companyAddress").sendKeys("4/69,tnagar,chennai");
		     driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[12]/button[2]").click();
		     String gstText = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/div/span").getText();
		     System.out.println(gstText);
		     driver.quit();
	}

}
