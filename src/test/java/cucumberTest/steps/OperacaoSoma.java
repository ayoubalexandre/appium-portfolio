package cucumberTest.steps;

import appium.core.AndroidDriverFactory;
import dsl.AndroidDSL;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class OperacaoSoma {

    private AndroidDriver driver;
    private AndroidDSL dsl = new AndroidDSL();

    String n1, n2;

    @Given("a calculadora está aberta")
    public void aCalculadoraEstaAberta() {
        driver = AndroidDriverFactory.getAndroidDriver();
    }

    @When("eu clicar no sinal de subtração")
    public void clicarSinalSubtracao() {
        dsl.clicarPorTexto("-");
    }

    @When("eu digitar o primeiro {string}")
    public void digitarPrimeiroNumero(String numero1) {
        n1 = numero1;
        char[] chars = n1.toCharArray();
        for (int i=0; i<chars.length; i++){
            dsl.clicarPorTexto(String.valueOf(chars[i]));
        }
    }

    @When("clicar no sinal de soma")
    public void clicarSinalSoma() {
        dsl.clicarPorTexto("+");
    }

    @When("digitar o segundo {string}")
    public void digitarSegundoNumero(String numero2) {
        n2 = numero2;
        char[] chars = n2.toCharArray();
        for (int i=0; i<chars.length; i++) {
            dsl.clicarPorTexto(String.valueOf(chars[i]));
        }
    }

    @When("clicar no sinal de igual")
    public void clicarSinalIgual() {
        dsl.clicarPorTexto("=");
    }

    @Then("o sistema deve retornar a soma dos numeros como {string}")
    public void oSistemaDeveRetornarASomaDosNumerosComo(String resultado) {
        String valor = dsl.obterTexto();
        assertEquals(resultado, valor);
        AndroidDriverFactory.killAndroidDriver();
    }

    @Then("o sistema deve retornar a diferença dos numeros como {string}")
    public void oSistemaDeveRetornarADiferencaDosNumerosComo(String resultado) {
        String valor = dsl.obterTexto();
        assertEquals(resultado, valor);
        AndroidDriverFactory.killAndroidDriver();
    }
}
