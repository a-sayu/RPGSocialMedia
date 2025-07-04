package rpgsocial.model;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Tag {

    private String nome;
    private String categoria;

    public Tag() {

    }

    public Tag(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}
