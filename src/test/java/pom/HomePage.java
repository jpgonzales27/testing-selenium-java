package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    private String pageTitle = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    @FindBy(id = "menu-item-2008")
    private WebElement menuItemLocator;;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(pageTitle);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(menuItemLocator);
    }
}
