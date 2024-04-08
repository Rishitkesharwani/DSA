package searching;

public class linear_search {
    public static int searching(int num,int[] arr){
        int key=num;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(searching(6,arr));
    }
}
