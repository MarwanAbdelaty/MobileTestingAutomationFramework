package pages.Profile;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;

public class PersonalInfo extends BasePage{
	
	public PersonalInfo(AndroidDriver driver) {
		super(driver);
	}
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Personal Info']")
    private AndroidElement PersonalInfo;
	
	/////////////////////////////////////////////////////////
	@AndroidFindBy(xpath ="//android.widget.TextView[2]") //
    private List<AndroidElement> PersonalInfoFields;
	
	@AndroidFindBy(xpath ="//android.widget.ListView/android.widget.TextView") //
    private List<AndroidElement> PersonalInfoFields2;

	 @AndroidFindBy(xpath ="//android.widget.ListView/android.widget.TextView")
	  private  List<AndroidElement> list_DDL;
	
	@AndroidFindBy(xpath ="//android.widget.EditText")
	 private AndroidElement EditEmail;

	
	@AndroidFindBy(id ="android:id/button2")
    private AndroidElement btn_Cancel;
	
	
	public List<AndroidElement> getList_DDL_Data() {
		return list_DDL;
	}
	
	
	
	
	  public void ClickOnPersonalInfoTab() throws InterruptedException  {
		  	wait.until(ExpectedConditions.visibilityOf(PersonalInfo));
	    	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfo));
		   	PersonalInfo.click();
	    	Thread.sleep(3000);
		}
	  
	  
	  public void ClickOnDOB() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(0).click();
	    	Thread.sleep(3000);
		}
	  
	  
	  public void ClickOnGender() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(1).click();
	    	Thread.sleep(3000);
		}
	  public void ClickOnBloodType() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(2).click();
	    	Thread.sleep(3000);
		}
	  
	  public void ClickOnEmail() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(3).click();
	    	Thread.sleep(3000);
		}
	  
	  public void insertEmail(String email) throws InterruptedException  {
			//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
		    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
			  	Thread.sleep(3000);
			  	EditEmail.clear();
		    	Thread.sleep(1000);
		    	EditEmail.sendKeys(email);
		    	
		    //	driver.getKeyboard().pressKey(AndroidKey.ENTER);
		    //	driver.sendKeyEvent(AndroidKeyCode.ENTER);
		    //	driver.pressKey(AndroidKey.ENTER);
		    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			}
	  
	  
	  public void ClickOnMaritalStatus() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(2).click();
	    	Thread.sleep(3000);
		}
	  
	  public void ClickOnNumberofChildren() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(3).click();
	    	Thread.sleep(3000);
		}
	  
	  public void ClickOnEducation() throws InterruptedException  {
		//  	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields.get(0)));
	    //	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields.get(0)));
		  	Thread.sleep(3000);
	    	PersonalInfoFields.get(4).click();
	    	Thread.sleep(3000);
		}
	  
	    public void ClickOnCancel() throws InterruptedException  {
	    	wait.until(ExpectedConditions.visibilityOf(btn_Cancel));
	    	wait.until(ExpectedConditions.elementToBeClickable(btn_Cancel));
	    	
	    	btn_Cancel.click();
	    	Thread.sleep(2000);
		}
	    
	    public void ClickOnDataInDDL(int index) throws InterruptedException  {
	    	wait.until(ExpectedConditions.visibilityOf(PersonalInfoFields2.get(index)));
	    	wait.until(ExpectedConditions.elementToBeClickable(PersonalInfoFields2.get(index)));
	    	Thread.sleep(2000);
	    	PersonalInfoFields2.get(index).click();
	    	Thread.sleep(2000);
		}

	    public String GetText(int index) {
	    	String getText =PersonalInfoFields.get(index).getText(); // .toString()
	    	return getText;
	    }
}
