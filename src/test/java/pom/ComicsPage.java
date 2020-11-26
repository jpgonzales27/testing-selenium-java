package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage {

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    //usamos findBy para enlazar los elementos
    @FindBy(className = "page-title")
    private WebElement titleComicsLocator;

    private String tituloCategory = "Category: comics";

    public boolean isTitleComicsDisplayed() throws Exception{
        return this.isDisplayed(titleComicsLocator) && this.getText(titleComicsLocator).equals(tituloCategory);
    }

}
