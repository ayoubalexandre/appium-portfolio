package dsl;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static appium.core.AndroidDriverFactory.*;

public class AndroidDSL {

    @Rule
    public TestName testName = new TestName();

    public void gerarScreenShot(){
        try {
            File imagem = ((TakesScreenshot) getAndroidDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyDirectory(imagem, new File("evidencias/screenshots/"+testName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clicarPorTexto(String texto){
        getAndroidDriver().findElement(By.xpath("//*[@content-desc='Text_"+texto+"']")).click();
    }

    public String obterTexto(){
        return getAndroidDriver()
                .findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"View_container\"]/android.view.ViewGroup[1]/android.widget.TextView"))
                .getText();
    }



}
