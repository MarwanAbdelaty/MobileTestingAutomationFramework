package pages.Profile;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;
import utlility.Config;




public class Lifestyle extends BasePage {

	public Lifestyle(AndroidDriver driver) {
		super(driver);
	}
	


	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	

	
	@AndroidFindBy(xpath ="//android.widget.TextView[2]")
    private List<AndroidElement> LifestyleDDL;
	
	@AndroidFindBy(id ="android:id/button2")
    private AndroidElement btn_Cancel;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView")
    private List<AndroidElement> text_None;
	
//	String[] Use_Of_Caffine = {"NONE", "OCCASIONLY ONLY", "1-2 PER DAY", "3-5 PER DAY"};
	
	// USE OF CAFFEINE DDL locator 
	 @AndroidFindBy(xpath ="//android.widget.ListView/android.widget.TextView")
	  private  List<AndroidElement> list_Use_Of_Caffeine;
	// Select select = new Select(Use_Of_Caffeine);
	// List<WebElement> list_Use_Of_Caffeine = select.getOptions();
	 

	// End USE OF CAFFEINE DDL locator 

	public List<AndroidElement> getList_Use_Of_Caffeine() {
		return list_Use_Of_Caffeine;
	}
/*
		public List<WebElement> getList_Use_Of_Caffeine() {
			return list_Use_Of_Caffeine;
		}
	 */
	public void ClickOnUseOfCaffeine() throws InterruptedException, ClassNotFoundException, SQLException  {
    	
    //	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(0)));
    //	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(0)));
    	Thread.sleep(3000);
     	LifestyleDDL.get(0).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnCancel() throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(btn_Cancel));
    	wait.until(ExpectedConditions.elementToBeClickable(btn_Cancel));
    	
    	btn_Cancel.click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnSmokingHebits() throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(1)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(1)));
    
    	LifestyleDDL.get(1).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnAlcoholConsumption() throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(2)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(2)));
    	
    	LifestyleDDL.get(2).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnActivityLevel() throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(3)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(3)));
    
    	LifestyleDDL.get(3).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnIllicitDrugUse() throws InterruptedException  {
        wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(4)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(4)));
    	Thread.sleep(2000);
    	LifestyleDDL.get(4).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnDietaryType() throws InterruptedException  {

    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(5)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(5)));
    	Thread.sleep(2000);
    	LifestyleDDL.get(5).click();
    	Thread.sleep(2000);
	}
    
    public void ClickOnDoYouUseAWheelChair() throws InterruptedException  {
    	
    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(4)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(4)));
    	LifestyleDDL.get(4).click();
  
	}
  
    public void ClickOnOrganDonor() throws InterruptedException  {
     
    	
    	
    	wait.until(ExpectedConditions.visibilityOf(LifestyleDDL.get(5)));
    	wait.until(ExpectedConditions.elementToBeClickable(LifestyleDDL.get(5)));
    	LifestyleDDL.get(5).click();
    	

	}
    
    
    public void ClickOnOCCASIONLY_ONLY(int index) throws InterruptedException  {
    	wait.until(ExpectedConditions.visibilityOf(list_Use_Of_Caffeine.get(index)));
    	wait.until(ExpectedConditions.elementToBeClickable(list_Use_Of_Caffeine.get(index)));
    	Thread.sleep(2000);
    	list_Use_Of_Caffeine.get(index).click();
    	Thread.sleep(2000);
	}
   
    
    public String GetText(int index) {
    	String getText =LifestyleDDL.get(index).getText(); // .toString()
    	return getText;
    }



}
