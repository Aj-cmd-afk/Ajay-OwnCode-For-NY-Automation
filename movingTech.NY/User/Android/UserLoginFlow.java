package User.Android;

import io.appium.java_client.AppiumBy;



import base.BaseClass;

public class UserLoginFlow extends BaseClass{
	
	public void successfulUserLogin() throws InterruptedException {
		
		//Thread.sleep(5000);
		//User
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get Started']")).click();   
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.Button[@text='NONE OF THE ABOVE']")).click(); 
		Thread.sleep(1000);
		driver1.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter Mobile number']")).sendKeys("9090889090");
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue']")).click();
		Thread.sleep(2000);
		driver1.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter 4 digit OTP']")).sendKeys("7891");
		Thread.sleep(3000);
//		driver1.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter Your Name']")).sendKeys("Automation Testing");
//		Thread.sleep(2000);
//		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Your Gender']")).click();
//		Thread.sleep(2000);
//		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Male']")).click();
//		Thread.sleep(2000);
//		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Let’s go!']")).click();
//		Thread.sleep(3000);
		driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Allow Location Access']")).click();
		Thread.sleep(6000);
		driver1.findElement(AppiumBy.xpath("//android.widget.Button[@text='While using the app']")).click();
		Thread.sleep(5000);
		//driver1.findElement(AppiumBy.xpath("//android.widget.Button[@text='Allow']")).click();
		Thread.sleep(3000);
		System.out.println("User is now ready to search for Ride");
		
		//xpath for object recentre using parent child sibling way
		//driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Where to?']/../../../preceding-sibling::android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
//		System.out.println("The recenter is clicked successfully");
//		System.out.println("User Successfully Logged In");
//		Thread.sleep(2000);
	}

}
