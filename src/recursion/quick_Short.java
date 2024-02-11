package recursion;

public class quick_Short {
    public static void quickShort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr,si,ei);
            quickShort(arr, si, pIdx - 1);
            quickShort(arr, pIdx + 1, ei);
        }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
            int[] arr={1,34,67,35,25};
            quickShort(arr,0,arr.length-1);
            print(arr);
    }
}
