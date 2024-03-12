package recursion;

public class fact_of_num {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
       int fcn1= fact(n-1);
        int fac=(n*fcn1);
        return fac;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(fact(n));

    }
}
