package recursion;

public class friends_paring_problem {
    public static int friPair(int n){
        if(n==1|| n==2){
            return n;
        }
        return friPair(n-1)+(n-1)*friPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friPair(3));

    }
}
