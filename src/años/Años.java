/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package años;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class Años {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingresar un año");
       int AÑOS = entrada.nextInt();
       int A = 0;
       
       if(AÑOS < 2021){
           A = 2021 - AÑOS;
           System.out.println("Han pasado " + A + " años");
       } else if(AÑOS > 2021){
           A = AÑOS - 2021;
           System.out.println("Faltan " + A + " años");
       } else{
           System.out.println("Año actual");
       }
       
    }
    
}
