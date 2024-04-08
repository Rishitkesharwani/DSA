import java.util.Scanner;public class printing_prime_number_in_range {

    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime_number_in_range(int n) {
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");

            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       prime_number_in_range(a);
    }
}

