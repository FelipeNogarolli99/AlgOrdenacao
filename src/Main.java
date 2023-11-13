public class Main {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array inicial:");
        printArray(array);
        System.out.println();

        System.out.println("Bubble Sort:");
        BubbleSort.bubbleSort(array.clone());
        System.out.println();

        System.out.println("Insertion Sort:");
        InsertionSort.insertionSort(array.clone());
        System.out.println();

        System.out.println("Quick Sort (pivô é o último elemento):");
        QuickSort.quickSort(array.clone(), 0, array.length - 1);
    }

    // Função auxiliar para imprimir o array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " - ");
        }
        System.out.println();
    }
}
