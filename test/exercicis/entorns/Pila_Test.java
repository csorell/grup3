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
public class Pila_Test {
     Pila pila = new Pila();
    
    public Pila_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pila.push(1);
        pila.push(2);
        pila.push(3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        int numero = 4;
        pila.push(numero);
        int expResult = numero;
        int result = pila.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        pila.pop();
        int expResult = 2;
        int result = pila.top();
        assertEquals(expResult, result);
    }

    /**
     * Test of top method, of class Pila.
     */
    @Test
    public void testTop() {
        int expResult = 3;
        int result = pila.top();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of empty method, of class Pila.
     */
    @Test
    public void testEmpty() {
        boolean expResult = false;
        boolean result = pila.empty();
        assertEquals(expResult, result);
    }
    
}


