package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoPersonas {

    private static final Logger LOGGER = Logger.getLogger(ManejoPersonas.class.getName());

    public static void main(String[] args) throws Exception {

        try ( Connection conexion = Conexion.getConnection()) {
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Jesus");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("jesus@mail.com");
            cambioPersona.setTelefono("333333");
            personaJdbc.update(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlosw");
            nuevaPersona.setApellido("Ramirez2");
            personaJdbc.insert(nuevaPersona);
            LOGGER.info("test para sonarQube");

            commit(conexion);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    private static void commit(final Connection conexion) {
        try {
            conexion.commit();
        } catch (SQLException e) {
            rollback(conexion);
        }
        LOGGER.info("Se ha hecho commit de la transaccion");
    }

    private static void rollback(final Connection conexion) {
        LOGGER.info("Entramos al rollback");
        try {
            conexion.rollback();
        } catch (SQLException ex1) {
            LOGGER.log(Level.SEVERE, ex1.getMessage(), ex1);
        }
    }
}
