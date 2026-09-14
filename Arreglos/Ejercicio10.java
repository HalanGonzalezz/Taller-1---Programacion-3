public class Ejercicio10 {
    public static void main(String[] args) {
        int[] A = { 8, 5, 3, 10, 2, 8, 1 };
        int n = A.length;

        int tamB = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        int[] B = new int[tamB];

        for (int i = 0; i < tamB; i++) {
            if (i == n - 1 - i) {
                B[i] = A[i];
            } else {
                B[i] = A[i] + A[n - 1 - i];
            }
            System.out.println("El arreglo B es: ");
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[j] + " ");

                System.out.println("\nEl arreglo B es: ");
                for (int k = 0; k < B.length; k++) {
                    System.out.print(B[k] + " ");

                }
            }
        }
    }
}
