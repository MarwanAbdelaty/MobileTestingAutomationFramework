package pages;

import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utlility.Config;

public class LoginPage extends BasePage { 

	public LoginPage(AndroidDriver driver) {
		super(driver);
    }
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Login']")
    private AndroidElement lbl_Login;
	
	
	@AndroidFindBy(xpath ="//android.widget.EditText")
    private List<AndroidElement> UserNameandPassword;
	
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Login']") 
    private AndroidElement btn_Login ;
    
    WebDriverWait wait = new WebDriverWait(driver, TimeOut);
    public void LoginPageLoad()  {
    	
    	 wait.until(ExpectedConditions.visibilityOf(lbl_Login));	
		
    }
    
    public void ClickOnLoginlabel()  {
    	
    	lbl_Login.click();
    }     
	
	  public void login(String userName , String password) {
    	  				
			  UserNameandPassword.get(0).sendKeys(userName);
			  UserNameandPassword.get(1).sendKeys(password);
			  btn_Login.click();
	    	    	
	    }


}
