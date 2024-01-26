import java.util.Scanner;
public class trapping_rainwater {
public static int volume_of_Water(int[] height,int width){
    int n=height.length;
    int[] left_Max=new int[n];
    left_Max[0]=height[0];
    for (int i = 1; i <n ; i++) {
        left_Max[i]=Math.max(height[i],left_Max[i-1]);
    }
    int [] right_Max=new int[n];
    right_Max[n-1]=height[n-1];
    for (int i = n-2; i >=0 ; i--) {
        right_Max[i]=Math.max(height[i],right_Max[i+1]);
    }
    int trapped_Water=0;
    for (int i = 0; i <n ; i++) {
        int waterLevel=Math.min(left_Max[i],right_Max[i]);
        trapped_Water+=(waterLevel-height[i])*width;
    }
    return trapped_Water;
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] height=new int[n];
        for (int  i= 0; i <height.length ; i++) {
            height[i]=sc.nextInt();
        }
        System.out.println("Enter the width: ");
        int width=sc.nextInt();
        System.out.println(volume_of_Water(height,width));
    }
}
