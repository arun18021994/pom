package weektwo.assignments.windowsansdd;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		//Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]/a").click();
		driver.findElementByXPath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/div/label/button").click();
		driver.findElementByLinkText("REGISTER").click();
		Thread.sleep(5000);
		driver.findElementById("userName").sendKeys("mohammed");
		driver.findElementById("usrPwd").sendKeys("Abc@9677");
		driver.findElementById("cnfUsrPwd").sendKeys("Abc@9677");
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[3]").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[3]/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("dog");
        driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
        driver.findElementById("firstName").sendKeys("Mohammed");
        driver.findElementById("middleName").sendKeys("navas");
        driver.findElementById("lastname").sendKeys("hussain");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div").click();
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span").click();
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
        WebElement calenderMonth = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
        Select month = new Select(calenderMonth);
        month.selectByIndex(10);
        WebElement calenderYear = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
        Select year = new Select(calenderYear);
        year.selectByValue("1994");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[1]/td[5]/a").click();
        driver.findElementByXPath("//*[@id=\"married\"]/div/div[2]/span").click();
        WebElement nation=driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select");
        Select country = new Select(nation);
        country.selectByVisibleText("India");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span").click();
        driver.findElementById("email").sendKeys("mhmd@gmail.com");
        driver.findElementById("mobile").sendKeys("9677085001");
        WebElement nationality = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
        Select origin = new Select(nationality);
        origin.selectByValue("94");
        driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
        driver.findElementById("resAddress1").sendKeys("no.251");
        driver.findElementById("resAddress2").sendKeys("ssk nagar");
        driver.findElementById("resAddress3").sendKeys("kattupakam");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("600056",Keys.TAB);
        driver.findElementById("resState").sendKeys("tamilnadu");
        WebElement city = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select");
        Select myCity = new Select(city);
        myCity.selectByValue("Kanchipuram");
        WebElement post = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
        Select postCode = new Select(post);
        postCode.selectByValue("Iyyappanthangal S.O");
        driver.findElementById("resPhone").sendKeys("9677085001");
        driver.findElementById("no").click();
        driver.findElementById("offAddress1").sendKeys("1/160");
        driver.findElementById("offAddress3").sendKeys("kattuppakam");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div").click();
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span").click();
        driver.findElementById("offPinCode").sendKeys("600056");
        driver.findElementById("offState").sendKeys("tamilnadu");
        driver.findElementById("offCity").sendKeys("chennai");
        driver.findElementById("offPostOff").sendKeys("Iyyappanthangal S.O");
        driver.findElementById("offPhone").sendKeys("9962112211");
        driver.quit();
       }
	}
