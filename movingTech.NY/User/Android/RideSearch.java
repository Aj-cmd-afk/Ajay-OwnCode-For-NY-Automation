package User.Android;

import base.BaseClass;
import io.appium.java_client.AppiumBy;

public class RideSearch extends BaseClass{
	
	public void SearchForRideFromSuggestion() throws InterruptedException {
		System.out.println("Ride Search about to start");
		Thread.sleep(3000);
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Where to?']")).click();
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Where to?']")).sendKeys("Koram");
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Koramangala']")).click();
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Confirm Location']")).click();
		
	}

}
