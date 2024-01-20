import java.util.Scanner;
public class reverse_num {

    public static void reverse_of_num(int[] number){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
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
        reverse_of_num(number);
        for (int j : number) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
