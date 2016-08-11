
package punto16;
import java.util.Scanner;

public class Punto16 {


    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        disco cd = new disco();
        libro lb = new libro();
        
        
       
       
        
        
        int opcion = 0;
        do {
        
        System.out.println("Digite la opción deseada");
            System.out.println("1. Ingresar datos de libro");
            System.out.println("2. Mostrar datos de libro");
            System.out.println("3. Ingresar datos de disco");
            System.out.println("4. Mostrar datos de disco");
            System.out.println("0. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: lb.load_data();
                    break;
                case 2:  lb.mostrar_libro();
                    break;
                case 3:  cd.load_data();
        
                    break;
                case 4: cd.mostrar_disco();
                    break;
              
                default: System.out.println("Opción invalida");
            }
        
        
        
        } while(opcion!=0);
        
        
        
        
        
        
        
        
        
        
    }
    
}
