package recursion;
public class sum_of_febonachi {
    public static int feb(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return feb(n - 1) + feb(n - 2);
            }
        }

        public static int febSum(int n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += feb(i);
            }
            return sum;
        }

        public static void main(String[] args) {
            System.out.println(febSum(5));
        }
    }


