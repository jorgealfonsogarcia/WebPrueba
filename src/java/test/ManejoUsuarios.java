package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoUsuarios {

    private static final Logger LOGGER = Logger.getLogger(ManejoUsuarios.class.getName());

    public static void main(String[] args) throws Exception {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

        List<Usuario> usuarios = usuarioJdbc.select();
        for (Usuario usuario : usuarios) {
            LOGGER.log(Level.INFO, "Usuario:{0}", usuario);
        }

        usuarioJdbc.delete(new Usuario(3));
    }
}
