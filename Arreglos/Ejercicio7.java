import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {

        int[] A = new int[10];
        Random r = new Random();
        
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(50) + 1;
            if (A[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        int[] B = new int[pares];
        int[] C = new int[impares];

       int indexB = 0;
        int indexC = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[indexB] = A[i];
                indexB++;
            } else {
                C[indexC] = A[i];
                indexC++;
            }
        }

        System.out.println("Arreglo A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nArreglo B (pares): ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("\nArreglo C (impares): ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
