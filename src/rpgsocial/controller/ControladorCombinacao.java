package rpgsocial.controller;

import static java.lang.Math.floor;
import java.time.LocalDate;
import rpgsocial.model.Combinacao;
import rpgsocial.model.Conceito;
import rpgsocial.model.Tag;
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
        Combinacao novaCombinacao = criarCombinacao(conceitoA, conceitoB, compatibilidade);
        if (!(novaCombinacao == null)) {
            return catalogoCombinacao.adicionar(novaCombinacao);
        }
        return false;
    }

    public Combinacao criarCombinacao(Conceito conceitoA, Conceito conceitoB, int porcentagem) {
        if (porcentagem > 50) {
            Combinacao novaCombinacao = new Combinacao(conceitoA, conceitoB, porcentagem);
            return novaCombinacao;
        }
        return null;
    }

    public int verificarCompatibilidade(Conceito conceitoA, Conceito conceitoB) {
        int compatibilidade = 0;
        if (conceitoA.getSistema().equalsIgnoreCase(conceitoB.getSistema())) {
            compatibilidade = compatibilidade + 33;
        }
        System.out.println("Compatibilidade Apos Sistema: " + compatibilidade);

        int total = conceitoB.getHorarios().size();
        int iguais = 0;

        if (conceitoA.getHorarios().size() > conceitoB.getHorarios().size()) {
            total = conceitoA.getHorarios().size();
        }

        for (LocalDate horarioA : conceitoA.getHorarios()) {
            for (LocalDate horarioB : conceitoB.getHorarios()) {
                if (horarioA == horarioB) {
                    iguais++;
                }
            }
        }

        int valor = (int) ((iguais / total) * 33);
        compatibilidade = compatibilidade + valor;
        System.out.println("Compatibilidade Apos Horarios: " + compatibilidade);

        total = conceitoB.getTags().size();
        iguais = 0;

        if (conceitoA.getTags().size() > conceitoB.getTags().size()) {
            total = conceitoA.getTags().size();
        }

        for (Tag tagA : conceitoA.getTags()) {
            for (Tag tagB : conceitoB.getTags()) {
                if (tagA.getCategory().equalsIgnoreCase(tagB.getCategory()) && tagA != tagB) {
                    iguais++;
                }
            }
        }

        valor = (int) ((iguais / total) * 33);
        compatibilidade = compatibilidade + valor;
        System.out.println("Compatibilidade Apos Tags: " + compatibilidade);
        return compatibilidade;
    }

    public void exibirCombinacoes() {
        catalogoCombinacao.exibirCombinacoes();
    }

}
