import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    AndroidDriver driver ;

    By usernameLocator = AppiumBy.accessibilityId("test-Username");
    By passwordLocator = AppiumBy.accessibilityId("test-Password");
    By loginButtonLocator = AppiumBy.androidUIAutomator("new UiSelector().text(\"LOGIN\")");
    By errorMessageLocator = AppiumBy.androidUIAutomator("new UiSelector().text(\"Username and password do not match any user in this service.\")");

    public LoginPage(AndroidDriver driver){
        this.driver = driver    ;
    }

    public Product_Page Login(String username , String password){
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
        return new Product_Page(driver);
    }

    public String getErrorMessageLocator() {
        return driver.findElement(errorMessageLocator).getText();

    }
}
