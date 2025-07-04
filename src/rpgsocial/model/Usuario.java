package rpgsocial.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Usuario {
    
    private LocalDateTime dataCriacao;
    private String nome;
    private int idade;
    private String cidade;
    private String estado;
    private String pais;
    private String email;
    private String senha;
    private boolean ehAdmin;
    
    public Usuario() {
        
    }
    
    public Usuario(LocalDateTime dataCriacao, String nome, int idade, String cidade, String estado, String pais, String email, String senha) {
        this.dataCriacao = dataCriacao;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.email = email;
        this.senha = senha;
        this.ehAdmin = false;
    }
    
    public Usuario(LocalDateTime dataCriacao, String nome, int idade, String cidade, String estado, String pais, String email, String senha, boolean ehAdmin) {
        this.dataCriacao = dataCriacao;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.email = email;
        this.senha = senha;
        this.ehAdmin = ehAdmin;
    }
    
    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
    
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getPais() {
        return pais;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public boolean isEhAdmin() {
        return ehAdmin;
    }
    
}
