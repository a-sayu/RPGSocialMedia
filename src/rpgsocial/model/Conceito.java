package rpgsocial.model;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Conceito {

    private String criador;
    private String nome;
    private String sistema;
    private String descricao;
    private ArrayList<String> horarios;
    private ArrayList<Tag> tags;
    private LocalDateTime data_criacao;
    private LocalDateTime data_modificacao;

    public Conceito(String criador, String nome, String sistema, String descricao, ArrayList<String> horarios, ArrayList<Tag> tags, LocalDateTime data_criacao, LocalDateTime data_modificacao) {
        this.criador = criador;
        this.nome = nome;
        this.sistema = sistema;
        this.descricao = descricao;
        this.horarios = horarios;
        this.tags = tags;
        this.data_criacao = data_criacao;
        this.data_modificacao = data_modificacao;
    }

    public String getCriador() {
        return criador;
    }

    public String getNome() {
        return nome;
    }

    public String getSistema() {
        return sistema;
    }

    public ArrayList<String> getHorarios() {
        return horarios;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public LocalDateTime getData_modificacao() {
        return data_modificacao;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public String getDescricao() {
        return descricao;
    }

}
