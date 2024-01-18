package example.tasks.vuelos;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static example.userinterfaces.ReservaVuelo.*;

public class SeleccionaPaises {

    public static Performable ciudades(String desde, String hasta) {
        return Task.where("{0} selecciona origen " + desde + " y destino " + hasta,
                SelectFromOptions.byValue(desde).from(LIST_DEPARTURE),
                SelectFromOptions.byValue(hasta).from(LIST_DESTINATION),
                Click.on(BUTTON_FIND_FLIGHTS)
        );
    }
}
