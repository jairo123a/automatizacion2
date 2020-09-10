package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosPage;
import util.TiemposEspera;

public class RegistrarDostor  implements Task {
    String[] vector;
    TiemposEspera tiempoEspera;

    public RegistrarDostor(String[] vector){

        this.vector=vector;

    }

    public static RegistrarDostor registro(String[] datos){

        return new RegistrarDostor(datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
           Click.on(ElementosPage.agregar_doctor),
           Enter.theValue(vector[0]).into(ElementosPage.name),
           Enter.theValue(vector[1]).into(ElementosPage.lastname),
           Enter.theValue(vector[2]).into(ElementosPage.telefono),
           Click.on(ElementosPage.tipoidenti),
           SelectFromOptions.byVisibleText(vector[3]).from(ElementosPage.tipoidenti),
           Enter.theValue(vector[4]).into(ElementosPage.numerodpcumento),
           Click.on(ElementosPage.botonguardar)
   );

    tiempoEspera.tiempo();

    }
}
