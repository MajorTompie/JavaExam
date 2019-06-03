/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toetsvraag1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class CursusIT {
    
    Cursus instance;
    
    public CursusIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Cursus("Programming");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of aantalKorteNamen method, of class Cursus.
     */
    
    @Test
    public void testAantalKorteNamen2() {
        System.out.println("aantalKorteNamen");
        Student student = new Student("Tom");
        instance.addStudent(student);
        int korterDan = 4;
        int expResult = 1;
        int result = instance.aantalKorteNamen(korterDan);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAantalKorteNamen3() {
        System.out.println("aantalKorteNamen");
        Student student = new Student("Tom");
        Student student2 = new Student("Parminder");
        instance.addStudent(student);
        instance.addStudent(student2);
        int korterDan = 4;
        int expResult = 1;
        int result = instance.aantalKorteNamen(korterDan);
        assertEquals(expResult, result);
    }
}
