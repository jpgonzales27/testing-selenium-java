package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberCase = 0;
    private DriverManager driverManager;

    //@Before metodo que se ejecutara al inicio del escenario
    @Before
    public void setup(){
        numberCase++;
        System.out.println("Se esta ejecutando el caso numero: "+numberCase);
        //Instanciamos nuestro factory
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        //indicamos que usaremos la interfaz de chrome
        driver = driverManager.getDriver();
        //url de la pagina web a testeas
        driver.get("https://imalittletester.com/");
        //maximizamos la pantalla
        driver.manage().window().maximize();
    }

    //@Afeter metodo que se ejecutara al final del escenario
    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+numberCase+" se ejecuto correctamente");
        //cerramos el navegador
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
