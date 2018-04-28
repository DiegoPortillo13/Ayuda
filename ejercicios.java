
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

        ejercicios f1 = new ejercicios("fibonacci 1", 10); //Se le da nombre y Tamaño
        f1.mostrarSerie();//Imprime la serie

    }

    public void mostrarSerie() {
        System.out.println(this.nombre + " de tamaño " + this.tamaño + ":");//Llenado de la serie
        for (int i = 0; i < tamaño; i++) {
            System.out.print(f(i) + " ");//Segun i es como actua la funcion recursiva( i es n en la clase recursiva
            
        }
        System.out.println();
    }

    int f(int n) {//Clase Recusriva 
        if (n > 1) {
            return f(n - 1) + f(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
    public int tamaño;
    public String nombre;

    public ejercicios(String nombre, int tamaño) {//Constructor para que se le asigne tamaño 
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    ejercicios() {//Constructor vacio

    }

    public String getNombre() {//obtiene el nombre de la serie
        return nombre;
    }

    public void setNombre(String nombre) {//Se le agraga el nombre
        this.nombre = nombre;
    }

    public int getTamaño() {//obtiene el tamaño
        return tamaño;
    }

    public void setTamaño(int tamaño) {//Se le Agrega el tamaño
        this.tamaño = tamaño;
    }
}
