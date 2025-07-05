
package rpgsocial.persistence;

import java.util.ArrayList;
import rpgsocial.model.Combinacao;
import rpgsocial.model.Conceito;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class CatalogoCombinacao {

    private ArrayList<Combinacao> combinacoes;

    public CatalogoCombinacao() {
        combinacoes = new ArrayList<>();
    }

    public boolean adicionar(Combinacao combinacao) {
        Combinacao invertida = new Combinacao(combinacao.getConceitoB(), combinacao.getConceitoA(), combinacao.getCompatibilidade(), combinacao.getDataCombinacao());
        if (!combinacoes.contains(invertida) && !combinacoes.contains(combinacao)) {
            combinacoes.add(combinacao);
            return true;
        }
        return false;
    }

    public boolean remover(Combinacao combinacao) {
        combinacoes.remove(combinacao);
        return !combinacoes.contains(combinacao);
    }

    public ArrayList<Combinacao> getCombinacoes() {
        return combinacoes;
    }

    public ArrayList<Combinacao> buscar(Conceito conceito) {
        ArrayList<Combinacao> existeCombinacoes = new ArrayList<>();
        for (Combinacao combinacao : combinacoes) {
            if (combinacao.getConceitoA().equals(conceito) || combinacao.getConceitoB().equals(conceito)) {
                existeCombinacoes.add(combinacao);
            }
        }
        
        return existeCombinacoes;
    }
    
    
}
