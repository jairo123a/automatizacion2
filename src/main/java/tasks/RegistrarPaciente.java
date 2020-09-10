package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosPage;
import util.TiemposEspera;

public class RegistrarPaciente implements Task {
    String[] vector;
    TiemposEspera tiempoEspera;

    public RegistrarPaciente(String[] vector){

        this.vector=vector;

    }

    public static RegistrarPaciente registro(String[] datos){

        return new RegistrarPaciente(datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ElementosPage.agregarpaciente),
                Enter.theValue(vector[0]).into(ElementosPage.namepaciente),
                Enter.theValue(vector[1]).into(ElementosPage.lastnampaciente),
                Enter.theValue(vector[2]).into(ElementosPage.telefonopaciente),
                Click.on(ElementosPage.tipoidentipaciente),
                SelectFromOptions.byVisibleText(vector[3]).from(ElementosPage.tipoidentipaciente),
                Enter.theValue(vector[4]).into(ElementosPage.numerodpcumentopaciente),
                Click.on(ElementosPage.botonguardar)
        );

        tiempoEspera.tiempo();

    }
}
