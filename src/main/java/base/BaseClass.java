package base;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.WebElement;


public class BaseClass {
	protected static AppiumDriver driver; 
	protected static AppiumDriver driver1;
	
	public static String rideOTP = null;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		try {
			
		//	URL url = new URL("http://0.0.0.0:4723/wd/hub/");
            
		//	Driver
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("platformName", "Android"); // Corrected spelling
//			//cap.setCapability("platformVersion", "14"); // Make sure this matches the device's platform version
//			cap.setCapability("platformVersion", "13");
//			//cap.setCapability("deviceName", "sdk_gphone64_x86_64");
//			cap.setCapability("deviceName", "Galaxy A51");
//			//cap.setCapability("udid", "emulator-5554");
//			cap.setCapability("udid", "RZ8N91FWYXT");
//			//      cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//			//cap.setCapability("browserName", "Chrome");
//			cap.setCapability("automationName", "UiAutomator2");
//			cap.setCapability("app", "/Users/sumedh.kp/eclipse-workspace/NammaYatriAutomation/movingTech.NY/Resources/app-nyDriver-prod-debug.apk");
//			//cap.setCapability("fullReset", true);
//			driver = new AppiumDriver(url, cap);
//			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			
			
			//User
//			DesiredCapabilities cap1 = new DesiredCapabilities();
//			cap1.setCapability("platformName", "Android"); // Corrected spelling
//			//cap1.setCapability("platformVersion", "14"); // Make sure this matches the device's platform version
//			cap1.setCapability("platformVersion", "13");
//			//cap1.setCapability("deviceName", "sdk_gphone64_x86_64");
//			cap1.setCapability("deviceName", "Iqoo Z5");
//			//cap1.setCapability("udid", "emulator-5554");
//			cap1.setCapability("udid", "1371785921000CT");
//			//      cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//			//cap.setCapability("browserName", "Chrome");
//			cap1.setCapability("automationName", "UiAutomator2");
//			cap1.setCapability("app", "/Users/sumedh.kp/eclipse-workspace/NammaYatriAutomation/movingTech.NY/Resources/app-nyUser-prod-debug.apk");
//			//cap1.setCapability("fullReset", true);
//			driver1 = new AppiumDriver(url, cap1);
//			driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			
			 DesiredCapabilities cap = new DesiredCapabilities();
		        cap.setCapability("platformName", "Android");
		        cap.setCapability("udid", "28301JEGR03129");
		        cap.setCapability("automationName", "UIAutomator2");
		        cap.setCapability("newCommandTimeout", 600);
		        cap.setCapability("app", "/Users/ajay.kumar/git/nammayatri-test-automation-without-testid/juspay.nammaYatri/resources/app-nyDriver-prod-debug.apk");
		        driver = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub/"), cap);
		        
		        
		        driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub/"), cap);
		    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		        //logger.info("Driver App Launched Successfully");
		    	

		        // Launch User App
		        DesiredCapabilities cap1 = new DesiredCapabilities();
		        cap1.setCapability("platformName", "Android");
		        cap1.setCapability("udid", "RZ8R72RE6AB"); 
		        cap1.setCapability("automationName", "UIAutomator2");
		        cap1.setCapability("newCommandTimeout", 600);
		        cap1.setCapability("app", "/Users/ajay.kumar/git/nammayatri-test-automation-without-testid/juspay.nammaYatri/resources/app-nyUser-prod-debug.apk");
		        driver1 = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub/"), cap1);
		        
		        driver1 = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub/"), cap1);
		        driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		        

		        //logger.info("User App Launched Successfully");
		} catch (Exception exp) {
			System.out.println("Cause is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
		}
	}

//	@Test
//	public void sampleTest() throws InterruptedException {
//		System.out.println("I'm here");
//		DriverLoginFlow ab = new DriverLoginFlow();
//		ab.successfulDriverLogin();
//
//	}
	


	


	
	
	
	public void scrollToText(String text) {

		driver.findElement(
				new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
						+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + text + "\").instance(0))"));
	}
	

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		if (driver1 != null) {
			driver1.quit();
		}
	}
}
