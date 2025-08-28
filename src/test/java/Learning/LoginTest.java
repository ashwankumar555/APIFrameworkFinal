package Learning;

import io.qameta.allure.*;
import org.junit.Test;

@Epic("Authentication")
@Feature("Login")
public class LoginTest {

    @Test
    @Story("Valid Login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login with valid username and password")
    public void validLoginTest() {
        Allure.step("Open login page");
        Allure.step("Enter valid credentials");
        Allure.step("Click login");
        System.out.println("✔ Login test passed");
    }
}
