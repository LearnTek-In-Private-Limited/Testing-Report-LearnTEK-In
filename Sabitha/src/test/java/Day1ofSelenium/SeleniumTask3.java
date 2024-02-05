package Day1ofSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTask3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String url="https://learntekin-965be.web.app/login";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement close=driver.findElement(By.xpath("//span[text()='Close']"));
        JavascriptExecutor exe=( JavascriptExecutor)driver;
        exe.executeScript("arguments[0].click()", close);
         Thread.sleep(3000);
        //Login
        WebElement username=driver.findElement(By.xpath("//input[@id='basic_username']"));
        username.sendKeys("sabitha8676@gmail.com");
        Thread.sleep(3000);
        WebElement password=driver.findElement(By.xpath("//input[@id='basic_password']"));
        password.sendKeys("Sabi2107");
        Thread.sleep(3000);
        WebElement submit=driver.findElement(By.xpath("//span[text()='Submit']"));
        exe.executeScript("arguments[0].click()", submit);
        Thread.sleep(3000);
        //Register
        Thread.sleep(3000);
        WebElement reg=driver.findElement(By.xpath("//a[text()='Register']"));
        exe.executeScript("arguments[0].click()", reg);
        Thread.sleep(3000);
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("sabitha8676@gmail.com");
        Thread.sleep(3000);
        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("Sabi2107");
        Thread.sleep(3000);
        WebElement repass=driver.findElement(By.name("confirmPassword"));
        repass.sendKeys("Sabi2107");
        Thread.sleep(3000);
        WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
        register.sendKeys(Keys.ENTER);
        
        
	}

}
