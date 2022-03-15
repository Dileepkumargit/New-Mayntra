package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	public static Properties obj ;
	public static WebDriver driver;
	
	
	@Before
	public void openbrpwser() throws IOException {
			propr();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			\\ C:\\Users\\abc\\Downloads\\chromedriver_win32 (2)
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void quitTheBrowser(Scenario scenario) {
		 /*if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
		    }*/
		
//		driver.close();
//		driver.quit();
	}
		
	public static void repo() throws IOException {
		
		  obj = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\abc\\eclipse-workspace\\Myntra\\element.properties");
		 obj.load(fis);
		 
		 
	}
	public static void propr() throws IOException {
		repo();
//		System.out.println(obj.getProperty("MoveToProfile"));
	}


}
