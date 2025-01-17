package User.Android;

import base.BaseClass;
import io.appium.java_client.AppiumBy;

public class UserRatingScreen extends BaseClass {

    public void ratingScreen() throws InterruptedException {
    	Thread.sleep(2000);
    	driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")).click();
    	Thread.sleep(2000);
    	driver1.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Proceed Button with : Yes option selected\"]")).click();
    	//String starXPath = "//android.widget.ImageView[@content-desc=\"4star : Un Selected\"]";
       // driver1.findElement(AppiumBy.xpath(starXPath)).click();
//        for (int i = 1; i <= 5; i++) {
//            // Locate each star based on its content description
//        	Thread.sleep(2000);
//        	System.out.println("Trying to rate "+(i));
//            String starXPath = "//android.widget.ImageView[@content-desc=\"1star : Selected \"]";
//            driver1.findElement(AppiumBy.xpath(starXPath)).click();
//        }

        Thread.sleep(2000);
        String starXPath1 = "//android.widget.ImageView[@content-desc='5star : Un Selected ']";
        driver1.findElement(AppiumBy.xpath(starXPath1)).click();
        Thread.sleep(2000);
        // Locate the Proceed Button based on its content description
        String proceedButtonXPath = "//android.widget.TextView[@content-desc=\"Submit Feedback Button\"]";
        driver1.findElement(AppiumBy.xpath(proceedButtonXPath)).click();
    }
}
