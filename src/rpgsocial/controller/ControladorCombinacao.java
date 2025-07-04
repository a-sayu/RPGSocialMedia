package rpgsocial.controller;

import rpgsocial.model.Combinacao;
import rpgsocial.model.Conceito;
import rpgsocial.persistence.CatalogoCombinacao;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class ControladorCombinacao {
    private CatalogoCombinacao catalogoCombinacao;

    public ControladorCombinacao() {
        catalogoCombinacao = new CatalogoCombinacao();
    }

    public boolean combinarConceitos(Conceito conceitoA, Conceito conceitoB) {
        if (verificarCompatibilidade(conceitoA, conceitoB)) {
            Combinacao novaCombinacao = criarCombinacao(conceitoA, conceitoB);
            if (catalogoCombinacao.adicionar(novaCombinacao)) {
                return true;
            }
        }
        return false;
    }

    public Combinacao criarCombinacao(Conceito conceitoA, Conceito conceitoB) {
        Combinacao novaCombinacao = new Combinacao(conceitoA, conceitoB);
        return novaCombinacao;
    }

    public boolean verificarCompatibilidade(Conceito conceitaA, Conceito conceitoB) {
        return true;
    }

    public void exibirCombinacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
