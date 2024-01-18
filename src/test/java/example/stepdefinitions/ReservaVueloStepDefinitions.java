package example.stepdefinitions;

import example.questions.vuelos.MensajeSuccess;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import example.tasks.vuelos.SeleccionaPaises;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static example.userinterfaces.ReservaVuelo.BUTTON_CHOOSE_FLIGHT;
import static example.userinterfaces.ReservaVuelo.BUTTON_PURCHASE_FLIGHT;
import static example.userinterfaces.ReservaVuelo.TEXT_SUCCESS;

public class ReservaVueloStepDefinitions {

    @Given("{actor} ingresa a la pagina de reserva")
    public void ingresa_a_la_pagina_de_reserva(Actor actor) {
        actor.wasAbleTo(Open.url("https://blazedemo.com/"));
    }
    @When("{actor} realiza la reserva con {string} y {string}")
    public void realiza_la_reserva(Actor actor, String desde, String hasta) {
        actor.wasAbleTo(
                SeleccionaPaises.ciudades(desde,hasta),
                Click.on(BUTTON_CHOOSE_FLIGHT),
                Click.on(BUTTON_PURCHASE_FLIGHT)
        );
    }
    @Then("{actor} verifica reserva efectuada")
    public void verifica_reserva_efectuada(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(TEXT_SUCCESS, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(seeThat(the(TEXT_SUCCESS),isPresent()));

        actor.attemptsTo(
                Ensure.that(MensajeSuccess.mensajePresente()).isEqualTo("Thank you for your purchase today!")
        );
    }
}
