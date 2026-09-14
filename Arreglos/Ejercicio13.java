import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] A = new int[20];
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

            int iMayor = 0;
            int iMenor = 0;
            for (int num : A) {
                if (num > promedio)
                    mayores[iMayor++] = num;
                else if (num < promedio)
                    menores[iMenor++] = num;
            }

            System.out.println("Arreglo A: ");
            for (int n : A) {
                System.out.print(n + " ");  
            System.out.println("\nPromedio: " + promedio);
            System.out.println("Números mayores al promedio: ");
            for (int n : mayores) {
                System.out.print(n + " ");
            }
            System.out.println("\nNúmeros menores al promedio: ");
            for (int n : menores) {
                System.out.print(n + " ");
            }
        }
    }
}
