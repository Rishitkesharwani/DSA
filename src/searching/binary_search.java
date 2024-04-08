package searching;

public class binary_search {
    public static int search(int key,int[]  arr){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key)
                return mid;
            // Left side
            else if (arr[mid]>key) {
                right = mid-1;
            }
            else left = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,6,7,8,9};
        System.out.println(search(9,arr));
    }
}
