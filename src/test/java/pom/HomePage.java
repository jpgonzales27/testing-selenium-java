package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    private String pageTitle = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By menuItemLocator = By.id("menu-item-2008");;

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
