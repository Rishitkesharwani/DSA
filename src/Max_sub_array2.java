import java.util.Scanner;
public class Max_sub_array2 {
    public static void sub_arrays(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int current_sum=0;
        int[] prefix=new int[number.length];
        prefix[0]=number[0];
        for (int i = 1; i < number.length ; i++) {
            prefix[i]=prefix[i-1]+number[i];
        }
        for (int i = 0; i <number.length ; i++) {
            int start=i;
            for (int j = i; j <number.length ; j++) {
                int end=j;
                current_sum=start==0 ?prefix[start]:prefix[end]-prefix[start-1];
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

