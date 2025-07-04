package rpgsocial.iu;

import java.util.ArrayList;
import rpgsocial.model.TipoFormulario;
import rpgsocial.model.TipoSessao;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class TextUI {

    private final TelaPrincipal menu;

    public TextUI() {
        menu = new TelaPrincipal();
    }

    public int exibirInterface(TipoSessao tipoSessao) {
        return switch (tipoSessao) {
            case COMUM ->
                menu.exibirMenuDebug();
            case ADMIN ->
                menu.exibirMenuConectado();
            default ->
                menu.exibirMenuDesconectado();
        };
    }

    public ArrayList<String> formulario(TipoFormulario tipo) {
        return switch (tipo) {
            case REGISTRO ->
                menu.formularioRegistro();
            case LOGIN ->
                menu.formularioLogin();
            default ->
                null;
        };
    }
}
