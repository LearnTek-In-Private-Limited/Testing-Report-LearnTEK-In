package Day1ofSelenium;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumTask4 {
	List<WebElement> links;
    public static WebDriver chooseBrowser(String browser) {
    	WebDriver driver = null;
    	if(browser.equalsIgnoreCase("chrome")) {
    		 driver=new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("firefox")) {
    		driver=new FirefoxDriver();
    	}
    	else if(browser.equalsIgnoreCase("edge")) {
    		driver=new EdgeDriver();
    	}
    	return driver;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumTask4 obj=new SeleniumTask4();
        String browser="chrome";
        WebDriver driver=chooseBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://flipkart.com");
        System.out.println("The count of links is: "+ obj.findCount(driver));
        obj.printlinks();
	}
	public int findCount(WebDriver driver) {
		links=driver.findElements(By.tagName("a"));
		return links.size();
	}
	public void printlinks() {
		for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
	}
}
