package testpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public static void class Testdemo {
	
	System.setProperty("webdriver.firefox.driver", "C:\\dev files\\drivers\\geckodriver.exe") ;
	WebDriver driver = new firefoxDriver();
		 // Create a new instance of the Firefox driver
		 WebDriver driver = new FirefoxDriver();
		 
		        //Launch the Online Store Website
		 driver.get("http://www.store.demoqa.com");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
		 //Wait for 5 Sec
		 Thread.sleep(5000);
		 
		        // Close the driver
		        driver.quit();	

}
