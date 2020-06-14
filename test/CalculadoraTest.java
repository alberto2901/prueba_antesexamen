/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.calculadora_test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alberto
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test 
    public static void testSuma(){
        int resultado = calculadora_test.suma(2, 3);
        int esperado = 5; 
        assert.Equals();
    }
    
}
