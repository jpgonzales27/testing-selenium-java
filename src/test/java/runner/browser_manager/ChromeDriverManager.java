package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver() {
        //Seteamos nuestras propiedades
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        //Instanciamos nuestro driver
        driver = new ChromeDriver();
    }
}
