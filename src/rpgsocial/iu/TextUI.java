package rpgsocial.iu;

import java.util.ArrayList;
import rpgsocial.controller.ControladorUsuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class TextUI {

    private TelaPrincipal menu;
    private ControladorUsuario controlUsuario;

    public TextUI() {
        menu = new TelaPrincipal();
        controlUsuario = new ControladorUsuario();
    }

    public int exibirInterface(String tipoSessao) {
        if (tipoSessao.equals("comum")) {
            return menu.exibirMenuDebug();
        } else if (tipoSessao.equals("admin")) {
            return menu.exibirMenuConectado();
        } else {
            return menu.exibirMenuDesconectado();
        }
    }

    public ArrayList<String> formulario(String tipo) {
        if (tipo.equals("registro")) {
            return menu.formularioRegistro();
        } else if (tipo.equals("login")) {
            return menu.formularioLogin();
        }
        return null;

    }
}
