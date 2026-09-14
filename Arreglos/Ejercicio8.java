public class Ejercicio8 {
    public static void main(String[] args) {
        int[] Arreglo = new int[30];
        Random r = new Random();

        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = r.nextInt(20) + 1;
        }

        int mayor = Arreglo[0];
        int menor = Arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
    }
}
