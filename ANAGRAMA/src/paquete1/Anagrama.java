package paquete1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrama{

    Scanner entrada = new Scanner (System.in);
    String cadena1, cadena2;
    
    char [] arrayc1;
    char [] arrayc2;
    
    public void crearArreglo (){
        System.out.println("Digite una palabra: "); 
        cadena1= entrada.nextLine();
        cadena1 = (cadena1.toLowerCase()).trim();
        arrayc1 = cadena1.toCharArray();     
    }
        
    public void crearArreglo2(){
        System.out.println("Digite la segunda palabra: ");
        cadena2 = entrada.nextLine();
        cadena2 = (cadena2.toLowerCase()).trim();
        arrayc2 = cadena2.toCharArray();
    }
        
    public void verificarAnagrama(){
        if (cadena1.length() != cadena2.length()) {
            System.out.print("La palabras no son anagrama");
        } 
        else {
            Arrays.sort(arrayc1);
            Arrays.sort(arrayc2);
            //System.out.println(arrayc1);
            //System.out.println(arrayc2);
            boolean encontrado = false;
                
            for (int i=0; i< arrayc1.length; i++){ 
                    for(int j = 0; j < arrayc2.length; j++) {
                 
                        if(arrayc1[i] == arrayc2[j]){
                            encontrado = true;
                        } 
                        else{
                            encontrado = false;
                        }
                    }   
            }    
            
            if (encontrado == true){
                System.out.printf("%s es un anagrama de %s", cadena1, cadena2);
            }
            if(encontrado == false){
                System.out.println("No hay anagrama");
            }
        }
    }
}
