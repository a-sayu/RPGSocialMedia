package rpgsocial.persistence;

import java.util.ArrayList;
import rpgsocial.model.Usuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class CatalogoUsuario {

    private ArrayList<Usuario> usuarios;

    public CatalogoUsuario() {
        usuarios = new ArrayList<>();
    }

    public boolean adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        return usuarios.contains(usuario);
    }

    public Usuario existe(ArrayList<String> login) {
        String identificador = login.get(0);
        Usuario usuarioEncontrado;
        if (identificador.contains("@")) {
            usuarioEncontrado = buscarPorEmail(identificador);
            if (usuarioEncontrado.getEmail().equals(identificador)) {
                return usuarioEncontrado;
            }
        } else {
            usuarioEncontrado = buscarPorNome(identificador);
            if (usuarioEncontrado.getNome().equals(identificador)) {
                return usuarioEncontrado;
            }
        }
        return null;
    }


    public Usuario buscarPorEmail(String identificador) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(identificador)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorNome(String identificador) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(identificador)) {
                return usuario;
            }
        }
        return null;
    }
    
    public boolean remover(Usuario usuario) {
        usuarios.remove(usuario);
        return !usuarios.contains(usuario);
    }
}
