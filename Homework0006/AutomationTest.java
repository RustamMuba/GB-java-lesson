package Homework0006;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Сhrome.сhromeDriver;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

public class AutomationTest {
    private static Object WebDriverManager;
    WebDriver driver;


    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        ProfilePage ProfilePage = new ProfilePage(driver);
    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPage(driver)
            .login("rustface83@gmail.com", "123456")
            .navigationBlock.OpenSuggestButton();


        Assertions.assertAll(
            () -> Assertions.assertTrue(new ProfilePage(driver).successHeader.isDisplayed()));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
