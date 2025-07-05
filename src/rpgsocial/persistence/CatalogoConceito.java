/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package rpgsocial.persistence;

import java.util.ArrayList;
import rpgsocial.model.Conceito;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class CatalogoConceito {
    
    private ArrayList<Conceito> conceitos;
    
    public CatalogoConceito() {
       conceitos = new ArrayList<>();
    }

    public boolean adicionar(Conceito conceito) {
        conceitos.add(conceito);
        return conceitos.contains(conceito);
    }
    
    public Conceito buscar(String nome) {
        for (Conceito conceito : conceitos) {
            if (conceito.getNome().equals(nome)) {
                return conceito;
            }
        }
        return null;
    }
    
    public boolean remover(Conceito conceito) {
        conceitos.remove(conceito);
        return !conceitos.contains(conceito);
    }

}
