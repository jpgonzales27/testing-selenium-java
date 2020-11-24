package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        //Seteamos nuestras propiedades
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver.exe");
        //Instanciamos nuestro driver de firefox
        driver = new FirefoxDriver();
    }
}
