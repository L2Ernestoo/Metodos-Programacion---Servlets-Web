/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import static java.lang.System.out;

/**
 *
 * @author jorge
 */
public class Calculadora {
    double resultado;
    
    public Calculadora(){
        resultado = 0;
        
        
    }
   
     //Primera Opcion
      public String pares(int nu1){
          if(nu1%2==0)
              return "El número " + nu1 + " es par";
          else
              return "El numero "+ nu1 + " es impar";
      }
      
      //Segunda Opcion
      public String produs(int nu1, int nu2){
         return "El producto de " + nu1 + " y " + nu2 + " es: " + nu1*nu2;
      }
      
      //Tercera Opcion
      public String nummay(int nu1, int nu2){
          if(nu1>nu2)
              return "El numero mayor es: " + nu1;
          else
              return "El numero mayor es: " + nu2;
      }
      
      //Cuarta Opcion
      public String nummay3(int nu1, int nu2, int nu3) {          
          if (nu1 > nu2) {
            if (nu1 > nu3) {
                return "El mayor es: " + nu1;
            } else {
                return "El mayor es: " + nu3;
            }
            
        } else if (nu2 > nu3) {
            return "El mayor es: " + nu2;
        } else {
            return "El mayor es: " + nu3;
        } 
          
    }
      
      //Quinta Opcion
      public String tablamult(int nu1){
          
          /**
          
         * for(int i = 1; i<=10; i++) {
        *        return i + " * " + nu1 + " = " + i*nu1 + "<br>";
         *   }
        *  
        */
          return "1 * " + nu1 + " = " + 1 * nu1 + 
                  "<br> 2 * " + nu1 + " = " + 2 * nu1 + 
                  "<br> 3 * " + nu1 + " = " + 3 * nu1 + 
                  "<br> 4 * " + nu1 + " = " + 4 * nu1 + 
                  "<br> 5 * " + nu1 + " = " + 5 * nu1 + 
                  "<br> 6 * " + nu1 + " = " + 6 * nu1 + 
                  "<br> 7 * " + nu1 + " = " + 7 * nu1 + 
                  "<br> 8 * " + nu1 + " = " + 8 * nu1 + 
                  "<br> 9 * " + nu1 + " = " + 9 * nu1 + 
                  "<br> 10 * " + nu1 + " = " + 10 * nu1;

      }
      
    
    
    
    //Sexta Opcion
    
    public String produsum(String num[]){
          int suma=0, produ=1;
       
          for(int i=0; i<30; i++){
             suma = suma + Integer.parseInt(num[i]);
             produ = produ * Integer.parseInt(num[i]);
          }
          return "La suma total es: " + suma + "<br> El Producto es: " + produ;
    }
   
    //septima opcion
          public String septima_opcion_negativo(String num[]){
              int suma=0;
          for(int i=0; i<num.length; i++){
             suma = suma + Integer.parseInt(num[i]);
             
          }
          return "La suma total es: " + suma;
      }

    
    //Octava Opcion
    public String prosum(int nu1, int nu2){
        int pro=0;
        while(nu2!=0){
            pro=pro+nu1;
            nu2 = nu2 - 1;
        }
        
        return "El producto es: " + pro;
        
    }
    
    //Novena Opcion
    public String divirest(int nu1, int nu2){
        int cociente=0, resi = 0;
        if(nu1==0){
            return "No se pudo realizar la formula";
        } else {
            resi=nu1;
            while(resi>=nu2){
                resi = resi - nu2;
                cociente = cociente + 1;
            }
        }
        return "El Cociente es: " + cociente + "<br>El Residuo es: " + resi;
        
    }
    
    public String decima_opcion_producto(String numpro[]){
              int producto=1;
          for(int i=0; i<numpro.length; i++){
             producto = producto * Integer.parseInt(numpro[i]);
             
          }
          return "El producto total es: " + producto;
      }



    
    
    
    
    
    
    
    
    
     
}
