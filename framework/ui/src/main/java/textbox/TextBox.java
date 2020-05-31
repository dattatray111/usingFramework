package textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import common.Hooks;

public class TextBox {
	private WebDriver driver;
	private By locator;
	private String description;

	public TextBox(By locator, String description) {
		this.driver = Hooks.driver;
		this.locator = locator;
		this.description = description;
	}

	public void Clear() {
		driver.findElement(locator).clear();
		Reporter.addStepLog("Teaxtbox " + description + "is cleared");
	}

	public void EnterText(String value) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
		Reporter.addStepLog(value + " is entered in Teaxtbox " + description);
	}
}
