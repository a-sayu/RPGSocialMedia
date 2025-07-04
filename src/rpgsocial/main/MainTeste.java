package rpgsocial.main;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import rpgsocial.controller.ControladorCombinacao;
import rpgsocial.controller.ControladorUsuario;
import rpgsocial.model.Conceito;
import rpgsocial.model.Tag;
import rpgsocial.model.Usuario;

/**
 *
 * @author Sayu
 */
public class MainTeste {

    public static void main(String[] args) {
        System.out.println("Combinacao");

        ControladorUsuario controlUsuario = new ControladorUsuario();
        ArrayList<String> registroA = new ArrayList<>(List.of(
                "João Silva",
                "joao.silva@email.com",
                "senhaSegura123",
                "30",
                "São Paulo",
                "SP",
                "Brasil"));
        ArrayList<String> registroB = new ArrayList<>(List.of(
                "Maria Oliveira",
                "maria.oliveira@gmail.com",
                "minhaSenha@2024",
                "27",
                "Rio de Janeiro",
                "RJ",
                "Brasil"));
        ArrayList<String> registroC = new ArrayList<>(List.of(
                "Carlos Mendes",
                "carlos.mendes@hotmail.com",
                "senhaForte#123",
                "35",
                "Curitiba",
                "PR",
                "Brasil"));

        controlUsuario.registrarUsuario(registroA);
        controlUsuario.registrarUsuario(registroB);
        controlUsuario.registrarUsuario(registroC);

        ArrayList<LocalDate> horariosA = new ArrayList<>(List.of(
                LocalDate.parse("2025-07-04"),
                LocalDate.parse("2025-07-05"),
                LocalDate.parse("2025-07-06"),
                LocalDate.parse("2025-07-07")
        ));

        ArrayList<LocalDate> horariosB = new ArrayList<>(List.of(
                LocalDate.parse("2025-07-05"),
                LocalDate.parse("2025-07-07")
        ));

        ArrayList<LocalDate> horariosC = new ArrayList<>(List.of(
                LocalDate.parse("2025-07-04"),
                LocalDate.parse("2025-07-05"),
                LocalDate.parse("2025-07-06"),
                LocalDate.parse("2025-07-07")
        ));

        ArrayList<Tag> tagsA = new ArrayList<>(List.of(
                new Tag("personagem", "tipo"),
                new Tag("guerreiro", "classe"),
                new Tag("humano", "raça"),
                new Tag("homem", "atributo")
        ));

        ArrayList<Tag> tagsB = new ArrayList<>(List.of(
                new Tag("personagem", "tipo"),
                new Tag("mago", "classe"),
                new Tag("elfo", "raça"),
                new Tag("sombrio", "atributo"),
                new Tag("belo", "atributo")
        ));

        ArrayList<Tag> tagsC = new ArrayList<>(List.of(
                new Tag("medieval", "estilo"),
                new Tag("sombrio", "atributo"),
                new Tag("belo", "atributo"),
                new Tag("campanha", "tipo")
        ));

        LocalDateTime criacaoA = LocalDateTime.now();
        LocalDateTime criacaoB = LocalDateTime.now();
        LocalDateTime criacaoC = LocalDateTime.now();
        Conceito conceitoA = new Conceito(registroA.get(0), "ConceitoA", "DnD", horariosA, tagsA, criacaoA, criacaoA);
        Conceito conceitoB = new Conceito(registroA.get(0), "ConceitoB", "DnD", horariosB, tagsB, criacaoB, criacaoB);
        Conceito campanhaA = new Conceito(registroA.get(0), "ConceitoC", "DnD", horariosC, tagsC, criacaoC, criacaoC);
        Conceito campanhaB = new Conceito(registroA.get(0), "ConceitoD", "DnD", horariosC, tagsC, criacaoC, criacaoC);
        ControladorCombinacao controlCombinacao = new ControladorCombinacao();
        boolean compativel = controlCombinacao.combinarConceitos(conceitoA, conceitoB);
        if (compativel) {
            System.out.println("conceitoA e conceitoB foram combinados");
        }
        
        boolean compativel2 = controlCombinacao.combinarConceitos(campanhaA, campanhaB);
        if (compativel2) {
            System.out.println("campanhaA e campanhaB foram combinados");
        }
    }
}
