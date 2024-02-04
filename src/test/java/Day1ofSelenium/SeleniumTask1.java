package Day1ofSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumTask1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           WebDriver driver=new ChromeDriver();
           String url="http://www.fb.com/";
           driver.get(url);
           System.out.println(driver.getCurrentUrl());
           driver.manage().window().maximize();
           driver.manage().deleteAllCookies();
           Thread.sleep(3000);
           WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
           System.out.println("Title:"+createAccount.getText());
           JavascriptExecutor executor = (JavascriptExecutor)driver;
           executor.executeScript("arguments[0].click()", createAccount);
           Thread.sleep(2000);
           WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
           firstName.sendKeys("Sabitha");
           Thread.sleep(2000);
           WebElement surName=driver.findElement(By.xpath("//input[@name='lastname']"));
           surName.sendKeys("Maniraj");
           Thread.sleep(2000);
           WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
           email.sendKeys("abc@gmail.com");
           Thread.sleep(2000);
           WebElement emailconf=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
           emailconf.sendKeys("abc@gmail.com");
           Thread.sleep(2000);
           WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
           pass.sendKeys("abc@123_76");
           Thread.sleep(2000);
           WebElement dayDropdown = driver.findElement(By.id("day"));
           executor.executeScript("arguments[0].click()", dayDropdown);
           Select selectDay = new Select(driver.findElement(By.name("birthday_day")));
           selectDay.selectByValue("29");
           Thread.sleep(2000);
           WebElement monthDropDown=driver.findElement(By.id("month"));
           executor.executeScript("arguments[0].click()", monthDropDown);
           Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
           selectMonth.selectByValue("7");
           Thread.sleep(2000);
           WebElement yearDropdown = driver.findElement(By.id("year"));
           executor.executeScript("arguments[0].click()", yearDropdown);
           Select selectYear = new Select(driver.findElement(By.name("birthday_year")));
           selectYear.selectByValue("2000");
           Thread.sleep(2000);
           WebElement gender=driver.findElement(By.xpath("//input[@value='1']"));
           executor.executeScript("arguments[0].click()", gender);
           Thread.sleep(2000);
           WebElement submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
           executor.executeScript("arguments[0].click()", submit);
           String currentUrl = driver.getCurrentUrl();
           if (currentUrl.equals("https://www.facebook.com/")) {
               System.out.println("Account created successfully.");
           } else {
               System.out.println("Account creation failed.");
           }

           
	}
}
