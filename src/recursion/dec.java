package recursion;
public class dec {
    public static  void printNum_dec(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNum_dec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printNum_dec(n);

    }
}
