import java.util.Scanner;

public class odd_or_even_by_BitManipulation {
    public static void odd_Or_even(int n){
        int bitMask=1;
        if((n&bitMask)==1){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        odd_Or_even(3);
        odd_Or_even(n);
    }
}
