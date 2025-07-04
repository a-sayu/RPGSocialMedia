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

    private CatalogoUsuario catalogoUsuario;
    private FabricaUsuario fabricaUsuario;

    public ControladorUsuario() {
        catalogoUsuario = new CatalogoUsuario();
        fabricaUsuario = new FabricaUsuario();
    }

    public void exibirUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void registrarUsuario(ArrayList<String> registro) {
        Usuario novoUsuario = fabricaUsuario.registrarUsuario(registro);
        catalogoUsuario.adicionarUsuario(novoUsuario);
    }

    public Usuario loginUsuario(ArrayList<String> login) {
        Usuario usuarioEncontrado = catalogoUsuario.existeUsuario(login);
        Usuario usuarioConectado;
        if (!usuarioEncontrado.equals(null)) {
            usuarioConectado = catalogoUsuario.verificarSenha(usuarioEncontrado, login);
            if (usuarioConectado.equals(null)) {
                return null;
            }
            return usuarioConectado;
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
