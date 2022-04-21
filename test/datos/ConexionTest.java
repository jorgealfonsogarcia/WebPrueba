/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class ConexionTest {
    
    public ConexionTest() {
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
     * Test of getConnection method, of class Conexion.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        Connection expResult = null;
        Connection result = Conexion.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Conexion.
     */
    @Test
    public void testClose_ResultSet() {
        System.out.println("close");
        ResultSet rs = null;
        Conexion.close(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Conexion.
     */
    @Test
    public void testClose_PreparedStatement() {
        System.out.println("close");
        PreparedStatement stmt = null;
        Conexion.close(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Conexion.
     */
    @Test
    public void testClose_Connection() {
        System.out.println("close");
        Connection conn = null;
        Conexion.close(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
