/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tarea3;

/**
 *
 * @author elvir
 */
 import java.util.Scanner;
public class Tarea2 {
    
    /**
     * @param args the command line arguments
     */    
    

    public static void main(String args[]) {
        // TODO code application logic here
 
        Scanner entrada=new Scanner(System.in);
   
   String operacion,val1,operador,val2; 
  
   System.out.println("Ingrese una operacion aritmetica, ejem: 3 + 12");
        
        operacion=entrada.nextLine(); 
        
        val1=operacion.split(" ")[0];   
        operador=operacion.split(" ")[1]; 
        val2=operacion.split(" ")[2];   
        
        double doblevalor1=Double.valueOf(val1); 
        double doblevalor2=Double.valueOf(val2); 
        
        String suma="+", resta="-", multiplicacion="*", division="/"; 
            
            if(operador.equals(suma)){  
                
                System.out.println(doblevalor1+doblevalor2);
                
            }
            
            if(operador.equals(resta)){      
                
                System.out.println(doblevalor1-doblevalor2);    
                
            }
            
            if(operador.equals(division)){      
                
                System.out.println(doblevalor1/doblevalor2);     
                
            }
            
            if(operador.equals(multiplicacion)){             
                
                System.out.println(doblevalor1*doblevalor2);    
    }
   
}

}
