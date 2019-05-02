/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis.entorns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class Fila_Test {
     Fila fila = new Fila();
    
    public Fila_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testEncolar() {
        int numero = 4;
        fila.encolar(numero);
        int expResult = numero;
        int result = fila.frente();
        assertEquals(expResult, result);
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testDesencolar() {
        fila.encolar(1);
        fila.encolar(2);
        fila.desencolar();
        int expResult = 2;
        int result = fila.frente();
        assertEquals(expResult, result);
    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testFrente() {
        fila.encolar(1);
        int expResult = 1;
        int result = fila.frente();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of empty method, of class Pila.
     */
    @Test
    public void testEmpty() {
        boolean expResult = true;
        boolean result = fila.empty();
        assertEquals(expResult, result);
    }
    
}


