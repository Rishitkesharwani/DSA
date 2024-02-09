package recursion;

public class bs {
    public static int binary(int [] arr,int key,int s,int e){
        if (s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key)
             return binary(arr,key,mid+1,e);
       return binary(arr,key,s,mid-1);

    }

    public static void main(String[] args) {
        int[] arr={1,2,5,7,8};
        System.out.println(binary(arr,9,0, arr.length-1));

    }
}
