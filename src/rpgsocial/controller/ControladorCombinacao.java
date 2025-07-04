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
        int compatibilidade = verificarCompatibilidade(conceitoA, conceitoB);
        if (compatibilidade > 50) {
            Combinacao novaCombinacao = criarCombinacao(conceitoA, conceitoB, compatibilidade);
            if (catalogoCombinacao.adicionar(novaCombinacao)) {
                return true;
            }
        }
        return false;
    }

    public Combinacao criarCombinacao(Conceito conceitoA, Conceito conceitoB, int porcentagem) {
        Combinacao novaCombinacao = new Combinacao(conceitoA, conceitoB, porcentagem);
        return novaCombinacao;
    }

    public int verificarCompatibilidade(Conceito conceitoA, Conceito conceitoB) {
        int compatibilidade = 0;
        if (conceitoA.getSistema().equalsIgnoreCase(conceitoB.getSistema())) {
            compatibilidade = compatibilidade + 33;
        }
        for (int i = 0, j = 0; i < conceitoA.getHorarios().size() && j < conceitoB.getHorarios().size(); i++, j++) {
            
        }
    }

    public void exibirCombinacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
