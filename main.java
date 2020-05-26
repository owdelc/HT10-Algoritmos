import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class main {
    public static void main(String[] args) throws IOException {
       
        
        Scanner ingreso = new Scanner(System.in);
        
              
        File base = new File("Gtgrafo.txt");
        FileReader reader = new FileReader(base);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        
        ArrayList<String> datos = new ArrayList<>();
        while((line = buffer.readLine()) != null){
            String[] parts = line.split(" ");
            String origen = parts[0];
            if(!datos.contains(origen)){
                datos.add(origen);
            }
            String destino = parts[1];
            if(!datos.contains(destino)){
                datos.add(destino);
                
            }
        }
        
        int total = datos.size();
        
        Grafo<String> grafe = new Grafo<String>(total);
        
        File base2 = new File("Gtgrafo.txt");
        FileReader reader2 = new FileReader(base2);
        BufferedReader buffer2 = new BufferedReader(reader2);
        
        String line2;
        
        while((line2 = buffer2.readLine()) != null){
            String[] parts = line2.split(" ");
            String origen = parts[0];
            if (!grafe.lista.contains(origen)){
                grafe.add(origen);
            }
            String destino = parts[1];
            if(!grafe.lista.contains(destino)){
                grafe.add(destino);
            }
            int distancia = Integer.parseInt(parts[2]);
            grafe.addEdge(origen, destino, distancia);
            
        }
        
        grafe.floyd();
        
   
    
    while (true){
        System.out.println("Bienvenido al Sistema de Movilidad para la Pandemia (BSMP)");
        System.out.println("Las opciones disponibles son: ");
        System.out.println("1.Analisis de distancia entre ciudades" + "\n" 
        + "2.Analisis de centro del grafo" + "\n" + "3.Realizar modificaciones en el grafo" + "\n"
        + "4.Mostrar matriz de adyacencia" + "\n" + "5.Salir del Programa");
        
        String eleccion = ingreso.nextLine();
        
        if (eleccion.equals("1")){
            System.out.println("Ingrese ciudad de origen");
            String origen = ingreso.nextLine().toLowerCase();
            System.out.println("Ingrese ciudad destino");
            String destino = ingreso.nextLine().toLowerCase();
            if (grafe.lista.contains(origen)&& grafe.lista.contains(destino)){
               Double distanciafinal = grafe.getDistanciaMinima(origen, destino);
               if(distanciafinal != Double.POSITIVE_INFINITY){
                   System.out.println("La distancia de la trayectoria seleccionada es" + distanciafinal + "km");
               }
               else{System.out.println("No ha sido posible realizar la ruta soliciatada");}             }
            
        }
        if (eleccion.equals("2")){System.out.println("El centro del grafo solicitado es:" + grafe.getCentroGrafo());}
        if (eleccion.equals("3")){
            System.out.println("Acciones disponibles:" + "\n" + "1.Agregar conexion entre ciudades" + "\n"
            + "2.Eliminar conexion entre ciudades");
            String cambio = ingreso.nextLine();
            if(cambio.equals("1")){
                System.out.println("Ingrese ciudad de origen");
                String origen = ingreso.nextLine().toLowerCase();
                System.out.println("Ingrese ciudad de destino");
                String destino = ingreso.nextLine().toLowerCase();
                System.out.println("Ingrese distancia que desea establecer");
                double distancia = ingreso.nextDouble();
                ingreso.nextLine();
                try{
                    grafe.addEdge(origen, origen, distancia);
                    System.out.println("Solicitud realizada satisfactoriamente");
                }catch(Exception e){
                    System.out.println("No fue posible realizar su solicitud, intentelo nuevemnte.");
                }
                grafe.floyd();
            }
            if(cambio.equals("2")){
             System.out.println("Ingrese ciudad de origen");
                String origen = ingreso.nextLine().toLowerCase();
                System.out.println("Ingrese ciudad de destino");
                String destino = ingreso.nextLine().toLowerCase();
                try {
                    grafe.removeEdge(origen, destino);
                    System.out.println("Solicitud realizada satisfactoriamente");
                } catch (Exception e) {
                    System.out.println("No fue posible realizar su solicitud, intentelo nuevamente");
                }
                grafe.floyd();
               
            }else{
                System.out.println("Solicitud no disponible");        
                        }

        }
        if(eleccion.equals("4")){
           grafe.MostrarEnPantalla();
        }
        if(eleccion.equals("5")){
            System.out.println("¡Hasta pronto!" + "\n" + "Powered By: OSKI Labs");
            break;
        }
        else{
            System.out.println("Solicitud no disponible");
        }
        
    }
}
}
    
    

