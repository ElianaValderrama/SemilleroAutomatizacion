package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageObjects.DafitiPages;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DafitiBusqBarraStep {

    public void escribirMasEnter(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }

    public void darClick(By elemento){

        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void limpiarTxt(By elemento){

        SeleniumWebDriver.driver.findElement(elemento).clear();
    }

    //validacion de texto
    private String obtenerTexto(By elemento){

        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Step
    public void buscarBarra(){
        try {
            leerExcel = Excel.leerXlsx("BusquedaDafiti.xlsx","Hoja1");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++){
            escribirMasEnter(DafitiPages.getTxtBusqueda(),leerExcel.get(i).get("Busqueda"));
            //limpiarTxt(DafitiPages.getTxtBusqueda());
            try {
                Thread.sleep(4000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    @Step
    public void buscarMenu(){
        darClick(DafitiPages.getBtnMenuMujer());
        try {Thread.sleep(5000);} catch (InterruptedException e){e.printStackTrace();}
        //darClick(DafitiPages.getBtnRopaNina());
        darClick(DafitiPages.getBtnProductoMenu());
        try {Thread.sleep(3000);} catch (InterruptedException e){e.printStackTrace();}
        darClick(DafitiPages.getBtnSubProducto());
        try {Thread.sleep(3000);} catch (InterruptedException e){e.printStackTrace();}
    }

    @Step
    public void buscarHome(){
        darClick(DafitiPages.getBtnIniDafiti());
        try {Thread.sleep(3000);} catch (InterruptedException e){e.printStackTrace();}
        darClick(DafitiPages.getBtnHome());
        try {Thread.sleep(3000);} catch (InterruptedException e){e.printStackTrace();}
        darClick(DafitiPages.getBtnMarca());
        try {Thread.sleep(3000);} catch (InterruptedException e){e.printStackTrace();}
        darClick(DafitiPages.getGtnProductoHome());
    }


}
