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
public class GrafoTest {
    
    public GrafoTest() {
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
     * Test of MostrarEnPantalla method, of class Grafo.
     */
    @Test
    public void testMostrarEnPantalla() {
        System.out.println("MostrarEnPantalla");
        Grafo instance = null;
        instance.MostrarEnPantalla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Grafo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object nombre = null;
        Grafo instance = null;
        instance.add(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEdge method, of class Grafo.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        Object vortice1 = null;
        Object vortice2 = null;
        double label = 0.0;
        Grafo instance = null;
        String expResult = "";
        String result = instance.addEdge(vortice1, vortice2, label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEdge method, of class Grafo.
     */
    @Test
    public void testRemoveEdge() {
        System.out.println("removeEdge");
        Object vortice1 = null;
        Object vortice2 = null;
        Grafo instance = null;
        String expResult = "";
        String result = instance.removeEdge(vortice1, vortice2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRutaMasCorta method, of class Grafo.
     */
    @Test
    public void testGetRutaMasCorta() {
        System.out.println("getRutaMasCorta");
        Object label1 = null;
        Object label2 = null;
        Grafo instance = null;
        String expResult = "";
        String result = instance.getRutaMasCorta(label1, label2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCentroGrafo method, of class Grafo.
     */
    @Test
    public void testGetCentroGrafo() {
        System.out.println("getCentroGrafo");
        Grafo instance = null;
        String expResult = "";
        String result = instance.getCentroGrafo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanciaMinima method, of class Grafo.
     */
    @Test
    public void testGetDistanciaMinima() {
        System.out.println("getDistanciaMinima");
        Object nom1 = null;
        Object nom2 = null;
        Grafo instance = null;
        Double expResult = null;
        Double result = instance.getDistanciaMinima(nom1, nom2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of floyd method, of class Grafo.
     */
    @Test
    public void testFloyd() {
        System.out.println("floyd");
        Grafo instance = null;
        instance.floyd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enlaces method, of class Grafo.
     */
    @Test
    public void testEnlaces() {
        System.out.println("enlaces");
        int i = 0;
        int k = 0;
        String[][] aux_enlaces = null;
        String enl_rec = "";
        Grafo instance = null;
        String expResult = "";
        String result = instance.enlaces(i, k, aux_enlaces, enl_rec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
