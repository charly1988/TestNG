package com.dantelion.testng.examples.loadtest;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.eclipse.jetty.util.Scanner.ScanListener;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.dantelion.testng.examples.exception.constants.ConstantsTest;
public class TestMultipleThreads {

    @Test(invocationCount = 5, threadPoolSize = 20)
  
    
    
    public void loadTest() throws InterruptedException {
        login();
        
        
        
    }

    public static void login() throws InterruptedException {

        System.out.printf("%n[START] Thread Id : %s is started!", Thread
                .currentThread().getId());

        
        
        WebDriver driver = new FirefoxDriver();
        driver.get(ConstantsTest.URL);
        System.out.println("Thread Id : " + Thread.currentThread().getId()
                + " Page Title: " + driver.getTitle());

        WebElement element;

        element = driver.findElement(By.name("j_username"));
        element.sendKeys(ConstantsTest.EMAIL);
        element = driver.findElement(By.name("j_password"));
        element.sendKeys(ConstantsTest.PASSWORLD);
        element = driver.findElement(By.name(""));
        element.click();
        System.out.println("Thread Id : " + Thread.currentThread().getId()
                + " Page Title: " + driver.getTitle());
		// Caso: 1 Registro de incidencias.
//        element = driver.findElement(By.className("btn btn-danger"));
//        element.click();
//
//		 //form: registro de incidencias
//        element = driver.findElement(By.id("placeIncidencias"));
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.ENTER);
//
//        element = driver.findElement(By.id("typeIncidencia"));
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.ENTER);
//
//        element = driver.findElement(By.id("description"));
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.ENTER);
//
//        element = driver.findElement(By.name("txReason"));
//
//        element = driver.findElement(By.id("generarIncidencia"));
//
//        element.click();
//
//		// fin del formuario.
//		 // caso
//        element = driver.findElement(By.id("idEvaluation"));
//
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.DOWN);
//        element.sendKeys(Keys.ENTER);
		// ------seleccionar la tabla

//		// ----
//		  element = driver.findElement(By.id("platesList"));
//		  // element.sendKeys(Keys.ARROW_DOWN);
//		  element.sendKeys(Keys.ENTER);
//		 
//		  element = driver.findElement(By.id("locationDate"));
//		  element.clear();
//		  element.sendKeys("2015/06/30");
//		 
//		  element = driver.findElement(By.id("btnQuery"));
//		  element.click();
//		 
//		  System.out.printf("%n[END] Thread Id : %s",
//		 Thread.currentThread().getId());
//		  Assert.assertEquals("Dantelion SmartLoc", driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
    
}
