
import java.util.Objects;
/**
 *
 * @author oscar
 */
public class Arco<E> {
    private boolean utilizado;
    private boolean check;
    private double distancia;
    private E vortice1;
    private E vortice2;
    
    public Arco(E vortice1, E vortice2, double distancia, boolean check){
    this.vortice1 = vortice1;
    this.vortice2 = vortice2;
    this.distancia = distancia;
    this.check = check;
    this.utilizado = utilizado;
    }
    
    public boolean equals(Object n){
        if(this == n) {
            return true;}
        if(!(n instanceof Arco)){
            return false;
        }
        Arco<?> arco = (Arco<?>) n;
        return Double.compare(arco.distancia, distancia) == 0
                && check == arco.check
                && utilizado == arco.utilizado
                && Objects.equals(vortice1, arco.vortice1)
                && Objects.equals(vortice2, arco.vortice2);
                
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(vortice1, vortice2, distancia, check, utilizado);
    }

    
    public E here() {
        return this.vortice1;
    }
    public void reset(){
        utilizado = false;
    }

   
    public E there(){
        return this.vortice2;
    }

    
    public double distancai(){
        return this.distancia;
    }

    
    public boolean isVisited(){
        return utilizado;
    }

    
    @Override
    public String toString() {
        return "Arco {" +
                "vortice1 =" + vortice1 +
                ", vortice2 =" + vortice2 +
                ", distancia =" + distancia +
                ", check = " + check +
                ", utilizado = " + utilizado +
                '}';
    }
    
}
