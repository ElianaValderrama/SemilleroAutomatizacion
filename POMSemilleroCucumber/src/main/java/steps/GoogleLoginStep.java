package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.GooglePages;

public class GoogleLoginStep {
    //llamamos el selenium web driver

    //metodos de acciones como dar clic, scroll, clic izquierdo, acciones que se pueden ejecutar
    public void escribirMasEnter(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    public void darClick(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public void limpiarTxt(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).clear();
    }
    /*
    este metodo es para separar el enter del escribir
    private void darEnter(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(Keys.ENTER);
    }
     */
    //metodo que ordena las acciones, utilizamos los metodos anteriores en orden para ejecutar la prueba
    @Step
    public void login (){
        darClick(GooglePages.getBtnLogin());
        escribirMasEnter(GooglePages.getTxtCorreo(),"elianavalderrama350@gmail.com");
        //espera explicita
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        escribirMasEnter(GooglePages.getTxtContra(),"Juanito2014*");
    }
}
