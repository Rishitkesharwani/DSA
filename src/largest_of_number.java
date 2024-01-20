import java.util.Scanner;

public class largest_of_number {
    public static int largest_num(int number[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <number.length ; i++) {
            if (largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
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
        int larger=largest_num(number);
        System.out.println("Larger number is: "+ larger);
    }
}
