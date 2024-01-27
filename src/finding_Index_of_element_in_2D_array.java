import java.util.Scanner;

public class finding_Index_of_element_in_2D_array {
    public static boolean search(int[][] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==num){
                    System.out.println("Found at index ("+i + "," + j +" )");
                    return true;
                }


            }

        }
        System.out.println("Number not found in the given array");
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.print("");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        search(arr,5);
    }

}
