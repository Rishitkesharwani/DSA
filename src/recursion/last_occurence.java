package recursion;

public class last_occurence {
    public static int lastOccurence(int[] arr,int key, int i){
        if(i== arr.length)
            return -1;
        int ans=lastOccurence(arr,key,i+1);
        if(arr[i]==key&&ans==-1){
            return i;
        }

        return ans;
    }
    public static void main(String[] args){
        int[]  arr={1,2,3,4,5,6,6,7,8,9};
        System.out.println(lastOccurence(arr,6,0));

    }
}
