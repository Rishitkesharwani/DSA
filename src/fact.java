public class fact {
    public fact() {
    }

    public static void main(String[] args) {
        long n = 50L;
        System.out.println(Math.abs(fact(n, 1L)));
        System.out.println();
    }

    public static long fact(long n, long ans) {

        return n != 0L && n != 1L ? fact(n - 1L, ans * n) : ans;
    }
}
