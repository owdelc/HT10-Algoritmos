
import java.util.Objects;
/**
 *
 * @author oscar
 */
public class Vertice<K> {
    private K clave;
    private boolean utilizado;
    int posicion;

    
    public Vertice(K clave,  int posicion) {
        this.clave = clave;
        this.utilizado = utilizado;
        this.posicion = posicion;
    }

    
    public boolean isVisited(){
        return utilizado;
    }

    
    @Override
    public boolean equals(Object o){
        return false;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clave, utilizado, posicion);
    }

    
    public void reset(){
        utilizado = false;
    }

    
    public int getPosicion(){
        return this.posicion;
    }

    
    @Override
    public String toString() {
        return "Vertice {" +
                "nombre = " + clave +
                ", utilizado = " + utilizado +
                ", posicion = " + posicion +
                '}';
    }
}
