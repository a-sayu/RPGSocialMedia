/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgsocial.fabrica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import rpgsocial.model.Conceito;
import rpgsocial.model.Tag;

/**
 *
 * @author MIGUEL CAMPOS
 */
public class FabricaConceito {
    
    private final FabricaTag fabricaTag;
    
    
    public FabricaConceito() {
        fabricaTag = new FabricaTag();
    }
    
    public Conceito fabricar(ArrayList<String> dadosConceito){
       int index;
       int indexHorarios = 0;
       int indexTags = 0;
       
       for (index = 0; index < dadosConceito.size(); index++) {
           String dado = dadosConceito.get(index);
           
           if (dado.equalsIgnoreCase("Horarios")) {
              indexHorarios = index; 
           } else if (dado.equalsIgnoreCase("Tags")) {
               indexTags = index;
           }
       }
       
       String criador = dadosConceito.get(0);
       String nome = dadosConceito.get(1);
       String sistema = dadosConceito.get(2);
       String descricao = dadosConceito.get(3);
       ArrayList<String> horarios = new ArrayList<>();
       ArrayList<Tag> tags = new ArrayList<>();
       
       for (index = indexHorarios + 1; index < indexTags; index++) {
           horarios.add(dadosConceito.get(index));
       }
       for (index = indexTags + 1; index < dadosConceito.size(); index += 2) {
           Tag tag = fabricaTag.fabricar(dadosConceito.get(index), dadosConceito.get(index+1));
           
           tags.add(tag);
       }
       
       LocalDateTime dataCriacao = LocalDateTime.now();
       
       Conceito conceito = new Conceito(criador, nome, sistema, descricao, horarios, tags, dataCriacao, dataCriacao);
       
       return conceito;
    }
}
