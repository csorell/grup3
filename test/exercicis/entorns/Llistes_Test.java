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
public class Llistes_Test {
    
    public Llistes_Test() {
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
     * Test of ordenar method, of class Llistes.
     */
    @Test
    public void testOrdenar() {
        int[] llista1 = {1,3,5};
        int[] llista2 = {2,4};
        int[] expResult = {1,2,3,4,5};
        int[] result = Llistes.ordenar(llista1, llista2);
        assertArrayEquals(expResult, result);
    }
}