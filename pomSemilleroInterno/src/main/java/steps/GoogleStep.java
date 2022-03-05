package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.GooglePages;
import utils.Excel;
import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GoogleStep {

    //metodos de acciones
    public void escribirMasEnter(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }
    public void darClick(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    public void limpiarTxt(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).clear();
    }

    //método que ordena las acciones
    @Step
    public void login(){
        darClick(GooglePages.getBtnLogin());
        escribirMasEnter(GooglePages.getTxtCorreo(),"pruebasqa2030@gmail.com");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        escribirMasEnter(GooglePages.getTxtContra(),"semillero2030");
    }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Step
    public void buscarConExcel(){
        try {
            leerExcel = Excel.leerXlsx("GoogleSemilleroInterno.xlsx", "Hoja1");
        } catch (IOException e){
            e.printStackTrace();
        }
        for(int i = 0; i < leerExcel.size(); i++){
            escribirMasEnter(GooglePages.getTxtBarraBusqueda(),leerExcel.get(i).get("Busquedas"));
            limpiarTxt(GooglePages.getTxtBarraBusqueda());
        }
    }

    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }
}
