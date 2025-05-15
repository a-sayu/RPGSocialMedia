/*
 * RPGSocial - A console-based RPG matching social network application
*/

package rpgsocial.main;

import java.util.*;
import rpgsocial.app.App;
import rpgsocial.model.Concept;
import rpgsocial.model.User;

/**
 * Classe principal que executa a aplicação de rede social RPG.
 * Essa classe fornece uma interface de console simples para registro,
 * login, criação de conceitos e visualização de usuários.
 * 
 * @author Sayu
 */
public class Main {
    
    /**
    * Método principal da aplicação. Apresenta um menu interativo no console
    * e executa ações com base na escolha do usuário.
    */
    public static void main(String[] args) {
        
        App app = new App();
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Registrar"); // Registro de Usuário
            System.out.println("2. Login"); // Login do Usuário
            System.out.println("3. Logout"); // Logout do Usuário
            System.out.println("4. Ver usuarios registrados"); // feito para conferir o sistema de registros.
            System.out.println("5. Ver usuario logado"); // feito para conferir o sistema de login.
            System.out.println("6. Criar conceito"); // Registrar Conceitos
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer
            
            switch (option) {
                case 1 -> {
                    
                    System.out.print("Entre seu nome de usuario: ");
                    String username = scanner.nextLine();
                    
                    System.out.print("Entre seu email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Entre sua senha: ");
                    String password = scanner.nextLine();
                    
                    System.out.print("Entre sua idade: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Entre sua cidade: ");
                    String city = scanner.nextLine();
                    
                    System.out.print("Entre seu pais: ");
                    String country = scanner.nextLine();
                    
                    User newUser = new User(username, email, password, age, city, country);
                    boolean registered = app.registerUser(newUser);
                    
                    
                    if (registered) {
                        System.out.println("Usuario registrado com sucesso!");
                    } else {
                        System.out.println("Nome de usuario ou email já existentes.");
                    }
                }
                
                case 2 -> {
                    
                    System.out.print("Entre o email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Entre a senha: ");
                    String password = scanner.nextLine();
                    
                    boolean logged = app.loginUser(email, password);
                    
                    if (logged) {
                        System.out.println("Usuario conectado com sucesso!");
                    } else {
                        System.out.println("Email ou senha incorretos ou existe um usuario conectado.");
                    }
                }
                
                case 3 -> {
                    
                    System.out.println("Desconectando usuario...");
                    app.logoutUser();
                    System.out.println("Usuario desconectado...");
                }
                    
                case 4 -> {
                    System.out.println("Usuarios registrados:");
                    for (User u : app.getAllUsers()) {
                        System.out.println(u);
                    }
                }
                case 5 -> {
                    User user = app.getLoggedUser();
                    
                    if (user != null) {
                        System.out.println("Usuario logado:");
                        System.out.println(user);   
                    } else {
                        System.out.println("Nenhum usuario conectado no momento.");   
                    }
                }
                
                case 6 -> {
                    
                    User user = app.getLoggedUser();
                    if (user == null) {
                        System.out.println("Faca login antes de criar conceito.");   
                        break;
                    }
                    System.out.print("Nome do conceito: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Sistema: ");
                    String system = scanner.nextLine();
                    
                    System.out.print("Horários disponíveis ");
                    String schedule = scanner.nextLine();
                    
                    System.out.print("Descricao do conceito ");
                    String description = scanner.nextLine();
                    
                    System.out.print("Tags (Separadas por espaço): ");
                    String input = scanner.nextLine();
                    String[] aux = input.split(" ");
                    ArrayList<String> tags = new ArrayList<>(Arrays.asList(aux));

                    Concept newConcept = new Concept(name, system, schedule, description, tags);
                    boolean success = user.addConcept(newConcept);
                    
                    if (success) {
                        System.out.println("Conceito adicionado com sucesso!");
                    } else {
                        System.out.println("Nome de conceito ja existente.");
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
