import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Random r = new Random();
        Double suma = 0.0;

        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10) + 1;
            suma += A[i];
        }
        Double promedio = suma / A.length;

        int contadorMayor = 0;
        int contadorMenor = 0;
        for (int num : A) {
            if (num > promedio) {
                contadorMayor++;
            } else if (num < promedio) {
                contadorMenor++;
            }

            int[] mayores = new int[contadorMayor];
            int[] menores = new int[contadorMenor];
        }

        
    }
    
}
