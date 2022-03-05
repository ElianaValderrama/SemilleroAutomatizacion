package pruebas;

import driver.SeleniumWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.GoogleBusquedaStep;
import steps.GoogleLoginStep;

public class Tests {
    /*Before, Test, After*/

    GoogleLoginStep loginStep = new GoogleLoginStep();
    GoogleBusquedaStep busquedaStep = new GoogleBusquedaStep();

    @Before
    public void precondiciones(){
        SeleniumWebDriver.chromeDrive("https://www.google.com/");
    }

    @Test
    public void prueba(){
        /*loginStep.login();*/
        busquedaStep.buscar();
    }

    @After
    public void postcondiciones(){

    }
}