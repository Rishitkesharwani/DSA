public class quick_short {
    public static void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int pos = partition(arr, s, e);
            quickSort(arr, s, pos - 1);
            quickSort(arr, pos + 1, e);
        }
    }

    static int partition(int[] arr, int s, int e) {
        int pivot = arr[e]; // Choosing the last element as the pivot
        int i = s - 1; // Index of smaller element

        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[e] (or the pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[e];
        arr[e] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1,0,0,1,0};
        int s = 0;
        int e = arr.length - 1;
        quickSort(arr, s, e);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
