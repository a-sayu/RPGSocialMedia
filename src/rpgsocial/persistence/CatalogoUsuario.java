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

    public void adicionar(Usuario novoUsuario) {
        usuarios.add(novoUsuario);
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

    private Usuario buscarPorEmail(String identificador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Usuario buscarPorNome(String identificador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuario verificarSenha(Usuario usuario, ArrayList<String> login) {
        String senha = login.get(1);
        if (usuario.verificarSenha(senha)) {
            return usuario;
        }
        return null;
    }
}
