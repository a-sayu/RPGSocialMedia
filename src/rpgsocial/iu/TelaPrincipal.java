package rpgsocial.iu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class TelaPrincipal {

    private Scanner scanner;

    public TelaPrincipal() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenuDesconectado() {
        int opcao;
        System.out.println("\n--- Menu ---");
        System.out.println("1. Registrar"); // Registro de Usuário
        System.out.println("2. Login"); // Login do Usuário
        System.out.println("0. Sair");
        System.out.println("Escolha uma opcao: ");

        opcao = scanner.nextInt();
        return opcao;
    }

    public int exibirMenuConectado() {
        int opcao;
        System.out.println("\n--- Menu ---");
        System.out.println("1. Logout"); // Logout do Usuário
        System.out.println("2. Conceitos"); // Registrar Conceitos
        System.out.println("3. Amizades"); // Encontrar e Adicionar Amigos
        System.out.println("4. Grupos"); // Encontrar e ver Grupos
        System.out.println("5. Meu Perfil"); // Ver seu perfil na rede
        System.out.println("0. Sair");
        System.out.println("Escolha uma opcao: ");

        opcao = scanner.nextInt();
        return opcao;
    }

    public int exibirMenuDebug() {
        int opcao;
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
        return opcao;
    }

    public ArrayList<String> formularioRegistro() {
        System.out.print("Entre seu nome de usuario: ");
        String nomeusuario = scanner.nextLine();

        System.out.print("Entre seu email: ");
        String email = scanner.nextLine();

        System.out.print("Entre sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Entre sua idade: ");
        String idade = scanner.nextLine();

        System.out.print("Entre sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Entre seu pais: ");
        String estado = scanner.nextLine();

        System.out.print("Entre seu pais: ");
        String pais = scanner.nextLine();

        ArrayList<String> novoUsuario = new ArrayList<>();
        novoUsuario.addAll(List.of(nomeusuario, email, senha, idade, cidade, estado, pais));
        return novoUsuario;
    }

    public ArrayList<String> formularioLogin() {
        System.out.print("Entre o email: ");
        String email = scanner.nextLine();

        System.out.print("Entre a senha: ");
        String senha = scanner.nextLine();
        
        ArrayList<String> usuario = new ArrayList<>();
        usuario.addAll(List.of(email, senha));
        return usuario;
    }
}
