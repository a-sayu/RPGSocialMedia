package rpgsocial.controller;

import java.util.ArrayList;
import rpgsocial.fabrica.FabricaConceito;
import rpgsocial.model.Conceito;
import rpgsocial.persistence.CatalogoConceito;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class ControladorConceito {

    private final CatalogoConceito catalogo;
    private final FabricaConceito fabrica;
    
    public ControladorConceito() {
        catalogo = new CatalogoConceito();
        fabrica = new FabricaConceito();
    }

    public void exibirConceitos() {

    }
    //
    public void registrar(ArrayList<String> dadosConceito) {
        Conceito conceito = fabrica.fabricar(dadosConceito);
        catalogo.adicionar(conceito);
    }
    
    public Conceito buscar(String nome) {
        return catalogo.buscar(nome);
    }
    

}
