/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class Main {

    Scanner Leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    (new Main()).init();
    
    }
    
    
    public void init(){
        System.out.println("LISP COMPILER");
        System.out.println("Language: Common Lisp           Layout: Vertical");
        Leer.useDelimiter("\n");
        System.out.println(" ");
        String enunciado = Leer.next();
        writeLine2(enunciado);
    }
    
    public void writeLine(String entrada){
        boolean bandera2 = true;
        int contador2 = 0;
        
        //String entrada = "( write hola mundo  )"; 
        String operarComando[] = entrada.split(" ");
        for (int i = 0; i<operarComando.length; i++){
            
            switch (operarComando[i]){
                case "write":
                    contador2 = i+1;
                    while(bandera2){
                        System.out.println(operarComando[contador2]);
                        contador2++;
                        if (operarComando[contador2].equals(")")){
                            bandera2 = false;
                        }
                        
                    }
                    
                    break;
            }
        
        }
    }//fin de writeLine
    
    
    public void writeLine2(String entrada){
        boolean bandera2 = true;
        int contador2 = 0;
        
        //String entrada = "( write hola mundo  )"; 
        String operarComando[] = entrada.split(" ");
        for (int i = 0; i<operarComando.length; i++){
            
            switch (operarComando[i]){
                case "write":
                    contador2 = i+1;
                    
                case "quote":    
                    
                    contador2 = i+2;
                    while(bandera2){
                        System.out.println(operarComando[contador2]);
                        contador2++;
                        if (operarComando[contador2].equals(")")){
                            bandera2 = false;
                        }//fin de if
                        
                    }//fin de while
                    
                    break;
            }
        
        }
    }//fin de writeLine2
    
    
    public void operaciones(String entrada){
        boolean bandera2 = true;
        int contador2 = 0;
        
        //String entrada = "( write hola mundo  )"; 
        String operarComando[] = entrada.split(" ");
        for (int i = 0; i<operarComando.length; i++){
            
            switch (operarComando[i]){
                case "write":
                    contador2 = i+1;
                    while(bandera2){
                        System.out.println(operarComando[contador2]);
                        contador2++;
                        if (operarComando[contador2].equals(")")){
                            bandera2 = false;
                        }
                        
                    }
                    
                    break;
            }
        
        }
    }//fin de writeLine
    
    
    public void Temperatura(){
        
    }
}
