package rpgsocial.model;

import java.io.Serializable;

/**
 * Representa um usuário do sistema de rede social RPG.
 * 
 * Esta classe armazena informações básicas de autenticação de um usuário,
 * incluindo nome de usuário e senha também permitindo verificar a senha
 * fornecida.
 * 
 * Implementa {@link Serializable} para possibilitar persistência de objetos.
 * @author MIGUEL CAMPOS
 */
public class User implements Serializable {
    
    /** Nome de usuário do sistema (único). */
    private static final long serialVersionUID = 1L;
    
    /** Nome de usuário do sistema (único). */
    private String username;
    
    /** Email do usuário. */
    private String email;
    
     /** Senha do usuário (armazenada em texto simples). */
    private String password;
    
    /** Idade do usuário. */
    private int age;
    
    /** Cidade do usuário. */
    private String city;
    
    /** País do usuário. */
    private String country;
    
    /**
     * Cria um novo usuário com o nome de usuário e senha fornecidos.
     * 
     * @param username o nome de usuário do novo usuário
     * @param email o email do novo usuário
     * @param password a senha do novo usuário
     * @param age a idade do novo usuário
     * @param city a cidade do novo usuário
     * @param country o país do novo usuário
     */
    public User(String username, String email, String password, int age, String city, String country) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.city = city;
        this.country = country;
    }
    
    /**
     * Retorna o nome de usuário deste usuário.
     * 
     * @return o nome de usuário
     */
    public String getUsername() { return username; }
    
    /**
     * Retorna o email do usuário.
     * 
     * @return o email do usuário
     */
    public String getEmail() { return email; }
    
    /**
     * Verifica se a senha fornecida corresponde à senha deste usuário.
     * 
     * @param input a senha a ser verificada
     * @return {@code true} se a senha estiver correta, {@code false} caso contrário
     */
    public boolean checkPassword(String input) { return password.equals(input); }
  
    /**
     * Retorna uma representação textual do usuário.
     * 
     * @return uma string no formato "User: [username]"
     */
    @Override
    public String toString() {
        return "User: " + username + "\nEmail: " + email + "\nIdade: " + age + "\nCidade: " + city + "\nPais: " + country;
    }
}
