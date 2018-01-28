
package Operaciones;

import java.util.Scanner;

public  class Operaciones {
 private static int num1 ;
 private static int A[];
 private static int B[];
 private static int C[];
 private static int D[];

    public static int getNum1() {
        return num1;
    }

    public static int[] getA() {
        return A;
    }

    public static int[] getB() {
        return B;
    }

    public static int[] getC() {
        return C;
    }

    public static int[] getD() {
        return D;
    }


  public  static void creacion(String conj){
  Scanner entrada=new Scanner(System.in);  
  System.out.println("ingrese la dimensiòn del "+ conj+" conjunto : ");
  
  if ("primer".equals(conj)){
    num1 = entrada.nextInt();
    A = new int[num1];
    System.out.println("ingrese los "+num1+" elementos del conjunto");
    for (int i= 0; i< num1;i++){
    A[i]= entrada.nextInt();
    }
  }else{ 
    num1 = entrada.nextInt();
    B = new int[num1];
    
    System.out.println("ingrese los "+num1+" elementos del conjunto");
    for (int i= 0; i< num1;i++){
    B[i]= entrada.nextInt();
    
  }
  }
   
  System.out.println("Los elementos del "+conj+" conjunto son:  ");
  
 
  } 
  
  public static String unión(){
   
      
      
      
  C = new int [A.length+B.length];
   for(int i=0 ; i<A.length;i++){
      C[i]=A[i];
     
   }
   for(int i=0 ; i<B.length;i++){
      C[A.length+i]=B[i];
     
   } 
   
  System.out.println(" Union de los dos elementos");
  
   Operaciones obj = new Operaciones();
        System.out.print("{");
        
        for(int i = 0;i<C.length;i++){
        for(int j = 0;j<C.length;j++){
            if(i!=j){
              if(C[i]==C[j]){ 
              C[i]= 0 ;
            }    
            }
        }
        }
         for(int i = 0;i<C.length;i++){
             if(C[i]!=0){
                 System.out.print(obj.toString(i,C));
             }
        }
        
        
        
        System.out.print("}");
        System.out.println(" "); 
  
  return null;
  }
  
  public static String intersección(){
  int x = 0;  
  for(int i=0;i<A.length;i++){
    for(int j=0;j<B.length;j++){
        if(A[i]==B[j]){
        x++;        
        }        
    }  
  }
  
  System.out.println("los elementos que se repiten son: "+x); 
  System.out.print("{");
  D = new int[x+1]; 
  for(int i=0;i<A.length;i++){
    for(int j=0;j<B.length;j++){
        if(A[i]==B[j]){
              Operaciones obj = new Operaciones();
              System.out.print(obj.toString(i,A));            
               
        }        
    }  
  }
  System.out.println("}");
  
  return null;
  }
  public static String diferencia(){
  System.out.println("La diferencia entre el conjunto A y el B es: ");  
  System.out.print("{");
    for(int i=0;i< A.length;i++){
      for(int j=0;j<B.length;j++){
        if(A[i]==B[j]){
            A[i]=0;           
        }
      }  
    }
    
    for(int k=0;k<A.length;k++){
     if(A[k]!=0){
      Operaciones obj = new Operaciones();
      System.out.print(obj.toString(k,A));   
     }  
    }
    
  System.out.println("}");
     return null;
  
  }
  public  String toString(int i,int N[]){
     
   String mensaje = ""+N[i]+"," ;
   
  
  return mensaje; 
  }
   
}







