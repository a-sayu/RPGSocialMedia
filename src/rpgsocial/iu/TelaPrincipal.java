package rpgsocial.iu;

import java.util.Scanner;
import rpgsocial.controller.*;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class TelaPrincipal {

    private Scanner scanner;
    private ControladorUsuario controlUsuario;
    private ControladorConceito controlConceito;
    private ControladorAmizade controlAmizade;
    private ControladorGrupo controlGrupo;
    private ControladorChat controlChat;

    public TelaPrincipal() {
        scanner = new Scanner(System.in);
        controlUsuario = new ControladorUsuario();
        controlConceito = new ControladorConceito();
        controlAmizade = new ControladorAmizade();
        controlGrupo = new ControladorGrupo();
        controlChat = new ControladorChat();
    }

    public void exibirMenuDesconectado() {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registrar"); // Registro de Usuário
            System.out.println("2. Login"); // Login do Usuário
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            processarDesconectado(opcao);
        } while (opcao != 0);
    }

    void exibirMenuConectado(int session) {
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Logout"); // Logout do Usuário
            System.out.println("2. Conceitos"); // Registrar Conceitos
            System.out.println("3. Amizades"); // Encontrar e Adicionar Amigos
            System.out.println("4. Grupos"); // Encontrar e ver Grupos
            System.out.println("5. Meu Perfil"); // Ver seu perfil na rede
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            processarConectado(opcao, session);
        } while (opcao != 0);
    }

    void exibirMenuDebug(int session) {
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Logout");
            System.out.println("2. Lista de Usuarios");
            System.out.println("3. Lista de Conceitos");
            System.out.println("4. Lista de Amizades");
            System.out.println("5. Lista de Grupos");
            System.out.println("6. Lista de Chats");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            processarDebug(opcao, session);
        } while (opcao != 0);
    }

    private void processarDesconectado(int opcao) {
        MenuLogin login = new MenuLogin();
        switch (opcao) {
            case 1 -> {
                MenuRegistro registro = new MenuRegistro();
                registro.formularioRegistro();
            }
            case 2 -> {
                login.formularioLogin();
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");
        }
    }

    private void processarConectado(int opcao, int session) {
        switch (opcao) {

            case 1 -> {
                controlUsuario.desconectar(session);
            }
            case 2 -> {
                controlUsuario.exibirConceitosDoUsuario(session);
            }
            case 3 -> {
                controlUsuario.exibirAmizadesDoUsuario(session);
            }
            case 4 -> {
                controlUsuario.exibirGruposDoUsuario(session);
            }
            case 5 -> {
                controlUsuario.exibirUsuario(session);
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");
        }
    }

    private void processarDebug(int opcao, int session) {
        switch (opcao) {

            case 1 -> {
                controlUsuario.desconectar(session);
            }
            case 2 -> {
                controlUsuario.exibirUsuarios();
            }
            case 3 -> {
                controlConceito.exibirConceitos();
            }
            case 4 -> {
                controlAmizade.exibirAmizades();
            }
            case 5 -> {
                controlGrupo.exibirGrupos();
            }
            case 6 -> {
                controlChat.exibirChats();
            }
            case 0 ->
                System.out.println("Saindo...");

            default ->
                System.out.println("Opção inválida.");

        }
    }
}
