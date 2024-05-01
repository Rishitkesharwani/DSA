package Graph;
import java.util.Scanner;
public class graph1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of edges:");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Please enter a valid value greater than 0:");
            n = sc.nextInt();
        }
        int arr[][] = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.println("Enter 1 if there is an edge between vertex " + row + " and " + col + ", otherwise 0:");
                int edge = sc.nextInt();
                if (edge != 0 && edge != 1) {
                    System.out.println("Please enter a valid value (0 or 1):");
                    edge = sc.nextInt();
                }
                arr[row][col] = edge;
                arr[col][row] = edge; // Assuming undirected graph
            }
        }
        System.out.println("Printing adjacency matrix:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    }

