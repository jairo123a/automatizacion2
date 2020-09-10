package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosPage;
import util.TiemposEspera;

public class RegistrarCita implements Task {

    String[] vector;
    TiemposEspera tiemposEspera;
    public RegistrarCita(String[] vector){
       this.vector=vector;


    }
   public  static RegistrarCita agendar(String[] vec){


        return new RegistrarCita(vec);

   }



   @Override
    public <T extends Actor> void performAs(T actor) {
          actor.attemptsTo(
                  Click.on(ElementosPage.agregarcita),
                  Enter.theValue(vector[0]).into(ElementosPage.fecha),
                  Enter.theValue(vector[1]).into(ElementosPage.idpaciente),
                  Enter.theValue(vector[2]).into(ElementosPage.iddoctot),
                  Enter.theValue(vector[3]).into(ElementosPage.comentario),
                  Click.on(ElementosPage.guardar)
          );

        tiemposEspera.tiempo();

    }
}
