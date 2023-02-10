package attendance;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\attendance\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://maantic.beehivehcm.com/Login?&code=4");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("MN0203");
        driver.findElement(By.id("password")).sendKeys("Neet@4869");
        driver.findElement(By.xpath("(//button)[1]")).click();
        Thread.sleep(3000);
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@data-id='EnableOption1']")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
//        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//li/a/span/span)[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'Attendance')])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("btnTimeIn")).click();
        driver.quit();
	}

}
