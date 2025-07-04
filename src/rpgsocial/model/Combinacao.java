package rpgsocial.model;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Combinacao {

    private Conceito conceitoA;
    private Conceito conceitoB;
    private String criadorA;
    private String criadorB;
    private int porcentagem;

    public Combinacao(Conceito conceitoA, Conceito conceitoB, int porcentagem) {
        this.conceitoA = conceitoA;
        this.conceitoB = conceitoB;
        this.criadorA = conceitoA.getCriador();
        this.criadorB = conceitoB.getCriador();
        this.porcentagem = porcentagem;
    }

    public Conceito getConceitoA() {
        return conceitoA;
    }

    public Conceito getConceitoB() {
        return conceitoB;
    }

    public String getCriadorA() {
        return criadorA;
    }

    public String getCriadorB() {
        return criadorB;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

}
