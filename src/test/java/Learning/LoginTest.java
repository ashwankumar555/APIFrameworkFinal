package Learning;

import io.qameta.allure.*;
import org.junit.Test;

@Epic("User Management")
@Feature("Login Feature")
public class LoginTest {

    @Test
    @AllureId("101")
    @Story("Valid Login")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("john.doe")
    @Description("Test checks valid login with correct username and password")
    public void validLoginTest() {
        // Your test logic here
        System.out.println("Login successful");
    }

    @Test
    @AllureId("102")
    @Story("Invalid Login")
    @Severity(SeverityLevel.NORMAL)
    @Owner("jane.doe")
    @Description("Test checks login with invalid credentials")
    public void invalidLoginTest() {
        // Your test logic here
        System.out.println("Login failed as expected");
    }
}
