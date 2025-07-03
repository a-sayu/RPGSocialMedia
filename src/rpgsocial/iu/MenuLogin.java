package rpgsocial.iu;

import java.util.Scanner;
import rpgsocial.controller.ControladorUsuario;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class MenuLogin {

    private Scanner scanner;
    private ControladorUsuario controlUsuario;

    public MenuLogin() {
        scanner = new Scanner(System.in);
        controlUsuario = new ControladorUsuario();
    }

    public void formularioLogin() {
        System.out.print("Entre o email: ");
        String email = scanner.nextLine();

        System.out.print("Entre a senha: ");
        String senha = scanner.nextLine();
        
        controlUsuario.loginUsuario(email, senha);
    }
}
