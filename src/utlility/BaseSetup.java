package utlility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseSetup {

	public static AndroidDriver androidDriver = null;
	
	@BeforeSuite
//	@BeforeClass
	
	  public static AndroidDriver getAndroidDriver(){ 
	  
		  if (androidDriver == null)
		  {
			  setAndroidDriver();
		  }
		  
		  return androidDriver;
	  }

	 public static void setAndroidDriver(){  
    	Config config = new Config();
    	 
    	 
        System.out.println("Inside initDriver method");
    	File app = new File("App/net.andalusiagroup.andalusiabooking.apk");
        
        DesiredCapabilities cap = new DesiredCapabilities();
        
       cap.setCapability(MobileCapabilityType.PLATFORM_NAME, config.getProperty("PLATFORM_NAME"));
       cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
       cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2"); 
       cap.setCapability(MobileCapabilityType.UDID, config.getProperty("UDID")); 
       cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, config.getProperty("Timeout"));
       // cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
       cap.setCapability("unicodeKeyboard", true);

                	
     
    	
    	  String serverUrl = "http://"+config.getProperty("URL1")+":"+config.getProperty("Port")+"/wd/hub";

        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            androidDriver = new AndroidDriver(new URL(serverUrl),cap ); 

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+androidDriver);  

    }

 
	@AfterSuite
	// @AfterClass
	 
      public void tearDown(){
		 if (androidDriver != null) {
        androidDriver.quit();
		 }
		 androidDriver = null;
    }
	
	
}
