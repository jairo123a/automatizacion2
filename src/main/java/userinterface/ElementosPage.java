package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementosPage extends PageObject {

    public static final net.serenitybdd.screenplay.targets.Target agregar_doctor= Target.the("Click agregar doctor").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
    public static final net.serenitybdd.screenplay.targets.Target name= Target.the("Nombre").located(By.id("name"));
    public static final net.serenitybdd.screenplay.targets.Target lastname= Target.the("Apellido").located(By.id("last_name"));
    public static final net.serenitybdd.screenplay.targets.Target telefono= Target.the("telefono").located(By.id("telephone"));
    public static final net.serenitybdd.screenplay.targets.Target tipoidenti= Target.the("celula").located(By.id("identification_type"));
    public static final net.serenitybdd.screenplay.targets.Target numerodpcumento= Target.the("numero").located(By.id("identification"));
    public static final net.serenitybdd.screenplay.targets.Target botonguardar= Target.the("boton").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/a"));
    public static final net.serenitybdd.screenplay.targets.Target verificacioncreardoctor= Target.the("verificacion").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div[2]/p"));
    public static final net.serenitybdd.screenplay.targets.Target agregarpaciente= Target.the("boton").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
    public static final net.serenitybdd.screenplay.targets.Target namepaciente= Target.the("Nombre").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[1]/input"));
    public static final net.serenitybdd.screenplay.targets.Target lastnampaciente= Target.the("Apellido").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[2]/input"));
    public static final net.serenitybdd.screenplay.targets.Target telefonopaciente= Target.the("telefono").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[3]/input"));
    public static final net.serenitybdd.screenplay.targets.Target tipoidentipaciente= Target.the("celula").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select"));
    public static final net.serenitybdd.screenplay.targets.Target numerodpcumentopaciente= Target.the("numero").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[5]/input"));
    public static final net.serenitybdd.screenplay.targets.Target agregarcita= Target.the("boton").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
    public static final net.serenitybdd.screenplay.targets.Target fecha= Target.the("paciente").located(By.id("datepicker"));
    public static final net.serenitybdd.screenplay.targets.Target idpaciente= Target.the("paciente").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[2]/input"));
    public static final net.serenitybdd.screenplay.targets.Target iddoctot= Target.the("doctor").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[3]/input"));
    public static final net.serenitybdd.screenplay.targets.Target comentario= Target.the("telefono").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[4]/textarea"));
    public static final net.serenitybdd.screenplay.targets.Target guardar= Target.the("celula").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/a"));


}
