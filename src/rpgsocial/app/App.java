package rpgsocial.app;

import java.io.*;
import java.util.*;
import rpgsocial.model.User;

/**
 * Classe responsável pela lógica do sistema.
 * 
 * Essa classe permite registrar novos usuários, persistir e carregar
 * os dados dos usuários de um arquivo serializado, e recuperar a lista
 * de todos os usuários registrados.
 * 
 * Por enquanto, a persistência será feita em um arquivo binário chamado {@code users.dat}.
 * @author MIGUEL CAMPOS
 */
public class App {
    
    /** Nome do arquivo onde os usuários são persistidos. */
    private static final String USERS_FILE = "users.dat";
    
    /** HashMap de usuários, indexados pelo nome. */
    private Map<String, User> users = new HashMap<>();
    
    /** HashMap de usuários, indexados pelo nome. */
    private User userLogged = null;
    
    /**
     * Construtor da aplicação. Carrega os usuários a partir do arquivo {@code users.dat}, se existir.
     */
    public App() {
        loadUsers();
    }
    
    // ------------- Register -------------
    
    /**
     * Registra um novo usuário no sistema.
     * 
     * @param username o nome de usuário a ser registrado
     * @param email o email do usuário
     * @param password a senha do usuário
     * @param age a idade do usuário
     * @param city a cidade do usuário
     * @param country o país do usuário
     * @return {@code true} se o registro foi bem-sucedido,
     * ou {@code false} se o nome ou o email já estiverem em uso
     */
    public boolean registerUser(String username, String email, String password, int age, String city, String country) {
        if (users.containsKey(email)) {
            return false;
        }
        
        for (User user : users.values()) {
            if(user.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }
        
        users.put(email, new User(username, email, password, age, city, country));
        
        saveUsers();
        
        return true;
    }
    
    // ------------- Login -------------
    
    /**
     * Conecta um usuário no sistema.
     * 
     * @param email o email do usuário tentando conectar
     * @param password a senha do usuário
     * @return {@code true} se os dados informados estão 
     * corretos e a conexão foi bem-sucedido, ou 
     * {@code false} se já existir um usuário conectado
     * ou a senha estiver incorreta.
     */
    public boolean loginUser(String email, String password) {
        User user = users.get(email);
        
        if ((user != null) && (user.checkPassword(password))) {
            userLogged = user;
            return true;
        }

        return false;
    }
    
    /**
     * Desconecta o usuário conectado no sistema.
     * 
     */
    public void logoutUser() {
        userLogged = null;
    }
    
    /**
     * Retorna o usuário conectado no sistema.
     * 
     * @return o usuário conectado
     */
    public User getLoggedUser() {
        return userLogged;
    }
    
    /**
     * Retorna todos os usuários registrados no sistema.
     * 
     * @return uma coleção contendo todos os usuários
     */
    public Collection<User> getAllUsers() {
        return users.values();
    }
    
    // ------------- Persistence -------------
    
    /**
     * Salva todos os dados persistentes do sistema ao fechar.
     * Atualmente, apenas os usuários são salvos.
     */
    public void saveAll() {
        saveUsers();
    }
    
    /**
     * Salva os usuários no arquivo {@code users.dat}.
     * Esse método é chamado automaticamente após o registro de um novo usuário.
     */
    private void saveUsers() {
                
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.err.println("Erro ao carregar usuários: " + e.getMessage());
        }
    }
    
    /**
     * Carrega os usuários a partir do arquivo {@code users.dat}.
     * Caso o arquivo não exista, o mapa de usuários permanece vazio.
     */
    private void loadUsers() {
        
        File file = new File(USERS_FILE);
        
        if (!file.exists()) { return; }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            users = (Map<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar usuários: " + e.getMessage());
        }
    }
}
