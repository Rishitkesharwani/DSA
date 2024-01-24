import java.util.Scanner;

public class sub_array {
    public static void sub_arrays(int number[]){
        for (int i = 0; i <number.length ; i++) {
            for (int j = i; j <number.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
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
        sub_arrays(number);
    }
}
