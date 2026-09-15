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
        
    }
    
}
