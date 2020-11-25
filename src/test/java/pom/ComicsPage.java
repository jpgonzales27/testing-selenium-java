package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    private By titleComicsLocator = By.className("page-title");
    private String tituloCategory = "Category: comics";

    public boolean isTitleComicsDisplayed() throws Exception{
        return this.isDisplayed(titleComicsLocator) && this.getText(titleComicsLocator).equals(tituloCategory);
    }

}
