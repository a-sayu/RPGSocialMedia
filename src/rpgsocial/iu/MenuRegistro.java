package rpgsocial.iu;

import java.util.Scanner;
import rpgsocial.controller.ControladorUsuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class MenuRegistro {

    private Scanner scanner;
    private ControladorUsuario controlUsuario;

    public MenuRegistro() {
        scanner = new Scanner(System.in);
        controlUsuario = new ControladorUsuario();
    }

    public void formularioRegistro() {
        System.out.print("Entre seu nome de usuario: ");
        String nomeusuario = scanner.nextLine();

        System.out.print("Entre seu email: ");
        String email = scanner.nextLine();

        System.out.print("Entre sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Entre sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entre sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Entre seu pais: ");
        String estado = scanner.nextLine();

        System.out.print("Entre seu pais: ");
        String pais = scanner.nextLine();

        controlUsuario.registrarUsuario(nomeusuario, email, senha, idade, cidade, estado, pais);
    }

}
