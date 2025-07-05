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
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Conceito(String criador, String nome, String sistema, String descricao, ArrayList<String> horarios, ArrayList<Tag> tags, LocalDateTime dataCriacao, LocalDateTime dataModificacao) {
        this.criador = criador;
        this.nome = nome;
        this.sistema = sistema;
        this.descricao = descricao;
        this.horarios = horarios;
        this.tags = tags;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public String getDescricao() {
        return descricao;
    }

}
