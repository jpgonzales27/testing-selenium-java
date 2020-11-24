package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberCase = 0;

    //@Before metodo que se ejecutara al inicio del escenario
    @Before
    public void setup(){
        numberCase++;
        System.out.println("Se esta ejecutando el caso numero: "+numberCase);
        //Seteamos nuestras propiedades
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        //Instanciamos nuestro driver
        driver = new ChromeDriver();
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
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
