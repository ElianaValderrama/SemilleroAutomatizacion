package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.GooglePages;

import static org.junit.Assert.assertEquals;

public class GoogleOutlineStep{


    public GoogleOutlineStep() {

    }

    private void clic(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    private void escrib(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    @Step
    public void buscConGoogle(String busqueda){
        escrib(GooglePages.getTxtBarraBusqueda(), busqueda);
    }
    @Step
    public void clicLogin(){
        clic(GooglePages.getBtnLogin());
    }
    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validar(By elemento, String validacion){
        assertEquals(obtenerTexto(elemento), validacion);
    }

}
