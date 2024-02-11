package recursion;

public class shorted_and_rotated_array {
    public static int search(int[] arr, int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        // mid in line 1
        if(arr[si]<=arr[mid]){
            // case a
            if(arr[si]<=target&& target<=arr[mid]){
                return search(arr,target,si,mid-1);
            }
            //case b
            else {
                return search(arr,target,mid+1,ei);
            }
        }
        // mid in line 2
        else {
            // Case a
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            // Case b
            else {
                return search(arr,target,si,mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,624,62};
        System.out.println(search(arr,624,0,arr.length-1));
    }
}
