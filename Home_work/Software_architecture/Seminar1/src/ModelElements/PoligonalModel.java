package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligones;
    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligones = new ArrayList<Poligon>();
    }
}
