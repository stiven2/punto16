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
public class libro extends publicacion {
   
    private Scanner lector;
    private  String paginas, fecha;

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPaginas() {
        return paginas;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    public void mostrar_libro(){
     
        mostrar_dato(); //se puede llamar asi, ya que esta no recibe ni ingresa datos
        System.out.println("\nNumero de paginas: \n"+getPaginas()+
                "\nFecha:\n"+ getFecha());
    
    }
    
   public void load_data(){
       
    ingresar();
    lector = new Scanner(System.in);
    System.out.println(" Ingrese el numero de paginas");
    paginas = lector.next();       // Recibo el titulo y guardo 
    System.out.println(" Ingrese la fecha");   // Recibo el precio
    fecha = lector.next();
    }   
     

    
 }
