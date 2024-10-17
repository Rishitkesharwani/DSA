public class insertion_short {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            int top=i-1;
            int new_card=arr[i];
            while(top>=0 && arr[top]>new_card){
                arr[top+1]=arr[top];
                top--;
            }
            arr[top+1]=new_card;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//         Time complexity O(n^2)
//        Space complexity O(1)

    }
}
