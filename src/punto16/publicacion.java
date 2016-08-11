/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author practi24
 */
public class publicacion {
    
    private Scanner lector;
    private String titulo, precio;

    public String getTitulo() { // devuelve el valor que este guardado en titulo
        return titulo;
    }

    public String getPrecio() { // devuelve el valor que este guardado en precio
        return precio;
    }
    
    public void ingresar(){
    lector = new Scanner(System.in);
    System.out.println(" Ingrese el titulo");
    titulo = lector.next();       // Recibo el titulo y guardo 
    System.out.println(" Ingrese el precio");   // Recibo el precio
    precio = lector.next();
    }
    
    public void mostrar_dato(){
    System.out.println("Titulo: \n" + getTitulo()+
                "\n Precio: \n "+ getPrecio());
        
    
    }
    
    
}
