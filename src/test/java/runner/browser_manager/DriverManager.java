package runner.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract class  DriverManager {

    //protected = visible en la misca clase y sus clases hijas
    protected WebDriver driver;

    //metodo abstracto que deberan implementarlo las clases hijas
    public abstract void createDriver();

    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
}
