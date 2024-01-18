package example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservaVuelo extends PageObject {

    public static final Target LIST_DEPARTURE =Target.the("Lista de partida").located(By.name("fromPort"));
    public static final Target LIST_DESTINATION =Target.the("Lista de destino").located(By.name("toPort"));
    public static final Target BUTTON_FIND_FLIGHTS = Target.the("Boton Buscar Vuelo").locatedBy("//body/div[3]/form[1]/div[1]/input[1]");
    public static final Target BUTTON_CHOOSE_FLIGHT = Target.the("Boton Elegir Vuelo").locatedBy("//tbody/tr[1]/td[1]/input[1]");
    public static final Target BUTTON_PURCHASE_FLIGHT = Target.the("Boton Comprar Vuelo").locatedBy("//body/div[2]/form[1]/div[11]/div[1]/input[1]");
    public static final Target TEXT_SUCCESS = Target.the("Boton Comprar Vuelo").locatedBy("//h1[contains(text(),'Thank you for your purchase today!')]");
}
