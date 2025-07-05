

package rpgsocial.persistence;

import java.util.ArrayList;
import rpgsocial.model.Tag;

/**
 *
 * @author Abigail S. N. - @a-sayu
 *
 */
public class CatalogoTag {
    private ArrayList<Tag> tags;
    
    public CatalogoTag() {
        tags = new ArrayList<>();
    }

    public boolean adicionar(Tag tag) {
        if (!tags.contains(tag)) {
            tags.add(tag);
            return true;
        }
        return false;
    }

    public boolean remover(Tag tag) {
        tags.remove(tag);
        return !tags.contains(tag);
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }
    
    
    public Tag buscarPorNome(String nome) {
        for (Tag tag : tags) {
            if (tag.getNome().equals(nome)) {
                return tag;
            }
        }
        return null;
    }
    
    public ArrayList<Tag> buscarPorCategoria(String categoria) {
        ArrayList<Tag> tagsEmCategoria = new ArrayList<>();
        for (Tag tag : tags) {
            if (tag.getCategoria().equals(categoria)) {
                tagsEmCategoria.add(tag);
            }
        }
        return tagsEmCategoria;
    }
}
