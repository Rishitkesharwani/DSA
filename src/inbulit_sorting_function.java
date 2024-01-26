import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class inbulit_sorting_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
        // To use inbuilt reverse function of array java.util.collection
        // It can be only implemented in Object classes like Integer,String...
        Integer[] arr=new Integer[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
