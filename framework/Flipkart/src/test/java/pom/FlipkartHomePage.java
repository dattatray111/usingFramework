package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import button.Button;
import common.Hooks;
import textbox.TextBox;

public class FlipkartHomePage 
{
	private WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver)
	{
		this.driver = Hooks.driver;
	}
   
	By closePopupBtn = By.xpath("//button[@class='_2AkmmA _29YdH8']");
	By loginbtn = By.xpath("//a[@class='_3Ep39l']");
	By username = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By password = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By loginsubmitbtn = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");

	
	public Button ClosePopup = new Button(closePopupBtn,"closePopupBtn");
	public Button LoginBtn = new Button(loginbtn,"LoginBtn");
	public TextBox  UsernameTextFiled = new TextBox(username, "UsernameTextFiled");
	public TextBox  PasswordTextFiled = new TextBox(password, "UsernameTextFiled");
	public Button  LoginSubmitBtn = new Button(loginsubmitbtn, "LoginSubmitBtn");


}
