package homework0003;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
public class AutomationPractiseTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://habr.com/ru/");

        System.out.println();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        aop.xml      .setup()     - {System.out.println();}
        WebElement loginButton = driver.findElement(By.xpath("https://habr.com/kek/v1/auth/habrahabr/?back=/ru/all/&hl=ru"));
        loginButton.click();

        driver.findElement(By.xpath("https://habr.com/kek/v1/auth/habrahabr/?back=/ru/all/&hl=ru")).click();

        driver.findElement(By.id("email_field")).sendKeys("rustface83@gmail.com");
        driver.findElement(By.id("password_field")).sendKeys("12345678");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        driver.findElement(By.xpath("//div[@class='form__field hidden']")).click();

        driver.switchTo().parentFrame();


        driver.switchTo().parentFrame();

        driver.findElement(By.id("form__buttons s-buttons")).click();

        Thread.sleep(5000);


    }
}
