package Learning;

import io.qameta.allure.*;
import io.qameta.allure.junit4.AllureJunit4;
import org.junit.Rule;
import org.junit.Test;

@Epic("Authentication")
@Feature("Login")
public class LoginTest {

    @Rule
    public AllureJunit4 allure = new AllureJunit4();

    @Test
    @AllureId("101")
    @Story("Valid Login")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("qa.team")
    @Description("Check login with correct credentials")
    public void validLoginTest() {
        System.out.println("Login successful");
    }
}
