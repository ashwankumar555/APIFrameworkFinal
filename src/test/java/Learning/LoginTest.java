package Learning;

import io.qameta.allure.*;
import org.junit.Test;

@Epic("User Management")
@Feature("Login Feature")
public class LoginTest {

    @Test
    @Story("Successful Login")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("qa.team")
    @Description("Login with valid credentials")
    public void validLoginTest() {
        Allure.step("Open login page");
        Allure.step("Enter username and password");
        Allure.step("Click login button");
        System.out.println("Login successful!");
    }

    @Test
    @Story("Failed Login")
    @Severity(SeverityLevel.MINOR)
    @Owner("qa.team")
    @Description("Login with invalid credentials")
    public void invalidLoginTest() {
        Allure.step("Open login page");
        Allure.step("Enter invalid password");
        Allure.step("Click login button");
        System.out.println("Login failed!");
    }
}
