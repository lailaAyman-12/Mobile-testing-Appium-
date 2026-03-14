import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class Product_Page {

    AndroidDriver driver ;

    public Product_Page(AndroidDriver driver) {
        this.driver = driver;
    }

    By headerTitleLocator = AppiumBy.androidUIAutomator("new UiSelector().text(\"PRODUCTS\")");

    public boolean checkHeaderTitleIsVisible(){
        return driver.findElement(headerTitleLocator).isDisplayed() ;
    }

}
