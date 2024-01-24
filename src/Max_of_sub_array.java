import java.util.Scanner;

public class  Max_of_sub_array{
    public static void sub_arrays(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int current_sum=0;
        for (int i = 0; i <number.length ; i++) {
            for (int j = i; j <number.length ; j++) {
                current_sum=0;
                for (int k = i; k <=j ; k++) {
                    current_sum+=number[k];
                }
                System.out.println(current_sum);
                if(maxSum<current_sum){
                    maxSum=current_sum;
                }

            }
        }
        System.out.println("Max sum= "+maxSum);
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
