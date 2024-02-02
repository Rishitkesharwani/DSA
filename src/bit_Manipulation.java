public class bit_Manipulation {
    public static int getIthBit(int n, int i){
        int bitMask=(1<<i);
        if((n&bitMask)==0){
            return 0;
        }
        return 1;
    }
    public static int SetIthBit(int n, int i){
        int bitMask=1<<i;
        n=n|bitMask;
        return n;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static int clearLastIthBit(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
//        System.out.println(getIthBit(10,3));
//        System.out.println(SetIthBit(10,2));
//        System.out.println(clearIthBit(10,1));
        System.out.println(clearLastIthBit(10,2));
    }
}
