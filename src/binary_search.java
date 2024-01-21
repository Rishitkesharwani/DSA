import java.util.Scanner;

public class binary_search {
    public static int binary_search(int[] number,int key){
        int start=0;
        int end=number.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid] <key){
              start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int number[]=new int[n];
        for (int  i= 0; i <number.length ; i++) {
            System.out.print("Enter the number at "+i+" Index: ");
            number[i]=sc.nextInt();
        }
        System.out.print("Enter the number which you want to find: ");
        int key=sc.nextInt();
        System.out.println("Index of num: "+key+ " is "+binary_search(number,key));
    }
}
