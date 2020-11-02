package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utlility.Config;

public class TabbedPage extends BasePage {
	
	public  TabbedPage(AndroidDriver driver) {
		super(driver);
      
    }
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Home']")
    private AndroidElement btn_Home;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Booking']")
    private AndroidElement btn_Booking;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Medical History']")
    private AndroidElement btn_MedicalHistory;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='My Profile']")
    private AndroidElement btn_MyProfile;
	

	 WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	 public void openHomePage()  {
		 wait.until(ExpectedConditions.visibilityOf(btn_Home));	
		 wait.until(ExpectedConditions.elementToBeClickable(btn_Home));
	    	btn_Home.click();
	    }
	 
	 public void openBookingPage()  {
		 wait.until(ExpectedConditions.visibilityOf(btn_Booking));	
		 wait.until(ExpectedConditions.elementToBeClickable(btn_Booking));
		 btn_Booking.click();
	    }
	 
	 public void openMedicalHistoryPage()  {
		 
		 wait.until(ExpectedConditions.visibilityOf(btn_MedicalHistory));	
		 wait.until(ExpectedConditions.elementToBeClickable(btn_MedicalHistory));
		 
		 btn_MedicalHistory.click();
	    }
	
	 public void openMyProfilePage()  {
		 
		
		 wait.until(ExpectedConditions.visibilityOf(btn_MyProfile));
		 wait.until(ExpectedConditions.elementToBeClickable(btn_MyProfile));
	    	
		 btn_MyProfile.click();
	    }
}
