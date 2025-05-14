package rpgsocial.main;

import java.util.Scanner;
import rpgsocial.app.App;
import rpgsocial.model.User;

/**
 * Classe principal que executa a aplicação de rede social RPG
 * 
 * Essa classe fornece uma interface de console simples.
 * 
 * @author Sayu
 */
public class Main {
    
    /**
    * Método principal da aplicação. Apresenta um menu interativo no console
    * e executa ações com vase na escolha do usuário.
    */
    public static void main(String[] args) {
        
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registrar"); // Registro de Usuário
            System.out.println("4. Ver usuarios"); // feito para conferir o sistema de registros.
            System.out.println("0. Sair");
            System.out.println("Escolha: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Quebra de linha pendente
            
            switch (option) {
                case 1 -> {
                    
                    System.out.print("Entre o usuario: ");
                    String username = scanner.nextLine();
                    
                    System.out.print("Entre a senha: ");
                    String password = scanner.nextLine();
                    
                    if (app.registerUser(username, password)) {
                        System.out.println("Usuario registrado com sucesso!");
                    } else {
                        System.out.println("Nome de usuario ja existe.");
                    }
                }
                    
                case 4 -> {
                    System.out.println("Usuarios registrados:");
                    for (User u : app.getAllUsers()) {
                        System.out.println("- " + u.getUsername());
                    }
                }
                    
                case 0 -> System.out.println("Saindo...");
                    
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);
        
        // Salva todos os dados antes de sair
        app.saveAll();
        
        scanner.close();
    }
}
