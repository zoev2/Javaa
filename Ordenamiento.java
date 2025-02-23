


public class Ordenamiento {
    public static void main(String[] args) {
        // Arreglo desordenado del 1 al 10
        int[] numerosDesordenados = {7, 2, 9, 1, 5, 10, 3, 6, 8, 4};

        // Copia del arreglo para ordenarlo
        int[] numerosOrdenados = numerosDesordenados.clone();

        // Aplicamos el método burbuja
        bubbleSort(numerosOrdenados);

        // Mostramos los arreglos
        System.out.println("Arreglo desordenado:");
        imprimirArreglo(numerosDesordenados);
        
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numerosOrdenados);
    }

    // Método para ordenar con burbuja
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar valores
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambio) break;
        }
    }

    // Método para imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
