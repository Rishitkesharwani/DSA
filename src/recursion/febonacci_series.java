package recursion;

public class febonacci_series {
    public static int feb(int n){
        if(n==0||n==1) {
            return n;
        }
        int febn1=feb(n-1);
        int febn2=feb(n-2);
        return febn1+febn2;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(feb(n));

    }
}
