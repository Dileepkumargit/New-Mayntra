package POM;
import static StepDefination.hooks.driver;
import static StepDefination.hooks.obj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	
	
	public void searchForShirts() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		driver.findElement(By.xpath(obj.getProperty("SearchForShirts"))).sendKeys("shirts");
		driver.findElement(By.xpath(obj.getProperty("SearchForShirts"))).sendKeys(Keys.ENTER);
		
	}
	
	public void selectRadomPickAndgetthedetails() {
		
		List<WebElement> results = driver.findElements(By.xpath(obj.getProperty("ShirtResults")));
		 System.out.println(results.size());
		 Random random = new Random();
		 int select = random.nextInt(results.size());
		 System.out.println(select);
		 String item = results.get(select).getText();
		 System.out.println("selected iteam : "+item);
		 results.get(select).click();
		
	}
	public void windowhadle() throws InterruptedException {
		String Mainwindows = driver.getWindowHandle();
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 Thread.sleep(1000);
		 driver.switchTo().window(tabs.get(0));
		
	}

}
