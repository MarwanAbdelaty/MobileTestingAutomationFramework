package pages.MedicalHistory;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;

public class Operation extends BasePage{
	
	public Operation (AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Operation name or description…']")
    private AndroidElement txt_OperationName;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Surgeon Name…']")
    private AndroidElement txt_SurgeonName;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	  public void insertOperationName(String OperationName) throws InterruptedException  {
		
		  	Thread.sleep(2000);
		  	txt_OperationName.click();
		  	Thread.sleep(1000);
		  	txt_OperationName.clear();
	    	Thread.sleep(1000);
	    	txt_OperationName.sendKeys(OperationName);
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	  
	  public void insertSurgeonName(String SurgeonName) throws InterruptedException  {
			
		  	Thread.sleep(2000);
		  	txt_SurgeonName.click();
		  	Thread.sleep(1000);
		  	txt_SurgeonName.clear();
	    	Thread.sleep(1000);
	    	txt_SurgeonName.sendKeys(SurgeonName);
	    	
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
