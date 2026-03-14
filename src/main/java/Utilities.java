import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebElement;

public class Utilities {

    public static void longPress(AndroidDriver driver, By locator) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) byToWebElement(driver, locator)).getId()
        ));
    }

    public static WebElement byToWebElement(AndroidDriver driver, By locator) {
        return driver.findElement(locator);
    }

    public static void scrollToElement(AndroidDriver driver){
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 3.0
        ));
    }


    public static void ScrollToElement1(AndroidDriver driver,String name0FElement)
    {
        String script = String.format("new UiScrollable (new UiSelector()).scrollIntoView(text(\"%s\"));",name0FElement);
        driver.findElement (AppiumBy.androidUIAutomator (script));
    }

    public static void rotate(AndroidDriver driver, int x , int y , int z){
         DeviceRotation landscape=new DeviceRotation(x ,y ,z);
        driver.rotate(landscape);

    }
}




