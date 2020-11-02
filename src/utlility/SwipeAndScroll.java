package utlility;

import java.time.Duration;
import java.util.HashMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import pages.BasePage;

public class SwipeAndScroll extends BasePage {

	private int mostLeftPoint, mostRightPoint, mostUpperPoint, mostLowerPoint;

	Config config = new Config();
	int SwipeAndscrolltime = Integer.parseInt(config.getProperty("SwipeAndscrolltime"));

	public SwipeAndScroll(AndroidDriver driver) {
		super(driver);

		mostLeftPoint = (int) (driver.manage().window().getSize().width * 0.55);
		mostRightPoint = (int) (driver.manage().window().getSize().width * (1 - 0.15));
		mostLowerPoint = (int) (driver.manage().window().getSize().height * (1 - 0.15));
		mostUpperPoint = (int) (driver.manage().window().getSize().height * 0.60);

	}

	public void scrollUpOneScreen() {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(mostLeftPoint, mostUpperPoint))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SwipeAndscrolltime)))
				.moveTo(PointOption.point(mostLeftPoint, mostLowerPoint)).release().perform();
	}

	public void scrollDownOneScreen() {
		TouchAction touchAction = new TouchAction(driver);

		touchAction.press(PointOption.point(mostLeftPoint, mostLowerPoint))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SwipeAndscrolltime)))
				.moveTo(PointOption.point(mostLeftPoint, mostUpperPoint)).release().perform();

	}

	public static final String CLASSNAME_TEXT_STRATEGY = null;

	public void scrollToElementByResourceId(String selectorId) {
		HashMap<String, String> args = new HashMap<>();
		args.put("strategy", "-android uiautomator");
		args.put("selector", String.format("resourceId(\"%s\")", "Full.App.Name:id/" + selectorId));

		driver.executeScript("mobile: scroll", args);

	}

	public void scrollToElementByClassNameText(String selectorClass, String selectorText) {
		HashMap<String, String> args = new HashMap<>();
		args.put("strategy", "-android uiautomator");
		args.put("selector", String.format("className(\"%s\").text(\"%s\")", selectorClass, selectorText));

		driver.executeScript("mobile: scroll", args);

	}

	public void scrollToElementByClassNameName(String selectorClass, String selectorName) {
		HashMap<String, String> args = new HashMap<>();
		args.put("strategy", "-android uiautomator");
		args.put("selector", String.format("className(\"%s\").name(\"%s\")", selectorClass, selectorName));

		driver.executeScript("mobile: scroll", args);

	}

	public void swipeLeft() {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(mostLeftPoint, mostLowerPoint))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SwipeAndscrolltime)))
				.moveTo(PointOption.point(mostRightPoint, mostLowerPoint)).release().perform();
	}

	public void swipeRight() {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(mostRightPoint, mostLowerPoint))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SwipeAndscrolltime)))
				.moveTo(PointOption.point(mostLeftPoint, mostLowerPoint)).release().perform();
	}

}
