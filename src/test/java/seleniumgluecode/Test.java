package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

public class Test extends TestBase {


    @Given("^El usuario se encuentra el pagina de home$")
    public void el_usuario_se_encuentra_el_pagina_de_home() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Cuando el usuario hace click en  THE LITTLE TESTER COMICS$")
    public void cuando_el_usuario_hace_click_en_THE_LITTLE_TESTER_COMICS() throws Throwable {
        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
           Assert.assertTrue("NO se redirecciono correctamente",comicsPage.isTitleComicsDisplayed());


    }


}
