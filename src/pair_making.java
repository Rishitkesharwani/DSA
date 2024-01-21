import java.util.Scanner;
public class pair_making {
    public static void pairMaking(int number[]){
        for (int i = 0; i <number.length ; i++) {
            int curr=number[i];
            for (int j = i+1; j <number.length ; j++) {
                System.out.print("(" +curr+","+number[j] + ")");
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
        pairMaking(number);
    }
}
