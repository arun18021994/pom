package weektwo;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsShifting {

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
	         //here only 2 window id will be created and saved
	     for(String eachId:lounge) {driver.switchTo().window(eachId);}
	     Thread.sleep(3000);
	     driver.findElementByLinkText("Hotels").click();
	     
         Set<String> hotelsId = driver.getWindowHandles();
            //here only 3 id will be saved and this object can able to access any of the windows id .. 
	     for(String eachId:hotelsId) {driver.switchTo().window(eachId);}
	     driver.findElementByLinkText("Login").click();
	     Thread.sleep(3000);

        // here if i need to go back to 2nd window id ,there are 2 steps we can follow .
        // 1. WITHOUT BREAK STATEMENT - we can directly call the variable that we stored only 2 window id .
        // 2. WITH BREAK STATEMENT    - we can use loop and if condition there . 
	
	     // this process is for step 1 :
	    for (String eachId:lounge) {driver.switchTo().window(eachId);}
	    Thread.sleep(3000);
	    driver.findElementByLinkText("Bus Tickets").click();
	
	    Set<String> bus = driver.getWindowHandles();
	    Thread.sleep(3000);
	   // here  4 window id will be saved in this variable. 
	
	   // this process is for step 2 :
	    int i = 1;
	    for (String eachId:bus) {
	    	i++ ; 
	    	if (i==3) {driver.switchTo().window(eachId); 
	    	break ; }
// so here this condition helps us to stop the window id where we need by using the temporary variable i..
   }
	    }}
