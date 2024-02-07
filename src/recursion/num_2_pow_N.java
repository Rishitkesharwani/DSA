package recursion;

public class num_2_pow_N {
    public static int pow(int n,int p){
        if(p==0)
            return 1;
        return n*pow(n,p-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(pow(num,3));
    }
}
