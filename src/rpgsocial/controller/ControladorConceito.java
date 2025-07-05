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
    
    public void registrarConceito(ArrayList<String> dadosConceito) {
        Conceito conceito = fabrica.fabricar(dadosConceito);
        catalogo.adicionar(conceito);
    }
    
    public Conceito buscarConceito(String nome) {
        return catalogo.buscar(nome);
    }
    

}
