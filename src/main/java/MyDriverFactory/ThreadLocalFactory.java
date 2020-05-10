package MyDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadLocalFactory {
	
	// threadlocal we will parallel test with different test case and with different browser of help of thread local. 
	//ex. will have 4 test cases in google.com with Chrome, and will have two test cases on facebook with FireFox browser.  by creating different threadsand help of testNG
	
	public static ThreadLocal<WebDriver>tlDriver = new ThreadLocal<>();
	
	
	
	public synchronized static void setTLDriver(String browser){//synchronized will synch  between the thread...it will not disturb the other test while its running
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			tlDriver = ThreadLocal.withInitial(() -> new ChromeDriver(OptionsManager.getChromeOptions()));
		}else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			tlDriver = ThreadLocal.withInitial(() -> new FirefoxDriver(OptionsManager.getFirefoxOptions()));
		}
	}
	
	public synchronized static WebDriver getDriver(){
		 return tlDriver.get();
		
		
	}

}
