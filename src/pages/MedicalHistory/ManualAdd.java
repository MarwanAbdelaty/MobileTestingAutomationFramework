package pages.MedicalHistory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import pages.BasePage;
import utlility.Config;

public class ManualAdd extends BasePage{
	
	public ManualAdd (AndroidDriver driver) {
		super(driver);
	}
	
	
	Config config = new Config();
	int TimeOut = Integer.parseInt((config.getProperty("Timeout")));
	WebDriverWait wait = new WebDriverWait(driver, TimeOut);
	
	public void ClickonFloatingButton() throws InterruptedException {
		
	    Dimension size = driver.manage().window().getSize();
	    int xPoint = (int) (size.width * 0.93);
	    int yPoint = (int) (size.height * 0.87);
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();

	}
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Medical Condition']")
    private AndroidElement btn_MedicalCondition;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Lab Result']")
    private AndroidElement btn_Lab;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Rad Result']")
    private AndroidElement btn_Rad;
		
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Operation']")
    private AndroidElement btn_Operation;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Medical Procedure']")
    private AndroidElement btn_Procedure;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Medication']")
    private AndroidElement btn_Medication;
	
	
	
	public void ClickonMedicalCondition() throws InterruptedException {
		Thread.sleep(3000);
		//btn_MedicalCondition.click();
	    Dimension size = driver.manage().window().getSize();
	    int xPoint = (int) (size.width * 0.25);
	    int yPoint = (int) (size.height * 0.25);
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();
		Thread.sleep(3000);
	}
	
	public void ClickonLab() throws InterruptedException {
		Thread.sleep(3000);
		btn_Lab.click();
		Thread.sleep(3000);
	}
	
	public void ClickonRad() throws InterruptedException {
		Thread.sleep(3000);
		btn_Rad.click();
		Thread.sleep(3000);
	}
	
	public void ClickonOperation() throws InterruptedException {
		Thread.sleep(3000);
		//btn_Operation.click();
	    Dimension size = driver.manage().window().getSize();
	    int xPoint = (int) (size.width * 0.75);
	    int yPoint = (int) (size.height * 0.50);
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();
		
		Thread.sleep(3000);
	}
	
	public void ClickonProcedure() throws InterruptedException {
		Thread.sleep(3000);
		//btn_Procedure.click();
		
	    Dimension size = driver.manage().window().getSize();
	    int xPoint = (int) (size.width * 0.75);
	    int yPoint = (int) (size.height * 0.65);
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();
		
		Thread.sleep(3000);
	}
	
	public void ClickonMedication() throws InterruptedException {
		Thread.sleep(3000);
	//	btn_Medication.click();
		
	    Dimension size = driver.manage().window().getSize();
	    int xPoint = (int) (size.width * 0.25);
	    int yPoint = (int) (size.height * 0.75);
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.press(PointOption.point(xPoint, yPoint)).release().perform();
		Thread.sleep(3000);
	}
	
	public void BackNavigation () throws InterruptedException {
		Thread.sleep(3000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK)); //AndroidKeyCode.BACK
		Thread.sleep(3000);
	}
	
	
	
	

}
