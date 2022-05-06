package homework0003;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SeleniumStart {
    public static void main(String[] args, WebDriverManager ffDriver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        getWebDriver().getWindowHandles();

        driver.quit();
        ffDriver.quit();
    }
}
