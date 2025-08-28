package Learning;

import io.qameta.allure.Allure;
import io.qameta.allure.junit4.AllureJunit4;
import org.junit.Rule;
import org.junit.Test;

public class LoginTest {

    @Rule
    public AllureJunit4 allureJunit4 = new AllureJunit4();  // ⬅ Required for lifecycle hook

    @Test
    public void myTest() {
        Allure.step("This will now work.");
    }
}
