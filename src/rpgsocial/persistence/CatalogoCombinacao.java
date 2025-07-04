
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
        combinacoes = new ArrayList<Combinacao>();
    }

    public boolean adicionar(Combinacao combinacao) {
        combinacoes.add(combinacao);
        if (combinacoes.contains(combinacao)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean remover(Combinacao combinacao) {
        combinacoes.remove(combinacao);
        if (combinacoes.contains(combinacao)) {
            return false;
        } else {
            return true;
        }
    }
}
