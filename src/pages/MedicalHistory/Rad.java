package pages.MedicalHistory;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;

public class Rad extends BasePage{
	
	public Rad (AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Rad Investigation Name…']")
    private AndroidElement txt_RadName;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Radiology Name…']")
    private AndroidElement txt_RadiologyName;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	  public void insertRadiologyName(String RadiologyName) throws InterruptedException  {
		  //  wait.until(ExpectedConditions.visibilityOf(txt_Date));
	    //	wait.until(ExpectedConditions.elementToBeClickable(txt_Date));
		  	txt_RadName.click();
		  	Thread.sleep(1000);
		  	txt_RadName.clear();
	    	Thread.sleep(1000);
	    	txt_RadName.sendKeys(RadiologyName);
	    	
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	  
	  public void insertRadName(String RadName) throws InterruptedException  {
		  //  wait.until(ExpectedConditions.visibilityOf(txt_Date));
	    //	wait.until(ExpectedConditions.elementToBeClickable(txt_Date));
		    txt_RadiologyName.click();
		  	Thread.sleep(1000);
		  	txt_RadiologyName.clear();
	    	Thread.sleep(1000);
	    	txt_RadiologyName.sendKeys(RadName);
	    	
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
