package pages.MedicalHistory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pages.BasePage;
import utlility.Config;

public class SyncForm  extends BasePage{
	
	public SyncForm(AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(className  = "android.widget.Button")
    private AndroidElement btn_OpenSyncForm;
	
	@AndroidFindBy(className  = "android.widget.Button[1]")
    private AndroidElement btn_Floating;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text='Hospital name…']")
	private AndroidElement SelectHospital;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView")
    private List<AndroidElement> HospitalDDL;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@text,'My file number')]")
	//@AndroidFindBy(xpath ="//android.widget.EditText//parent::android.view.ViewGroup//preceding-sibling::android.widget.TextView[@text='File Number in this Hospital']")
	private AndroidElement txt_FileNumber;
	
	
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@text ,'Example:  012')]")
//	@AndroidFindBy(xpath ="//android.widget.EditText//parent::android.view.ViewGroup[@class='android.view.ViewGroup']//preceding-sibling::android.widget.TextView[@text='Mobile Number in this Hospital']")
	private AndroidElement txt_Mobilenumber;
	
	//@AndroidFindBy(xpath ="//android.widget.EditText[@text='My National ID \\ Iqama \\ Passport ID…']")
	@AndroidFindBy(xpath ="//android.widget.EditText[contains(@text,'My National ID')]")
	private AndroidElement txt_PassportID;
		
	//to get Hospital selected 
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'Select a Hospital')]//following-sibling::android.view.ViewGroup//android.widget.Button")
	private AndroidElement txt_Hospital;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'File Number in this Hospital')]//following-sibling::android.view.ViewGroup//android.widget.Button")
	private AndroidElement txt_FileNumberInThisHospital;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btn_Save;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btn_Cancel;
	
	
	@AndroidFindBy(id = "android:id/message")
	private AndroidElement ValidationMessage;
	
	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement btn_Call;
	
	@AndroidFindBy(id = "android:id/button2")
	private AndroidElement btn_CancelCall;
	
	
	
	public void ClickonConnectWithHospitals() throws InterruptedException {
		Thread.sleep(3000);
		btn_OpenSyncForm.click();
		Thread.sleep(3000);
	}
	

	/*
	public void ClickonFloatingButton() throws InterruptedException {
		
	    Dimension size = driver.manage().window().getSize();
	  
	    int xPoint = (int) (size.width * 0.93);
	    int yPoint = (int) (size.height * 0.88);

	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();

	}
	*/
	
	public void ClickonSelectHospital() throws InterruptedException {
		
		Thread.sleep(3000);
		SelectHospital.click();
		Thread.sleep(3000);
	}
	
    public void SelectHospitalName(int index) throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(HospitalDDL.get(index)));
    	wait.until(ExpectedConditions.elementToBeClickable(HospitalDDL.get(index)));
    	Thread.sleep(2000);
    	HospitalDDL.get(index).click();
    	Thread.sleep(2000);
	}
   
    /*
    public String GetText(int index) {
    	String getText =LifestyleDDL.get(index).getText(); // .toString()
    	return getText;
    }
    */

	  public void insertFileNumber(String FileNumber) throws InterruptedException  {
			//  wait.until(ExpectedConditions.visibilityOf(txt_FileNumber));
		    //	wait.until(ExpectedConditions.elementToBeClickable(txt_FileNumber));
			  	Thread.sleep(3000);
			  	txt_FileNumber.clear();
		    	Thread.sleep(1000);
		    	txt_FileNumber.sendKeys(FileNumber);
		    //	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			}
	  
	  public void insertMobileNumber(String MobileNumber) throws InterruptedException  {
			//  wait.until(ExpectedConditions.visibilityOf(txt_FileNumber));
		    //	wait.until(ExpectedConditions.elementToBeClickable(txt_FileNumber));
			  	Thread.sleep(3000);
			  	txt_Mobilenumber.clear();
		    	Thread.sleep(1000);
		    	txt_Mobilenumber.sendKeys(MobileNumber);
		   // 	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			}
	  
	  public void insertPassportID(String PassportID) throws InterruptedException  {
			//  wait.until(ExpectedConditions.visibilityOf(txt_FileNumber));
		    //	wait.until(ExpectedConditions.elementToBeClickable(txt_FileNumber));
			  	Thread.sleep(3000);
			  	txt_PassportID.clear();
		    	Thread.sleep(1000);
		    	txt_PassportID.sendKeys(PassportID);
		    //	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			}
	  
	   public void GetText() {
	    	String getText =txt_Hospital.getText(); // .toString()
	    	System.out.println(getText);
	    }
	  
	   public void Gettxt_FileNumberInThisHospital() {
	    	String getText =txt_FileNumberInThisHospital.getText(); // .toString()
	    	System.out.println(getText);
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
		
		   public void Gettxt_MessageText() {
		    	String getText =ValidationMessage.getText(); // .toString()
		    	System.out.println(getText);
		    }
		   
			public void ClickonCancelCall() throws InterruptedException {
				
				Thread.sleep(2000);
				btn_CancelCall.click();
				Thread.sleep(3000);
			}
	

}
