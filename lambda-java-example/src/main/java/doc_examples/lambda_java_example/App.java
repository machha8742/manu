package doc_examples.lambda_java_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        


    		System.setProperty("webdriver.chrome.driver","C:\\dev files\\drivers\\chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
    		        driver.get("http://localhost:8090/spring3-mvc-maven-xml-hello-world-1.0-SNAPSHOT/");

    		    }

    }
