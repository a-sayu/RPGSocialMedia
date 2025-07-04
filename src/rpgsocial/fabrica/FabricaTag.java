/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgsocial.fabrica;

import rpgsocial.model.Tag;

/**
 *
 * @author MIGUEL CAMPOS
 */
class FabricaTag {
    
    public FabricaTag(){
    }

    Tag fabricar(String nome, String categoria) {
        Tag tag = new Tag(nome, categoria);
        return tag;
    }
}
