
package rpgsocial.persistence;

import java.util.ArrayList;
import rpgsocial.model.Combinacao;

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
        Combinacao invertida = new Combinacao(combinacao.getConceitoB(), combinacao.getConceitoA(), combinacao.getPorcentagem());
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

    public void exibirCombinacoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
