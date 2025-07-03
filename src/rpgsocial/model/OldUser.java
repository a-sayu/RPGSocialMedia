package rpgsocial.model;

import java.io.Serializable;
import java.util.*;

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
public class OldUser implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String username;
    private String email;
    private String password;
    private int age;
    private String city;
    private String country;
    
    private Map<String, OldConcept> concepts = new HashMap<>();
    
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

    /**
     * Cria um novo usuário com o nome de usuário e senha fornecidos.
     * @param username o nome de usuário do novo usuário
     * @param email o email do novo usuário
     * @param password a senha do novo usuário
     * @param age a idade do novo usuário
     * @param city a cidade do novo usuário
     * @param country o país do novo usuário
     */
    public OldUser(String username, String email, String password, int age, String city, String country) {
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
    
    public boolean addConcept(OldConcept newConcept) {
        
        if (concepts.containsKey(newConcept.getName())) {
            return false;
        }
        
        concepts.put(newConcept.getName(), newConcept);
        return true;
    }
    
    public Collection<OldConcept> getConcepts() {
        return concepts.values();
    }
  
    /**
     * Retorna uma representação textual do usuário.
     * 
     * @return uma string no formato "OldUser: [username]"
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User: ").append(username)
                .append("\nEmail: ").append(email)
                .append("\nIdade: ").append(age)
                .append("\nCidade: ").append(city)
                .append("\nPais: ").append(country)
                .append("\nConceitos:\n");
        if (concepts == null || concepts.isEmpty()) {
            sb.append("(nenhum)\n");
        }else {
            for (OldConcept c : concepts.values()) {
                sb.append(" - ").append(c).append("\n");
            }
        }
        
        return sb.toString();
    }
}
