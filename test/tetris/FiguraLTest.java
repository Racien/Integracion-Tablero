/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author May
 */
public class FiguraLTest {
    
    public FiguraLTest() {
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
     * Test of asignarFigura method, of class FiguraL.
     */
    @Test
    public void testAsignarFigura() {
        System.out.println("asignarFigura");        FiguraL.Figura forma = null;
        FiguraL instance = new FiguraL();
        instance.asignarFigura(forma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerX method, of class FiguraL.
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        int posicion_relativa = 0;
        FiguraL instance = new FiguraL();
        int expResult = 0;
        int result = instance.obtenerX(posicion_relativa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerY method, of class FiguraL.
     */
    @Test
    public void testObtenerY() {
        System.out.println("obtenerY");
        int posicion_relativa = 0;
        FiguraL instance = new FiguraL();
        int expResult = 0;
        int result = instance.obtenerY(posicion_relativa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumCoordRel method, of class FiguraL.
     */
    @Test
    public void testObtenerNumCoordRel() {
        System.out.println("obtenerNumCoordRel");
        FiguraL instance = new FiguraL();
        int expResult = 0;
        int result = instance.obtenerNumCoordRel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerForma method, of class FiguraL.
     */
    @Test
    public void testObtenerForma() {
        System.out.println("obtenerForma");
        FiguraL instance = new FiguraL();
        FiguraL.Figura expResult = null;
        FiguraL.Figura result = instance.obtenerForma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escogerPiezaAleatoriamente method, of class FiguraL.
     */
    @Test
    public void testEscogerPiezaAleatoriamente() {
        System.out.println("escogerPiezaAleatoriamente");
        FiguraL instance = new FiguraL();
        instance.escogerPiezaAleatoriamente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerYMinima method, of class FiguraL.
     */
    @Test
    public void testObtenerYMinima() {
        System.out.println("obtenerYMinima");
        FiguraL instance = new FiguraL();
        int expResult = 0;
        int result = instance.obtenerYMinima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotar method, of class FiguraL.
     */
    @Test
    public void testRotar() {
        System.out.println("rotar");
        FiguraL instance = new FiguraL();
        FiguraL expResult = null;
        FiguraL result = instance.rotar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
