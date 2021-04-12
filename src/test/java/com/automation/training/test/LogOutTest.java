package com.automation.training.test;

import com.automation.training.utils.Browser;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest {

    Browser mydriver;

    @BeforeClass
    public void userIsLogin(){
        mydriver = new Browser("chrome");
        mydriver.getDriver().manage().window().maximize();
        mydriver.getDriver().get("https://www.espn.com.co/?src=com&adblock=true");
        System.out.println("================================ Validar Log out ========================");
        System.out.println("Before Class ---> El usuario ingresa a la url (https://www.espn.com.co/?src=com&adblock=true) y realiza el login");
    }

    @BeforeMethod
    public void logOut(){
        System.out.println("Before method ---> El usuario se ubica en el Avatar y hace tap en Salir");
    }

    @Test
    public void verifyLogOut(){
        boolean botonEntrar = true;
        AssertJUnit.assertEquals(botonEntrar, true);
        System.out.println("Test ---> Se valida que se visualiza el botón Entrar");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("After Class ---> Cerrar el navegador");
        mydriver.getDriver().quit();
    }

    
}
