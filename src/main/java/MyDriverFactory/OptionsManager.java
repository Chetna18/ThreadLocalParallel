package MyDriverFactory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	
	public static ChromeOptions getChromeOptions(){
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximize");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("diable-popup-blocking");
		options.addArguments("--incognito--");
		
		return options;
		
		}
	
     public static FirefoxOptions getFirefoxOptions(){
		
		FirefoxOptions options = new FirefoxOptions();//1
		FirefoxProfile profile = new FirefoxProfile();//2
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		options.setCapability(FirefoxDriver.PROFILE, profile);//3
		return options;
		
		}
	
	
	
	

}
