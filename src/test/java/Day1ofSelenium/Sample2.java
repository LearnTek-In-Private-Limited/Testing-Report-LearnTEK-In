package Day1ofSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To open chrome
       WebDriver driver=new ChromeDriver();
       driver.get("https://demoqa.com/");
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       System.out.println(driver.getTitle());
       Thread.sleep(2000);
       WebElement elements=driver.findElement(By.xpath("//div[@class='avatar mx-auto white']//preceding ::h5[text()='Elements']"));
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", elements);
       driver.findElement(By.xpath("//li[@id='item-1']//child::span[text()='Check Box']")).click();
       driver.findElement(By.xpath("//button[@title='Toggle']")).click();
       driver.findElement(By.xpath("//span[text()='Desktop']//preceding::button[@title='Toggle'][1]")).click();
       driver.findElement(By.xpath("//span[text()='Commands']//preceding::span[@class='rct-checkbox'][1]")).click();
       driver.findElement(By.xpath("//li[@id=\"item-2\"]//child::span[text()='Radio Button']")).click();
       WebElement radio=driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
       JavascriptExecutor executor1 = (JavascriptExecutor)driver;
       executor1.executeScript("arguments[0].click();", radio);
       
       if(radio.isEnabled()) {
    	   System.out.println("True");
       }
       else {
    	   System.out.println("False");
       }
       Thread.sleep(3000);
       WebElement btn=driver.findElement(By.xpath("//li[@id='item-4']//child::span[text()=\"Buttons\"]"));
       JavascriptExecutor exe= (JavascriptExecutor)driver;
       exe.executeScript("arguments[0].click();", btn);
       Thread.sleep(3000);
       Actions act = new Actions(driver);
       WebElement doubleBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
       act.doubleClick(doubleBtn).perform();
       
	}

}
