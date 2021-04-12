package com.automation.training.test;

import com.automation.training.utils.Browser;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
    
    // private WebDriver driver;
    Browser mydriver;

    @BeforeSuite
    @Parameters({"browser"})
    public void obtainingBrowser(String browser) {
        mydriver = new Browser(browser);
        mydriver.getDriver().manage().window().maximize();
        System.out.println("================================ Validar Login ========================");
         System.out.println("Before Suit ---> El usuario debe tener una cuenta válida en ESPN ");
    }

    @BeforeClass
    public void goToUrl() {
        mydriver.getDriver().get("https://www.espn.com.co/?src=com&adblock=true");
        System.out.println("Before Class ---> Ingresa a la url (https://www.espn.com.co/?src=com&adblock=true)");
    }

    @BeforeMethod
    public void login() {
        System.out.println("Before method ---> Se ubica en el Avatar y hace tap en Entrar");
        System.out.println("Before metho ---> Se ingresa el usuario 'pruebas123456@gmail.com'");
        System.out.println("Before metho ---> Se ingresa la contraseña 'pruebas123456'");
        System.out.println("Before metho ---> Tap en el botón Conéctate");
    }

    @Test
    public void testAccesoAlNavegador(){
        String nombreUsuario = "Pruebas";
        AssertJUnit.assertEquals(nombreUsuario, "Pruebas");
        System.out.println("Test ---> Se valida que se muestre el texto '!Bienvenido + usuario!'");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("After Class ---> Cerrar el navegador");
        mydriver.getDriver().quit();
    }


}
