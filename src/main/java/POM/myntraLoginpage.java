package POM;
import static StepDefination.hooks.driver;
import static StepDefination.hooks.obj;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myntraLoginpage {
	
	
	public void clickOnLogin() throws InterruptedException, IOException {
		 Thread.sleep(5000);
//		 System.out.println(obj.getProperty("MoveToProfile"));
		 Actions Action = new Actions(driver);
		 WebElement mouse = driver.findElement(By.xpath(obj.getProperty("MoveToProfile")));
		 Action.moveToElement(mouse).perform();
		 driver.findElement(By.xpath(obj.getProperty("ClickOnLogin"))).click();
	} 
	
	public void enterTheLoginDetails() throws InterruptedException, AWTException {
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(obj.getProperty("EnterTheMobileNumber"))));
//		WebElement Number =  driver.findElement(By.xpath(obj.getProperty("EnterTheMobileNumber")));
//		Thread.sleep(5000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath(obj.getProperty("EnterTheMobileNumber"))).sendKeys("8686467052");
		
		driver.findElement(By.xpath(obj.getProperty("ClickOnTheContinueButton"))).click();
		driver.findElement(By.xpath(obj.getProperty("ClickOnThePassword"))).click();
		driver.findElement(By.xpath(obj.getProperty("EnterThePassword"))).sendKeys("dileep335");
	}
	
	public void clickOnTheLoginButton() {
	
		driver.findElement(By.xpath(obj.getProperty("ClickOnTheLoginButton"))).click();
	}

}
