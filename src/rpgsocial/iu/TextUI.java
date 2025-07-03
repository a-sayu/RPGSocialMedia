package rpgsocial.iu;

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

    public void iniciarInterface(int session) {
        do {
            if (controlUsuario.usuarioAdmin(session)) {
                menu.exibirMenuDebug(session);
            } else if (controlUsuario.usuarioConectado(session)) {
                menu.exibirMenuConectado(session);
            } else {
                menu.exibirMenuDesconectado();
            }
        } while (!controlUsuario.usuarioConectado(session));
    }
}
