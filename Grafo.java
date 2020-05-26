
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author oscar
 */
public class Grafo<E>{
    
    protected Arco<E> matriz[][];
    protected Map<E,Vertice<E>> dict;
    protected List<Integer> freeList;
    protected List<String> lista;
    protected  Double[][] datos; //Distancias
    protected int size;


    
    public Grafo(int size) {
        this.lista = new ArrayList<>();
        this.size = size;
        this.matriz = new Arco[size][size];
        this.datos = new Double[size][size];
        this.dict = new HashMap<>(size);
        this.freeList = new ArrayList<>();
        for (int row = size-1; row >= 0; row--) { freeList.add(row); }
        for(int i = 0; i < datos.length; i++) {
            for(int j = 0; j < datos.length; j++) {
                datos[i][j] = Double.POSITIVE_INFINITY;
                if(i==j){
                    datos[i][j] = 0.0;
                }
            }
        }
    }

    
    public void MostrarEnPantalla() {
        System.out.println("Matriz: ");
        System.out.print("\t\t\t");
        for(int k = lista.size()-1; k >=0; k--){
            System.out.print(lista.get(k)+"\t\t");
        }
        System.out.println("");
        int holi = lista.size()-1;
        for (int i = 0; i < datos.length; i++) {
            if(holi>=0){
                System.out.print(lista.get(holi).toString()+"\t\t");
                holi--;
            }
            for (int j = 0; j <datos.length; j++) {
                System.out.print(datos[i][j]+ "\t\t");
            }
            System.out.println();
        }
    }
    
    public void add(E nombre) {
        if (dict.containsKey(nombre)) return;
        int pos = freeList.remove(0);
        dict.put(nombre, new Vertice<>(nombre,pos));
        lista.add(nombre.toString());
    }
    
    public String addEdge(E vortice1, E vortice2, double label) {
        Vertice<E> vertice1 = dict.get(vortice1);
        Vertice<E> vertice2 = dict.get(vortice2);
        if(vertice1 == null || vertice2 == null) {
            return "No se encuntra";
        }else {
            matriz[vertice1.getPosicion()][vertice2.getPosicion()] = new Arco<E>(vortice1, vortice2, label, true);
            datos[vertice1.getPosicion()][vertice2.getPosicion()] = label;
            return "Realizado con exito";
        }
    }

    
    public String removeEdge(E vortice1, E vortice2){
        String cadena1 = "No se realizo la accion";
        String cadena2 = "Se realizo la accion";
        Vertice<E> vertice1 = dict.get(vortice1);
        Vertice<E> vertice2 = dict.get(vortice2);
        if(vertice1 == null || vertice2 == null) {
            return cadena1;
        }else {
            matriz[vertice1.getPosicion()][vertice2.getPosicion()] = null;
            datos[vertice1.getPosicion()][vertice2.getPosicion()] = Double.POSITIVE_INFINITY;
            return cadena2;
        }
    }
    
    public String getRutaMasCorta(E label1, E label2) {
        Vertice<E> vtx1 = dict.get(label1);
        Vertice<E> vtx2 = dict.get(label2);
        if (vtx1 == null || vtx2 == null) return "Conexion no existente ";
        return "La ruta mas corta es de: " + this.datos[vtx1.posicion][vtx2.posicion] + ".";
    }
    
    public String getCentroGrafo() {

        int[] columnaMax = new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            Double MAX = datos[i][0];
            int post = 0;
            for (int j = 0; j < datos.length; j++) {
                if (i != j) {
                    Double temp = datos[i][j];
                    if (temp > MAX) {
                        MAX = temp;
                        post = j;
                    }
                }
            }
            columnaMax[i] = post;
        }

        int minPos = 0;
        Number min = columnaMax[0];
        for (int x = 0; x < columnaMax.length; x++) {
            Number temp = columnaMax[x];
            if (temp.doubleValue() < min.doubleValue()) {
                min = temp;
                minPos = x;
            }
        }
        return lista.get(lista.size() - 1 - minPos);
    }

    
    public Double getDistanciaMinima(E nom1, E nom2) {
        Vertice<E> vtx1 = dict.get(nom1);
        Vertice<E> vtx2 = dict.get(nom2);
        if (vtx1 == null || vtx2 == null){
            return null;
        }
        return this.datos[vtx1.getPosicion()][vtx2.getPosicion()];
    }
    
    public void floyd()
    {
        int n=datos.length;
        Double D[][]=datos;

        String enlaces[][]=new String [n][n];
        String[][] aux_enlaces=new String[datos.length][datos.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                enlaces[i][j]="";
                aux_enlaces[i][j]="";
            }
        }
        String enl_rec="";
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Double aux=D[i][j];
                    Double aux2=D[i][k];
                    Double aux3=D[k][j];
                    Double aux4=aux2+aux3;
                    Double res=Math.min(aux,aux4);
                    if(aux!=aux4)
                    {
                        if(res==aux4)
                        {
                            enl_rec="";
                            aux_enlaces[i][j]=k+"";
                            enlaces[i][j]=enlaces(i,k,aux_enlaces,enl_rec)+(k+1);
                        }
                    }
                    D[i][j]=(Double) res;
                }
            }
        }
        datos=D;
    }
    
    public String enlaces(int i,int k,String[][] aux_enlaces,String enl_rec)
    {
        if(aux_enlaces[i][k].equals(""))
        {
            return "";
        }
        else
        {
            enl_rec+=enlaces(i,Integer.parseInt(aux_enlaces[i][k].toString()),aux_enlaces,enl_rec)+(Integer.parseInt(aux_enlaces[i][k].toString())+1)+" , ";
            return enl_rec;
        }
    }
    
}
