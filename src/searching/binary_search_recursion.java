package searching;

public class binary_search_recursion {
    public static int search(int[] arr, int key, int si, int ei) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;

            // base case
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return search(arr, key, si, mid - 1);
            } else {
                return search(arr, key, mid + 1, ei);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(arr, 0, 0, arr.length - 1));
    }
}
