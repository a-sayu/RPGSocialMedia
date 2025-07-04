package rpgsocial.main;

import java.time.*;
import java.util.ArrayList;
import rpgsocial.app.App;
import rpgsocial.controller.ControladorCombinacao;
import rpgsocial.controller.ControladorConceito;
import rpgsocial.model.Combinacao;
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
        Usuario usuarioA = new Usuario();
        Usuario usuarioB = new Usuario();
        
        ArrayList<LocalDate> horariosA = new ArrayList<>();
        horariosA.add(LocalDate.parse("2025-07-04"));
        horariosA.add(LocalDate.parse("2025-07-05"));
        horariosA.add(LocalDate.parse("2025-07-06"));
        horariosA.add(LocalDate.parse("2025-07-07"));
        ArrayList<LocalDate> horariosB = new ArrayList<>();
        horariosB.add(LocalDate.parse("2025-07-05"));
        horariosB.add(LocalDate.parse("2025-07-07"));
        
        Tag tagA = new Tag("guerreiro");
        Tag tagE = new Tag("homem");
        Tag tagG = new Tag("humano");
        ArrayList<Tag> tagsA = new ArrayList<>();
        tagsA.add(tagA);
        tagsA.add(tagE);
        tagsA.add(tagG);
        Tag tagB = new Tag("mago");
        Tag tagC = new Tag("sombrio");
        Tag tagD = new Tag("belo");
        Tag tagF = new Tag("elfo");
        ArrayList<Tag> tagsB = new ArrayList<>();
        tagsB.add(tagB);
        tagsB.add(tagC);
        tagsB.add(tagD);
        tagsB.add(tagF);
        LocalDateTime criacaoA = LocalDateTime.now();
        LocalDateTime criacaoB = LocalDateTime.now();
        Conceito conceitoA = new Conceito(usuarioA, "ConceitoA", "DnD", horariosA, tagsA, criacaoA, criacaoA);
        Conceito conceitoB = new Conceito(usuarioB, "ConceitoB", "DnD", horariosB, tagsB, criacaoB, criacaoB);
        
        ControladorCombinacao controlCombinacao = new ControladorCombinacao();
        boolean compativel = controlCombinacao.verificarCompatibilidade(conceitoA, conceitoB);
        if (compativel) System.out.println("conceitoA e conceitoB foram combinados");
    }
}
