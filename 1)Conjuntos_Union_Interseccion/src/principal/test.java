
package principal;
import Operaciones.Operaciones;
import java.util.Scanner;

public class test {
 
    public static void main(String[] args) {
        
      Scanner  sn= new Scanner(System.in);
     int n ;
        do {
    System.out.println("MENU");
    System.out.println("Ingrese el numero de la operacion que desea realizar ");
    System.out.println("1 Crear los conjuntos y sus elementos ");
    System.out.println("2 Realizar la union de los conjuntos ");
    System.out.println("3 Realizar la interseccion de los conjuntos ");
    System.out.println("4 Realizar la diferencia de conjuntos ");
    System.out.println("5 Finalizar el programa");
     n =  sn.nextInt(); 
       
   
   
    if(n==1){
        String conj;
        
       Operaciones.creacion(conj="primer");
       Operaciones obj = new Operaciones();
        System.out.print("{");
        for (int i = 0 ;i<(Operaciones.getA().length);i++){
        System.out.print(obj.toString(i,Operaciones.getA()));      
        }
        System.out.print("}");
        System.out.println(" "); 
        
       Operaciones.creacion(conj="segundo");
        System.out.print("{");
        for (int i = 0 ;i<Operaciones.getB().length;i++){
        System.out.print(obj.toString(i,Operaciones.getB()));      
        }
        System.out.print("}");
        System.out.println(" ");
    }   
    if(n==2){
        Operaciones.unión();
          
    }
    if(n==3){
        Operaciones.intersección();    
                   
    }
       
    if(n==4){
        Operaciones.diferencia();
    }
    } 
        while(5!=n);    
   System.out.println("Gracias por usar nuestro Software tenga un buen dia ");
        
    
        
}
    }
    

