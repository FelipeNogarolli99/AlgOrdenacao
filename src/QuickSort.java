public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encontra o índice do pivô
            int pi = partition(arr, low, high);

            // Recursivamente ordena os elementos antes e depois do pivô
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Índice do menor elemento
        for (int j = low; j < high; j++) {
            // Se o elemento atual é menor que ou igual ao pivô
            if (arr[j] <= pivot) { //Verificamos se o elemento atual é menor ou igual ao pivô.
                i++;

                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Imprime o array a cada troca
                Main.printArray(arr);
            }
        }

        // Troca arr[i+1] e arr[high] (pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Imprime o array a cada troca
        Main.printArray(arr);

        return i + 1;
    }
}
