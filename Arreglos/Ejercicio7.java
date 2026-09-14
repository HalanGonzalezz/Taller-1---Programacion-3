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
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
