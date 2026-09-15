import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        Random r = new Random();

        int[][] M = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                M[i][j] = r.nextInt(10) + 1;

                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += M[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaFila);

        }
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += M[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumaColumna);

        }
    }

}
