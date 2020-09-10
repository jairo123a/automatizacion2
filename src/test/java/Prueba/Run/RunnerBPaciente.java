package Prueba.Run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/automatizacion_hopital.feature",
        tags = "@Caso2",
        glue = "Prueba/definitionpaciente",
        snippets = SnippetType.CAMELCASE
)
public class RunnerBPaciente {
}
