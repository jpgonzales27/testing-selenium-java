package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra el pagina de home$")
    public void el_usuario_se_encuentra_el_pagina_de_home() throws Throwable {
        String pageTitle = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        //driver.getTitle = obtenemos el titulo de la pagina web
        Assert.assertEquals(pageTitle,driver.getTitle());
    }

    @When("^Cuando el usuario hace click en  THE LITTLE TESTER COMICS$")
    public void cuando_el_usuario_hace_click_en_THE_LITTLE_TESTER_COMICS() throws Throwable {
        //Instancioamos nuestro WebElement por id
        WebElement elemento = driver.findElement(By.id("menu-item-2008"));
        //hacemos click en el elemento
        elemento.click();
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        //Buscamos el elemento por su clase
        WebElement pageTitle = driver.findElement(By.className("page-title"));
        //Junit para los asserts
        //asserttrue para ver si el elemento esta visible en ele dom
        Assert.assertTrue("NO se redirecciono correctamente",pageTitle.isDisplayed());
        //assertequals para comparar el texto que esperamos con el que obentemos del web element
        Assert.assertEquals("Category: comics",pageTitle.getText());

    }


}
