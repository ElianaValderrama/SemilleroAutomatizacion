package pageObjects;

import org.openqa.selenium.By;

public class GooglePages {
    private static By btnLogin = By.xpath("//a[@href='https://accounts.google.com/ServiceLogin?hl=es-419&passive=true&continue=https://www.google.com/&ec=GAZAmgQ']");
    private static By txtCorreo = By.xpath("//input[@type='email']");
    private static By txtContra = By.xpath("//input[@type='password']");
    private static By txtBarraBusqueda = By.xpath("//input[@class='gLFyf gsfi']");
    private static By lblCopaAmerica = By.xpath("//span[contains(text(),'Semifinal')]");

    public static By getBtnLogin() {
        return btnLogin;
    }

    public static By getTxtCorreo() {

        return txtCorreo;
    }

    public static By getTxtContra() {
        return txtContra;
    }

    public static By getTxtBarraBusqueda() {

        return txtBarraBusqueda;
    }

    public static By getLblCopaAmerica() {
        return lblCopaAmerica;
    }
    /*
    *boton clickeable = btn
    * texto seleccionable = lbl
    * caja de texto = txt
     */
}
