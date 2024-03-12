package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) {
		// to launch the browser
		WebDriver driver=new ChromeDriver();
		// to launch web application
		driver.get("https://www.amazon.in/");

	}

}
