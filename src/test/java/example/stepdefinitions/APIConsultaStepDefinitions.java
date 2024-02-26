package example.stepdefinitions;

import example.model.Usuario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class APIConsultaStepDefinitions {

    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @When("{actor} consume el servicio de consutla de usuario con {string}")
    public void consume_el_servicio_de_consutla_de_usuario(Actor actor, String id) {

        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://reqres.in");

        actor.whoCan(CallAnApi.at(theRestApiBaseUrl));

        actor.attemptsTo(
                Get.resource("/api/users/{id}").with( request -> request.pathParam("id", id))
                        .with(request -> request.header("Content-Type", "application/json"))
        );
    }

    @Then("verifica que la consulta retorna {string} y {string} correctos")
    public void verifica_que_la_consulta_retorna_vaores_correctos(String nombre, String correo) {

        //opcion 1
        OnStage.theActorInTheSpotlight().should(
                seeThatResponse("Retorna datos correctos",
                        response -> response.statusCode(200)
                                .body("data.first_name",equalTo(nombre))
                                .body("data.email",equalTo(correo))
                )
        );

        //opcion 2
        Usuario unUsuario = SerenityRest.lastResponse()
                .jsonPath()
                .getObject("data", Usuario.class);

        Ensure.enableSoftAssertions();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(unUsuario.getFirstName()).isEqualTo(nombre),
                Ensure.that(unUsuario.getEmail()).isEqualTo(correo)
        );
        Ensure.reportSoftAssertions();
    }

}
