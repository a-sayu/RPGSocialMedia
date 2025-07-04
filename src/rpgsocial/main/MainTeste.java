package rpgsocial.main;

import java.util.ArrayList;
import java.util.List;
import rpgsocial.controller.ControladorCombinacao;
import rpgsocial.controller.ControladorConceito;
import rpgsocial.controller.ControladorUsuario;

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
        
        ControladorConceito controladorConceito = new ControladorConceito();
        
        ArrayList<String> conceitoA = new ArrayList<>(List.of(
                registroA.get(0), 
                "Jorge, o Indomável",
                "DND",
                "GRANDE",
                "HORARIOS",
                "SEGUNDA",
                "TERCA",
                "QUINTA",
                "SEXTA",
                "TAGS",
                "personagem", "tipo",
                "guerreiro", "classe",
                "humano", "raça",
                "homem", "atributo"
        ));
        
        ArrayList<String> conceitoB = new ArrayList<>(List.of(
                registroA.get(0), 
                "Jorge, o Indescritivel",
                "D&D",
                "GROSSO",
                "HORARIOS",
                "SEGUNDA",
                "TERCA",
                "QUINTA",
                "SEXTA",
                "TAGS",
                "personagem", "tipo",
                "guerreiro", "classe",
                "humano", "raça",
                "homem", "atributo"
        ));
        
        ArrayList<String> conceitoC = new ArrayList<>(List.of(
                registroB.get(0), 
                "José, o Grande",
                "T20",
                "PARECE ATÉ CIPÓ",
                "HORARIOS",
                "TERCA",
                "QUINTA",
                "TAGS",
                "personagem", "tipo",
                "mago", "classe",
                "elfo", "raça",
                "sombrio", "atributo",
                "belo", "atributo"
                
        ));
        
        ArrayList<String> conceitoD = new ArrayList<>(List.of(
                registroC.get(0), 
                "Jorsefina, a pequena",
                "T20",
                "SABE DE QUEM EU TO FALANDO",
                "HORARIOS",
                "QUARTA",
                "TAGS",
                "personagem", "tipo",
                "maga", "classe",
                "elfa", "raça",
                "sombria", "atributo",
                "bela", "atributo"
        ));
        
        controladorConceito.registrar(conceitoA);
        controladorConceito.registrar(conceitoB);
        controladorConceito.registrar(conceitoC);
        controladorConceito.registrar(conceitoD);
        
        
        ControladorCombinacao controlCombinacao = new ControladorCombinacao();
        boolean compativel = controlCombinacao.combinarConceitos(controladorConceito.buscar("Jorge, o Indescritivel"), controladorConceito.buscar("Jorge, o Indomável"));
        if (compativel) {
            System.out.println("conceitoA e conceitoB foram combinados");
        }
        
        boolean compativel2 = controlCombinacao.combinarConceitos(controladorConceito.buscar("José, o Grande"), controladorConceito.buscar("Jorsefina, a pequena"));
        if (compativel2) {
            System.out.println("campanhaA e campanhaB foram combinados");
        }
    }
}
