package button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import common.Hooks;


public class Button
{
	private  WebDriver driver;
	private By locator;
	private String description;
	
	
	 
	public Button(By locator, String description) {
		this.driver = Hooks.driver;	
		this.locator = locator;
		this.description = description;
	}

	
	public  void Click() {
		driver.findElement(locator).click();
		Reporter.addStepLog("Clicked on "+description);
	}
}
