package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptHelper
{
	private WebDriver driver;
	JavascriptExecutor js;
	
	  public JavascriptHelper(WebDriver driver)
	  {
		     this.driver = driver;
		      js = (JavascriptExecutor) driver; 
	  }
	  
	 
	  
	  public void  getStatusCode() throws InterruptedException
	  {
		  System.out.println( js.executeScript("window.scrollBy(0,2500)", ""));
		  Thread.sleep(10000);
		  System.out.println( driver.getTitle());
		
	  }
}
