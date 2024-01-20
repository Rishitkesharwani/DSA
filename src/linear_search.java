import java.util.Scanner;

public class linear_search {
public static int search(int[] number,int key) {
    for (int i = 0; i < number.length; i++) {
        if (number[i] == key) {
            return i;
        }

    }
    return -1;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] number=new int[n];
        for (int i = 0; i <number.length ; i++) {
            System.out.print("Enter the element at "+i+" index: ");
            number[i]=sc.nextInt();
        }
        System.out.print("Enter the number whose index you want to find: ");
        int key=sc.nextInt();

        int index=search(number,key);
        if (index==-1){
            System.out.println("Number not found");
        }
        else System.out.println("Index"+" "+index);;
    }
}
