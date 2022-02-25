
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BrowserAutomation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws MalformedURLException {
		// TODO Auto-generated method stub

	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		
	
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "diq4mje6pfemeexg");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		WebDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		

		
		driver.get("https://www.amazon.com/");
		
	}
	

}
