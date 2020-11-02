package pages.MedicalHistory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;

public class Lab extends BasePage{
	
	public Lab (AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Lab Investigation Name…']")
    private AndroidElement txt_labName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'/202')]")
    private AndroidElement txt_Date;
	
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Laboratory Name…']")
    private AndroidElement txt_LaboratoryName;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	
	  public void insertLabName(String labName) throws InterruptedException  {
			  //  wait.until(ExpectedConditions.visibilityOf(txt_Date));
		    //	wait.until(ExpectedConditions.elementToBeClickable(txt_Date));
			  	Thread.sleep(3000);
			  	txt_labName.click();
			  	Thread.sleep(1000);
			  	txt_labName.clear();
		    	Thread.sleep(1000);
		    	txt_labName.sendKeys(labName);
		    	
		    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			}
	  
	  public void insertdate(String Date) throws InterruptedException  {
		   // wait.until(ExpectedConditions.visibilityOf(txt_Date));
	      // wait.until(ExpectedConditions.elementToBeClickable(txt_Date));
		  //	Thread.sleep(3000);
		  //	txt_Date.clear();
	    	Thread.sleep(1000);
	    	txt_Date.click();
	    	txt_Date.sendKeys(Date);
	    	
	    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		}
	  
	  public void insertLaboratoryName(String LaboratoryName) throws InterruptedException  {
		 //   wait.until(ExpectedConditions.visibilityOf(txt_LaboratoryName));
	    //	wait.until(ExpectedConditions.elementToBeClickable(txt_LaboratoryName));
		  	txt_LaboratoryName.click();
		    Thread.sleep(1000);
		  	txt_LaboratoryName.clear();
	    	Thread.sleep(1000);
	    	txt_LaboratoryName.sendKeys(LaboratoryName);
	    	
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
