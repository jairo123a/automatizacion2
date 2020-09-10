package Prueba.definitionpaciente;

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
import tasks.RegistrarDostor;
import tasks.RegistrarPaciente;

import java.util.List;

public class DefinitionPaciente {

   @Before
   public void setStage(){

       OnStage.setTheStage(new OnlineCast());


   }

    @Given("^Ingresar a la pagina  del sistema de administracion de hospitales$")
    public void ingresarALaPaginaDelSistemaDeAdministracionDeHospitales() {

       OnStage.theActorCalled("jairo").wasAbleTo(AbrirPagina.abrirWeb());

    }


    @When("^Ingresar al menu agregar paciente y crear un nuevo registro$")
    public void ingresarAlMenuAgregarPacienteYCrearUnNuevoRegistro(DataTable arg1) {

        List<List<String>> lista=arg1.raw();
        String vector[]=new String[5];
        for(int j=0;j<5;j++){
            vector[j]=lista.get(1).get(j).trim();

        }

        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarPaciente.registro(vector));

    }

    @Then("^Verificar el mensaje de ingreso exitoso del registro \"([^\"]*)\"$")
    public void verificarElMensajeDeIngresoExitosoDelRegistro(String arg1) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificacion.pregunta(arg1)));

    }

}
