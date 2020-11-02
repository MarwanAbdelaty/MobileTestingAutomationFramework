package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import utlility.Config;


public class splashPage extends BasePage{
	
    
	public splashPage(AndroidDriver driver) {
		super(driver);
      
    }

	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	
	String Countryselected =  config.getProperty("Country");
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text='Country of Residence']")
	//	@AndroidFindBy(accessibility = "CountrySelectAutoId")
	 private AndroidElement DDLCountry;
	
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Egypt']") 
    private AndroidElement SelectEgypt ;
    
   @AndroidFindBy(xpath = "//android.widget.Button[@text='KSA']")
    private AndroidElement SelectKSA ;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    private AndroidElement btn_OK ;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
//    @AndroidFindBy(accessibility = "NxtBtnAutoId")
    private AndroidElement btn_Next ;
    
    WebDriverWait wait = new WebDriverWait(driver, TimeOut);
    
    public void openCountryDDL()  {
       wait.until(ExpectedConditions.visibilityOf(DDLCountry));	
       wait.until(ExpectedConditions.elementToBeClickable(DDLCountry));
    	DDLCountry.click();
    }
    
    public void selectEgyptCountry()  {
    	wait.until(ExpectedConditions.visibilityOf(SelectEgypt));
    	wait.until(ExpectedConditions.elementToBeClickable(SelectEgypt));
    	
    	SelectEgypt.click();
    }
    
    public void selectKSACountry()  {
    	
      	wait.until(ExpectedConditions.visibilityOf(SelectKSA));
    	wait.until(ExpectedConditions.elementToBeClickable(SelectKSA));	
    	SelectKSA.click();
    }
    
    public void clickOk()  {
    	wait.until(ExpectedConditions.visibilityOf(btn_OK));
    	wait.until(ExpectedConditions.elementToBeClickable(btn_OK));	
    	btn_OK.click();
    }
    
    public void clickNext()  {
    	wait.until(ExpectedConditions.visibilityOf(btn_Next));
    	wait.until(ExpectedConditions.elementToBeClickable(btn_Next));
    	btn_Next.click();
    }
    
    


	

}
