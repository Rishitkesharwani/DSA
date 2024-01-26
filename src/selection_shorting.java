import java.util.Scanner;

public class selection_shorting {
    public static void print(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] +" ");
        }
    }
    public static void selective_Shorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
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
        selective_Shorting(number);
        print(number);
    }
    }

