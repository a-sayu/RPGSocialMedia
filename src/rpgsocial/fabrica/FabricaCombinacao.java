/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgsocial.fabrica;

import java.time.LocalDateTime;
import rpgsocial.model.Combinacao;
import rpgsocial.model.Conceito;

/**
 *
 * @author MIGUEL CAMPOS
 */
public class FabricaCombinacao {
    public FabricaCombinacao(){
        
    }
    
    public Combinacao fabricar(Conceito conceitoA, Conceito conceitoB, int compatibilidade) {
        return new Combinacao(conceitoA, conceitoB, compatibilidade, LocalDateTime.now());
    }
}
