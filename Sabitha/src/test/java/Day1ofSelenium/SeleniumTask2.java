package Day1ofSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumTask2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        String url="https://www.tripadvisor.in/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
        WebElement searchText=driver.findElement(By.xpath("//input[@name='q']"));
         searchText.sendKeys("Club Mahindra");
         Thread.sleep(3000);
         JavascriptExecutor executor=(JavascriptExecutor)driver;
         WebElement selectFirst = driver.findElement(By.xpath("//div[@id='typeahead_results']//child::a[@tabindex='-1'][1]"));
         executor.executeScript("arguments[0].click()", selectFirst);
         Thread.sleep(3000);
         WebElement review = driver.findElement(By.xpath("//span[text()='Review']"));
         executor.executeScript("arguments[0].click()", review);
         Thread.sleep(3000);
        WebElement writeReview = driver.findElement(By.xpath("//span[text()='Write a review']"));
         executor.executeScript("arguments[0].click()", writeReview);
         Thread.sleep(3000);
         WebElement rating = driver.findElement(By.xpath("//span[text()='5.0 of 5 bubbles']"));
         executor.executeScript("arguments[0].click()", rating);
         Thread.sleep(3000);
         WebElement month = driver.findElement(By.xpath("//span[@class='NK']"));
         executor.executeScript("arguments[0].click()", month);
         Thread.sleep(3000);
         WebElement selectmonth = driver.findElement(By.xpath("//span[text()='July 2023']"));
         executor.executeScript("arguments[0].click()", selectmonth);
         Thread.sleep(3000);
         WebElement solo = driver.findElement(By.xpath("//span[text()='Solo']"));
         executor.executeScript("arguments[0].click()", solo);
         Thread.sleep(3000);
         WebElement reviewText=driver.findElement(By.xpath("//textarea[@id='review-text']"));
         reviewText.sendKeys("Had a wonderful experience");
         Thread.sleep(3000);
         WebElement reviewTitle=driver.findElement(By.xpath("//input[@id='review-title']"));
         reviewTitle.sendKeys("Our Trip");
         Thread.sleep(3000);
         WebElement toConfirm = driver.findElement(By.xpath(" //span[@class='U']"));
         executor.executeScript("arguments[0].click()",  toConfirm);
         WebElement continueButton=driver.findElement(By.xpath("//span[text()='Continue']/parent::button"));
          executor.executeScript("arguments[0].click()", continueButton);
       
	}

}