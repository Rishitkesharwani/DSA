package recursion;

public class merge_Short {
    public static void printArr(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeShort(int[] arr, int si, int ei){
        // base condition
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        // logic
        mergeShort(arr,si,mid); // left
        mergeShort(arr,mid+1,ei); // Right arr
        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; // iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; // iterator for temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        // copy temp to my original arr
        for ( k = 0,i=si; k < temp.length; k++,i++) {
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,6,7,8,-9,8,-4556};
        mergeShort(arr,0,arr.length-1);
        printArr(arr);
    }
}
