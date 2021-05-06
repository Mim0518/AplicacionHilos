/*
Guillermo Moreno Rivera
03/May/2021
*/
import java.util.Scanner;
public class VectorHilos{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        int size = sc.nextInt();
        int[] vector = new int [size];
        for(int x = 0; x <= vector.length-1; x++){
            vector[x] = (int) (Math.random()*20)+1;
        }
        Thread Cuadrados = new Thread(new Cuadrados(vector));
        Thread Suma = new Thread(new Suma(vector));
        Thread Media = new Thread(new Media(vector));
        Cuadrados.start();
        Suma.start();
        Media.start();

    }
}