package rpgsocial.model;

import java.time.LocalDateTime;

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
    private int compatibilidade;
    private LocalDateTime dataCombinacao;

    public Combinacao(Conceito conceitoA, Conceito conceitoB, int compatibilidade, LocalDateTime dataCombinacao) {
        this.conceitoA = conceitoA;
        this.conceitoB = conceitoB;
        this.criadorA = conceitoA.getCriador();
        this.criadorB = conceitoB.getCriador();
        this.compatibilidade = compatibilidade;
        this.dataCombinacao = dataCombinacao;
    }

    public int getCompatibilidade() {
        return compatibilidade;
    }

    public LocalDateTime getDataCombinacao() {
        return dataCombinacao;
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
}
