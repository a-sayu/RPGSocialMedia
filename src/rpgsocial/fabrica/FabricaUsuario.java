package rpgsocial.fabrica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import rpgsocial.model.Usuario;


/**
 *
 * @author Sayu
 */
public class FabricaUsuario {
    
    public FabricaUsuario() {
        
    }

    public Usuario registrarUsuario(ArrayList<String> registro) {
        String nome = registro.get(0);
        String email = registro.get(1);
        String senha = registro.get(2);
        int idade = Integer.parseInt(registro.get(3));
        String cidade = registro.get(4);
        String estado = registro.get(5);
        String pais = registro.get(6);
        LocalDateTime dataCriacao = LocalDateTime.now();
        
        Usuario novoUsuario = new Usuario(dataCriacao, nome, idade, cidade, estado, pais, email, senha);
        return novoUsuario;
        
    }
    
}
