package Day1ofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to open browser automatically
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
         name.clear();
         name.sendKeys("9350887997");
         WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
         pass.sendKeys("980gds");
         WebElement submit=driver.findElement(By.xpath("//button[@name='login']"));
         submit.sendKeys(Keys.ENTER);
	}
}

