package questions;

import cucumber.api.java.tr.Ve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosPage;
import util.TiemposEspera;

public class Verificacion implements Question<Boolean> {

    String vector;
    TiemposEspera tiemposEspera;

    public Verificacion(String vec) {
        this.vector= vec;

    }



    public static Verificacion pregunta(String vec){

       return new Verificacion(vec);

    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String texto;
        Boolean resultado;
        texto = Text.of(ElementosPage.verificacioncreardoctor).viewedBy(actor).asString();

        if (texto.equals(vector)) {

            resultado = true;

        } else {

            resultado = false;

        }
        return resultado;
    }

}
