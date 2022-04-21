/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package datos;

import domain.Persona;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jorgealfonso
 */
public class PersonaJDBCTest {
    
    public PersonaJDBCTest() {
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
     * Test of select method, of class PersonaJDBC.
     */
    @Test
    public void testSelect() throws Exception {
        System.out.println("select");
        PersonaJDBC instance = new PersonaJDBC();
        List<Persona> expResult = null;
        List<Persona> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class PersonaJDBC.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Persona persona = null;
        PersonaJDBC instance = new PersonaJDBC();
        int expResult = 0;
        int result = instance.insert(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersonaJDBC.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Persona persona = null;
        PersonaJDBC instance = new PersonaJDBC();
        int expResult = 0;
        int result = instance.update(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersonaJDBC.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Persona persona = null;
        PersonaJDBC instance = new PersonaJDBC();
        int expResult = 0;
        int result = instance.delete(persona);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
