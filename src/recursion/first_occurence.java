package recursion;

public class first_occurence {
    public static int firstOccu(int arr[] , int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key)
            return i;
        return firstOccu(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,6,7,8};
        int n=7;
        System.out.println(firstOccu(arr,n,0));
    }
}
