import java.util.Scanner;

public class bubble_shorting {
    public static void shorting(int[] array){
        for (int turn = 0; turn <array.length-1 ; turn++) {
            for (int i = 0; i < array.length-1-turn ; i++) {
                if (array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }

        }
    }
    public static void print(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] number=new int[n];
        for (int  i= 0; i <number.length ; i++) {
            number[i]=sc.nextInt();
        }
        shorting(number);
        print(number);
    }

}
