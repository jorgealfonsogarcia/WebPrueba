package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Conexion {

    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());
    
    private Conexion() {
    }

    
    
    public static Connection getConnection() throws SQLException, NamingException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";

        Context initialContext = new InitialContext();

        DataSource datasource = (DataSource) initialContext.lookup("java:/TestDS");
        if (datasource == null) {
            throw new SQLException("Error de Conexion DataSource");
        }

        Class.forName(driver);
        
        return datasource.getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

}
