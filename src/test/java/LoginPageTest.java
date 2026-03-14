
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void validLoginWithValidCredentials() {
      boolean expected =   new LoginPage(driver).Login("standard_user","secret_sauce")
                .checkHeaderTitleIsVisible();
        Assert.assertTrue(expected , "user did not login");

    }


    @Test
    public void loginWithInvalidCredentials(){
        new LoginPage(driver).Login("  ","  ");
        String expected = new LoginPage(driver).getErrorMessageLocator();
        Assert.assertEquals(expected,"Username and password do not match any user in this service.","massage mismatch requirements ");
    }

}
