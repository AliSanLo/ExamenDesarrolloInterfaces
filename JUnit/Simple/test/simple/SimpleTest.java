/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package simple;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alicia
 */
public class SimpleTest {
    
    public SimpleTest() {
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
     * Test of main method, of class Simple.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Simple.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of saludar method, of class Simple.
     */
    @Test
    public void testSaludar() {
        System.out.println("saludar");
        String mensaje = "";
        Simple.saludar(mensaje);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sumar method, of class Simple.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = Simple.sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
