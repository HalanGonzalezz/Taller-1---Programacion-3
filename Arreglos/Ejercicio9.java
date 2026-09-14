import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10) + 1;
    }
    System.out.println("Arreglo A: ");
    for (int i = 0; i < A.length; i++) {
        System.out.print(A[i] + " ");
    }
    System.out.println("\nIngrese un número entero a buscar en el arreglo: ");
    int num = sc.nextInt();

    int contador = 0;
    for (int n : A) {
        if (n == num) {
            contador++;
        }
    }
    System.out.println("El número " + num + " se repite " + contador + " veces en el arreglo.");
    
    
}
}
