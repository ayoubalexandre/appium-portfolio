package cucumberTest.steps;

import appium.core.AndroidDriverFactory;
import dsl.AndroidDSL;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class OperacaoDivisao {

    private AndroidDriver driver;
    private AndroidDSL dsl = new AndroidDSL();

    @Given("que a calculadora está aberta")
    public void queACalculadoraEstaAberta() {
        driver = AndroidDriverFactory.getAndroidDriver();
    }

    @And("clicar no sinal de divisão")
    public void clicarNoSinalDeDivisao() {
        dsl.clicarPorTexto("/");
    }

    @Then("o sistema deve retornar a divisão dos números como {string}")
    public void oSistemaDeveRetornarADivisaoDosNumerosComo(String resultado) {
        String valor = dsl.obterTexto();
        assertEquals(resultado, valor);
        AndroidDriverFactory.killAndroidDriver();
    }
}
