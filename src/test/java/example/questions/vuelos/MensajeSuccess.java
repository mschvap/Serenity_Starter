package example.questions.vuelos;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static example.userinterfaces.ReservaVuelo.TEXT_SUCCESS;

public class MensajeSuccess {

    public static Question<String> mensajePresente(){
        return Text.of(TEXT_SUCCESS);
    }
}
