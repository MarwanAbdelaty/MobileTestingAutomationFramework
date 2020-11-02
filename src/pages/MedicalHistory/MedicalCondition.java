package pages.MedicalHistory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class MedicalCondition extends BasePage{
	
	public MedicalCondition (AndroidDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Diagnose or Medication')]//following-sibling::android.view.ViewGroup//android.widget.EditText[contains(@text,'Doctor's diagnose')]")
	private AndroidElement txt_DiagnoseName;
	
	//@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Start Date')]//following-sibling::android.view.ViewGroup//android.widget.EditText[contains(@text,'202')]")
	//private AndroidElement txt_StartDate;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Doctor name…']")
    private AndroidElement txt_Diagnostician;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	
	  public void insertDiagnoseName(String DiagnoseName) throws InterruptedException  {
			
		  	Thread.sleep(2000);
		  	txt_DiagnoseName.click();
		  	Thread.sleep(1000);
		  	txt_DiagnoseName.clear();
	    	Thread.sleep(1000);
	    	txt_DiagnoseName.sendKeys(DiagnoseName);
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	  
	  public void insertDiagnostician(String Diagnostician) throws InterruptedException  {
			
		  	Thread.sleep(2000);
		  	txt_Diagnostician.click();
		  	Thread.sleep(1000);
		  	txt_Diagnostician.clear();
	    	Thread.sleep(1000);
	    	txt_Diagnostician.sendKeys(Diagnostician);
	    	
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	
	
	
	public void ClickonSaveIcon() throws InterruptedException {
		
		Thread.sleep(3000);
		btn_Save.click();
		Thread.sleep(3000);
	}
	
	public void ClickonCancelIcon() throws InterruptedException {
		
		Thread.sleep(3000);
		btn_Cancel.click();
		Thread.sleep(3000);
	}

	
	
	
	
	
	
	

}
