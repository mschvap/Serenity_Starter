package example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;

public class ReservaVuelo extends PageObject {

    public static final Target LIST_DEPARTURE =Target.the("Lista de partida").located(By.name("fromPort"));
    public static final Target LIST_DESTINATION =Target.the("Lista de destino").located(By.name("toPort"));

    /* Estrategia de selectores
    Busqueda con CSS:
    public static final Target BUTTON_FIND_FLIGHTS = Target.the("Botón Buscar Vuelo").locatedBy("css:input[value='Find Flights']");

    Busqueda con XPath:
    public static final Target BUTTON_FIND_FLIGHTS = Target.the("Botón Buscar Vuelo").locatedBy("xpath://input[@value='Find Flights']");
     */

    // Busqueda con Serenity Page Elements
    public static final Target BUTTON_FIND_FLIGHTS = Button.withText("Find Flights").called("Botón Buscar Vuelo");
    public static final Target BUTTON_CHOOSE_FLIGHT = Target.the("Boton Elegir Vuelo").locatedBy("//tbody/tr[1]/td[1]/input[1]");
    public static final Target BUTTON_PURCHASE_FLIGHT = Target.the("Boton Comprar Vuelo").locatedBy("//body/div[2]/form[1]/div[11]/div[1]/input[1]");
    public static final Target TEXT_SUCCESS = Target.the("Boton Comprar Vuelo").locatedBy("//h1[contains(text(),'Thank you for your purchase today!')]");
}
