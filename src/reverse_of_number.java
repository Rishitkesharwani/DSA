public class reverse_of_number {
    public reverse_of_number() {
    }

    public static void main(String[] args) {
        int n = 5;
        Dc(n);
    }

    public static void Dc(int n) {
        if (n != 0) {
            System.out.println(n);
            Dc(n - 1);

        }
    }
}
