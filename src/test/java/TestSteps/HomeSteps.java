package TestSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeSteps {

    WebDriver driverPC;
    String URL = "https://www.wong.pe/";

    public HomeSteps (){
        driverPC = PrincipalController.getDriver();
    }

    @Given("que el usuario ingresa al home")
    public void visualizaHome(){
        navegar();
        System.out.println("Aca vamos a ejecutar las instrucciones del GIven");
        driverPC.get(URL);

    }

    @When("el visualiza el menu superior")
    public void elVisualizaElMenuSuperior() throws Exception {
        String actualURL = driverPC.getCurrentUrl();
//        if(!actualURL.equals(URL)){
//            throw new Exception("Son diferentes las URL");
//        }
        Assert.assertEquals(URL,actualURL);
        boolean divUser = driverPC.findElement(By.xpath("//div[contains(text(), 'CATEGORIAS')]")).isDisplayed();
        Assert.assertTrue(divUser);
    }

    @Then("el deberia visualizar la barra de busqueda")
    public void elDeberiaVisualizarLaBarraDeBusqueda() {
        System.out.println("Aca vamos");
        Assert.assertTrue(driverPC.findElement(By.id("downshift-0-input")).isDisplayed());
    }

    public void navegar(){
        //ejecuto el metodo para nagear
    }

}
