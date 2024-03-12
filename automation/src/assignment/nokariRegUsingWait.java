package assignment;

import java.awt.SecondaryLoop;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nokariRegUsingWait {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	driver.findElement(By.id("name")).sendKeys("abhixjsdjhb");
	driver.findElement(By.id("email")).sendKeys("abhixjsdjhb@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Asdfg123");
	driver.findElement(By.id("mobile")).sendKeys("9876543210");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='focusable optionWrap selected ']")).click();
	driver.findElement(By.id("currentCity")).sendKeys("Pune");
	driver.findElement(By.className("ico-tick")).click();
	driver.findElement(By.className("submitbtn ")).click();
	
	
	
	

	}

}
