package recursion;

public class sum_of_n_number {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        sum(n-1);
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
