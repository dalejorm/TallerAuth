package TestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BuyProductsSteps {

    WebDriver driverPC;

    public BuyProductsSteps(){
        driverPC = PrincipalController.getDriver();
    }

    @Then("buscar un {string} en la tienda {string}")
    public void buscarUnProductEnLaTiendaTest(String producto, String test) throws InterruptedException {
        driverPC.findElement(By.id("downshift-0-input")).sendKeys(producto);
        driverPC.findElement(By.id("downshift-0-input")).sendKeys(Keys.ENTER);
        esperar();
    }

    public void esperar() throws InterruptedException {
        Thread.sleep(30*1000);
    }
}
