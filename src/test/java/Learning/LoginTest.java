package Learning;

import io.qameta.allure.junit4.AllureJunit4;

import org.junit.Rule;
import org.junit.Test;

public class LoginTest {

    @Rule
    public AllureJunit4 allure = new AllureJunit4(); // ✅ CORRECT: implements TestRule

    @Test
    public void sampleTest() {
        System.out.println("This is a test that should show up in Allure.");
    }
}
