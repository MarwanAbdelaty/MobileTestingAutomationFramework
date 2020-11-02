package pages.MedicalHistory;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;

public class Procedure extends BasePage{
	
	public Procedure (AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@text,'Example: laser, tooth')]")
    private AndroidElement txt_ProcedureName;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Doctor name…']")
    private AndroidElement txt_DoctorName;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	  public void insertOperationName(String ProcedureName) throws InterruptedException  {
			
		  	Thread.sleep(2000);
		  	txt_ProcedureName.click();
		  	Thread.sleep(1000);
		  	txt_ProcedureName.clear();
	    	Thread.sleep(1000);
	    	txt_ProcedureName.sendKeys(ProcedureName);
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	  
	  public void insertDoctorName(String DoctorName) throws InterruptedException  {
			
		  	Thread.sleep(2000);
		  	txt_DoctorName.click();
		  	Thread.sleep(1000);
		  	txt_DoctorName.clear();
	    	Thread.sleep(1000);
	    	txt_DoctorName.sendKeys(DoctorName);
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
