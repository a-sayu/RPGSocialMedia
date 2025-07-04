package rpgsocial.model;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class Combinacao {

    private Conceito conceitoA;
    private Conceito conceitoB;
    private Usuario criadorA;
    private Usuario criadorB;

    public Combinacao(Conceito conceitoA, Conceito conceitoB) {
        this.conceitoA = conceitoA;
        this.conceitoB = conceitoB;
        this.criadorA = conceitoA.getCriador();
        this.criadorB = conceitoB.getCriador();
    }

    public Conceito getConceitoA() {
        return conceitoA;
    }

    public Conceito getConceitoB() {
        return conceitoB;
    }

    public Usuario getCriadorA() {
        return criadorA;
    }

    public Usuario getCriadorB() {
        return criadorB;
    }

}
