package Homework0006;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.java2d.cmm.Profile;

public class NavigationBlock extends BaseView {
    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/header/div/div/div[2]/div/button")
    private WebElement Profile;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/header/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/a[1]")
    private WebElement Open ;

    public ProfilePage OpenSuggest() {
        actions.moveToElement(Profile)
            .build().perform();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(OpenSuggestButton));
        Open.click();
        return new ProfilePage(driver);
    }
}
