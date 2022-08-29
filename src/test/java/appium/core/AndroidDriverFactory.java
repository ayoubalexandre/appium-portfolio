package appium.core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverFactory {

    private static AndroidDriver androidDriver;
    public static AndroidDriver getAndroidDriver(){
        if(androidDriver == null){
            createAndroidDriver();
        }
        return androidDriver;
    }

    private static void createAndroidDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion","12");
        desiredCapabilities.setCapability("appium:deviceName", "Xiaomi");
        desiredCapabilities.setCapability("deviceId", "192.168.0.11:5555");
        desiredCapabilities.setCapability("appium:automationName", "uiAutomator2");
        desiredCapabilities.setCapability("ignoreHiddenApiPolicyError", "true");
        desiredCapabilities.setCapability("appium:app", "C:\\projetos\\prova_dasa_mobile\\dasa_calculadora\\apkRepository\\app-release.apk");
        desiredCapabilities.setCapability("appium:appPackage", "com.calculadora");
        desiredCapabilities.setCapability("appium:appActivity", "com.calculadora.MainActivity");

        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void killAndroidDriver(){
        if(androidDriver != null){
            androidDriver.quit();
            androidDriver = null;
        }
    }

}
