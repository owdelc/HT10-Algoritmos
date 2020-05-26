/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class ArcoTest {
    
    public ArcoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of equals method, of class Arco.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object n = null;
        Arco instance = null;
        boolean expResult = false;
        boolean result = instance.equals(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Arco.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Arco instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of here method, of class Arco.
     */
    @Test
    public void testHere() {
        System.out.println("here");
        Arco instance = null;
        Object expResult = null;
        Object result = instance.here();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Arco.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Arco instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of there method, of class Arco.
     */
    @Test
    public void testThere() {
        System.out.println("there");
        Arco instance = null;
        Object expResult = null;
        Object result = instance.there();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distancai method, of class Arco.
     */
    @Test
    public void testDistancai() {
        System.out.println("distancai");
        Arco instance = null;
        double expResult = 0.0;
        double result = instance.distancai();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisited method, of class Arco.
     */
    @Test
    public void testIsVisited() {
        System.out.println("isVisited");
        Arco instance = null;
        boolean expResult = false;
        boolean result = instance.isVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arco.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Arco instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
