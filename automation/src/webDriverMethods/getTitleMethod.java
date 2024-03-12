package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) {
		// to launch the browser
		WebDriver driver=new ChromeDriver();
		// to launch web application
	    driver.get("https://www.amazon.in/");
	    String ActualTitle = driver.getTitle();
	   String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	   if(ActualTitle.equals(ExpectedTitle));
	   {
		   System.out.println("Test Case is Pass");
	   }
	   else 
	  {
		   System.out.println("Test Case is Fail");
	  }
	   


	}

}
