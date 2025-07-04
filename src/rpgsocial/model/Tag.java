package rpgsocial.model;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Tag {

    private String nome;
    private String category;

    public Tag() {

    }

    public Tag(String nome, String classe) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCategory() {
        return category;
    }
}
