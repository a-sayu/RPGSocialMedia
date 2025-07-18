package rpgsocial.controller;

import java.util.ArrayList;
import rpgsocial.fabrica.FabricaUsuario;
import rpgsocial.model.Usuario;
import rpgsocial.persistence.CatalogoUsuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class ControladorUsuario {

    private final CatalogoUsuario catalogo;
    private final FabricaUsuario fabrica;

    public ControladorUsuario() {
        catalogo = new CatalogoUsuario();
        fabrica = new FabricaUsuario();
    }

    public void exibirUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void registrarUsuario(ArrayList<String> registro) {
        Usuario novoUsuario = fabrica.registrarUsuario(registro);
        catalogo.adicionarUsuario(novoUsuario);
    }

    public Usuario loginUsuario(ArrayList<String> login) {
        Usuario usuarioEncontrado = catalogo.existeUsuario(login);
        if (usuarioEncontrado.verificarSenha(login.get(1))) {
            return usuarioEncontrado;
        }
        return null;
    }

    public void desconectar(Usuario session) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void exibirConceitosDoUsuario(Usuario usuarioConectado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void exibirGruposDoUsuario(Usuario usuarioConectado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void exibirUsuario(Usuario usuarioConectado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void exibirAmizadesDoUsuario(Usuario usuarioConectado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
