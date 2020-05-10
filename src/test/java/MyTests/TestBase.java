package MyTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import MyDriverFactory.ThreadLocalFactory;

public class TestBase {
	public WebDriverWait wait;
	//setup method;
	
	@BeforeMethod
	public void setUpTest(String browser){
		ThreadLocalFactory.setTLDriver(browser);
		wait = new WebDriverWait(ThreadLocalFactory.getDriver(),15);
		
				}
	
	
	@AfterMethod
	public synchronized void tearDown(){
		ThreadLocalFactory.getDriver().quit();
	}
	
	
	

}
