package recursion;

public class tiling_prob {
    public static int tilingProblem(int n){
        // Base case
        if(n==0|| n==1){
            return 1;
        }

        // vertical
        int fn1=tilingProblem(n-1);

        // horizontal
        int fn2=tilingProblem(n-2);

        int tot_Tile=fn1+fn2;
        return tot_Tile;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
