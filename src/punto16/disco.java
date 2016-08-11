/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto16;
import java.util.Scanner;
/**
 *
 * @author practi24
 */
public class disco extends publicacion{
   private Scanner lector;
   private String duracion;

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
   
   public void mostrar_disco(){
     
        mostrar_dato(); //se puede llamar asi, ya que esta no recibe ni ingresa datos
        System.out.println("\nDuracion: \n"+getDuracion());
        
    }
    
   public void load_data(){
       
    ingresar();
    lector = new Scanner(System.in);
    System.out.println(" Ingrese la duracion");
    duracion = lector.next();       // Recibo el titulo y guardo 
    
    }
   
   
}