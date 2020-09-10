package Prueba.definitionscita;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verificacion;
import tasks.AbrirPagina;
import tasks.RegistrarCita;
import tasks.RegistrarDostor;

import java.util.List;

public class DefinicionCita {

    @Before
    public void serStage(){

        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^Ingresar a la pagina  del sistema de administracion de hospitales$")
    public void ingresarALaPaginaDelSistemaDeAdministracionDeHospitales() {

        OnStage.theActorCalled("jairo").wasAbleTo(AbrirPagina.abrirWeb());

    }


    @When("^Ingrese al menú AGENDAR CITA y crear un nuevo registro$")
    public void ingreseAlMenúAGENDARCITAYCrearUnNuevoRegistro(DataTable arg1) {

        List<List<String>> lista=arg1.raw();
        String vector[]=new String[5];
        for(int j=0;j<4;j++){
            vector[j]=lista.get(1).get(j).trim();

        }
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarCita.agendar(vector));

    }

    @Then("^Verificar el mensaje de ingreso exitoso del registro \"([^\"]*)\"$")
    public void verificarElMensajeDeIngresoExitosoDelRegistro(String arg1) {

         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificacion.pregunta(arg1)));

    }

}
