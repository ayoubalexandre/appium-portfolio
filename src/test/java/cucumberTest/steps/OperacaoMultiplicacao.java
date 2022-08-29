package cucumberTest.steps;

import appium.core.AndroidDriverFactory;
import dsl.AndroidDSL;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class OperacaoMultiplicacao {

    private AndroidDriver driver;
    private AndroidDSL dsl = new AndroidDSL();

    @And("clicar no sinal de multiplicação")
    public void clicarNoSinalDeMultiplicação() {
        dsl.clicarPorTexto("*");
    }

    @Then("o sistema deve retornar a multiplicação dos números como {string}")
    public void oSistemaDeveRetornarAMultiplicaçãoDosNúmerosComo(String resultado) {
        String valor = dsl.obterTexto();
        assertEquals(resultado, valor);
        AndroidDriverFactory.killAndroidDriver();
    }
}
