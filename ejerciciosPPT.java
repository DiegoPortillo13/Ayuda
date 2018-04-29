
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class ejercicios {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) { 
        byte aleatorio; 
        String usuario = "", ordenador = ""; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("\npiedra, papel, tijera, lagarto, spock"); 
        System.out.print("tu opción: "); 
        usuario = sc.next(); 
        if(!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijera") && !usuario.equals("lagarto") && !usuario.equals("spock")) { 
            System.out.println("\nopción no válida\n");
        } 
        else { 
            aleatorio = (byte)(Math.random() * 5); 
            switch (aleatorio) { 
                case 0: 
                    ordenador = "piedra"; 
                    break; 
                case 1: 
                    ordenador = "papel"; 
                    break; 
                case 2: 
                    ordenador = "tijera"; 
                    break; 
                case 3:
                    ordenador = "lagarto";
                    break;
                case 4:
                    ordenador = "spock";
                    break;
            } 
            System.out.println("ordenador: " + ordenador); 
            if(usuario.equals(ordenador)) { 
                System.out.println("\nDe nuevo!\n"); 
            } 
            else { 
                if((usuario.equals("piedra") && ordenador.equals("papel")) 
                        || (usuario.equals("papel") && ordenador.equals("tijera")) 
                        || (usuario.equals("tijera") && ordenador.equals("piedra"))  
                        || (usuario.equals("lagarto") && ordenador.equals("piedra"))  
                        || (usuario.equals("spock") && ordenador.equals("lagarto"))  
                        || (usuario.equals("tijera") && ordenador.equals("spock"))  
                        || (usuario.equals("lagarto") && ordenador.equals("tijeras"))  
                        || (usuario.equals("papel") && ordenador.equals("lagarto"))  
                        || (usuario.equals("spock") && ordenador.equals("papel"))  
                        || (usuario.equals("piedra") && ordenador.equals("spock"))) { 
                    System.out.println("\nBazinga!\n"); 
                } 
                else { 
                    System.out.println("\n¡Raj tramposo!\n"); 
                } 
            } 
        } 
    } 
}
