package example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static example.userinterfaces.YopmailHomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ActivacionYopmailStepDefinitions {

    @Given("{actor} ingresa a la pagina de yopmail")
    public void ingresa_a_la_pagina_de_yopmail(Actor actor) {

        actor.attemptsTo(Open.url("https://yopmail.com/es/"));
    }
    @When("{actor} ingresa {string} electronico")
    public void ingresa_correo_electronico(Actor actor, String email) {

        actor.attemptsTo(
                Enter.theValue(email).into(INPUT_CORREO),
                Click.on(BUTTON_CORREO)
        );

        actor.attemptsTo(
                Click.on(BUTTON_VER_IMAGENES)
        );

    }
    @Then("verifica recepcion de correo electronico")
    public void verifica_recepcion_de_correo_electronico() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BUTTON_ACTIVAR_CUENTA, isVisible()).forNoMoreThan(30).seconds()
        );

        OnStage.theActorInTheSpotlight().should(seeThat(the(BUTTON_ACTIVAR_CUENTA),isPresent()));
    }
}
