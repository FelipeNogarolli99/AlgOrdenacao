public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; //valor atual
            int j = i - 1;

            // Move os elementos do array[0..i-1] que são maiores que key
            // para uma posição à frente de sua posição atual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Imprime o array a cada movimentação
            Main.printArray(arr);
        }
    }
}
