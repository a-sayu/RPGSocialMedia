package rpgsocial.controller;

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
            compatibilidade = compatibilidade + 25;
        }
        System.out.println("Compatibilidade Apos Sistema: " + compatibilidade);

        int total = conceitoB.getHorarios().size();
        int iguais = 0;

        if (conceitoA.getHorarios().size() > conceitoB.getHorarios().size()) {
            total = conceitoA.getHorarios().size();
        }

        for (String horarioA : conceitoA.getHorarios()) {
            for (String horarioB : conceitoB.getHorarios()) {
                if (horarioA.equals(horarioB)) {
                    iguais++;
                }
            }
        }

        System.out.println("Horarios " + iguais);

        int valor = (int) (((double) iguais / (double) total) * 50);
        System.out.println("Valor " + valor);
        compatibilidade = compatibilidade + valor;
        System.out.println("Compatibilidade Apos Horarios: " + compatibilidade);

        total = 0;
        iguais = 0;
        boolean flagCampanha = false;

        System.out.println("Total " + total);

        for (Tag tagA : conceitoA.getTags()) {
            for (Tag tagB : conceitoB.getTags()) {
                if (tagA.getNome().equalsIgnoreCase(tagB.getNome()) && tagB.getNome().equalsIgnoreCase("campanha")) {
                    flagCampanha = true;
                    System.out.println("Flag " + flagCampanha);
                }
                if (tagA.getCategoria().equalsIgnoreCase(tagB.getCategoria())) {
                    total++;
                    System.out.println("Tag A " + tagA.getNome());
                    System.out.println("Tag B " + tagB.getNome());
                    if (!tagA.getNome().equals(tagB.getNome())) {
                        iguais++;
                        System.out.println("Compativeis " + iguais);
                    }
                }

            }
            if (flagCampanha) {
                iguais = 0;
                compatibilidade = 0;
                break;
            }
        }
        System.out.println("Tags " + iguais);

        valor = (int) (((double) iguais / (double) total) * 25);
        System.out.println("Valor " + valor);
        compatibilidade = compatibilidade + valor;
        System.out.println("Compatibilidade Apos Tags: " + compatibilidade);
        return compatibilidade;
    }

    public void exibirCombinacoes() {
        catalogoCombinacao.exibirCombinacoes();
    }

}
