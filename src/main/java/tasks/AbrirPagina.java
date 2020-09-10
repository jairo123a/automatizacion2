package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbriPage;

public class AbrirPagina implements Task {

AbriPage abrirPage;

   public  static tasks.AbrirPagina abrirWeb(){

   return Tasks.instrumented(tasks.AbrirPagina.class);

  }


    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Open.browserOn(abrirPage));

  }
}
