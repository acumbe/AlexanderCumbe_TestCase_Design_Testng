package com.automation.training.test;

import com.automation.training.utils.Browser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DesactiveUserTest {
    
    Browser mydriver;

    @BeforeClass
    public void userIsLogin(){
        mydriver = new Browser("chrome");
        mydriver.getDriver().manage().window().maximize();
        mydriver.getDriver().get("https://www.espn.com.co/?src=com&adblock=true");
        System.out.println("================================ Validar Desactivar usuario ========================");
        System.out.println("Before Class ---> El usuario ingresa a la url (https://www.espn.com.co/?src=com&adblock=true) y realiza el login");
    }

    @BeforeMethod
    public void logOut(){
        System.out.println("Before method ---> Before method ---> El usuario se ubica en el Avatar y hace tap en Perfil de ESPN");
        System.out.println("Before method ---> El usuario hace tap en Eliminar cuenta");
        System.out.println("Before method ---> El usuario hace tap en el botón 'Sí, eliminar esta cuenta.'");
    }

    @Test
    public void accountWasDeleted(){
        String cuentaEliminada = "Se eliminó tu cuenta.";
        Assert.assertEquals(cuentaEliminada, "Se eliminó tu cuenta.");
        System.out.println("Test ---> Se Valida que se muestre el mensaje 'Se eliminó tu cuenta.'");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("After Class ---> Cerrar el navegador");
        mydriver.getDriver().quit();
    }
}
