package Learning;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Feature("User Management")
public class LoginTest {

    private WebDriver driver;

    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Story("User registers a new account")
    @Description("This test verifies that a new user can successfully register an account on the website.")
    public void testUserRegistration() {
        // Step 1: Navigate to the registration page
        navigateToRegistrationPage("https://www.gmail.com");
        // Step 2: Fill in the registration form
        
        verifyRegistrationSuccess();
    }

    @Step("Navigate to registration page: {url}")
    public void navigateToRegistrationPage(String url) {
        driver.get(url);
    }

    @Step("Verify that the user is redirected to the dashboard")
    public void verifyRegistrationSuccess() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
