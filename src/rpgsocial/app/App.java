package rpgsocial.app;

import java.util.ArrayList;
import rpgsocial.controller.*;
import rpgsocial.iu.TextUI;
import rpgsocial.model.Usuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class App {

    private final ControladorUsuario controlUsuario;
    private final ControladorConceito controlConceito;
    private final ControladorCombinacao controlCombinacao;
    private final TextUI textUI;
    private final String sessao;
    private Usuario usuarioConectado;

    public App() {
        controlUsuario = new ControladorUsuario();
        controlConceito = new ControladorConceito();
        controlCombinacao = new ControladorCombinacao();
        textUI = new TextUI();
        sessao = "";
        processarOpcao(sessao, textUI.exibirInterface(sessao));
    }

    private void processarDesconectado(int opcao) {
        switch (opcao) {
            case 1 -> {
                ArrayList<String> registro = textUI.formulario("registro");
                controlUsuario.registrarUsuario(registro);
            }
            case 2 -> {
                ArrayList<String> login = textUI.formulario("login");
                usuarioConectado = controlUsuario.loginUsuario(login);
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");
        }
    }

    private void processarConectado(int opcao) {
        switch (opcao) {

            case 1 -> {
                controlUsuario.desconectar(usuarioConectado);
            }
            case 2 -> {
                controlUsuario.exibirConceitosDoUsuario(usuarioConectado);
            }
            case 3 -> {
                controlUsuario.exibirAmizadesDoUsuario(usuarioConectado);
            }
            case 4 -> {
                controlUsuario.exibirGruposDoUsuario(usuarioConectado);
            }
            case 5 -> {
                controlUsuario.exibirUsuario(usuarioConectado);
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");
        }
    }

    private void processarDebug(int opcao) {
        switch (opcao) {

            case 1 -> {
                controlUsuario.desconectar(usuarioConectado);
            }
            case 2 -> {
                controlUsuario.exibirUsuarios();
            }
            case 3 -> {
                controlConceito.exibirConceitos();
            }
            case 4 -> {
                controlCombinacao.exibirCombinacoes();
            }
            case 5 -> {
                //controlAmizade.exibirAmizades();
            }
            case 6 -> {
                //controlGrupo.exibirGrupos();
            }
            case 7 -> {
                //controlChat.exibirChats();
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");

        }
    }

    private void processarOpcao(String sessao, int exibirInterface) {
        switch (sessao) {
            case "admin" -> processarDebug(exibirInterface);
            case "comum" -> processarConectado(exibirInterface);
            default -> processarDesconectado(exibirInterface);
        }
    }

}
