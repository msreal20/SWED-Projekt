public class FunctionCheck {

    public static int ulamSteps(long n) {
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = 3 * n + 1;
                System.out.println(n);
            }
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        int limit = 5;

        for (int i = 1; i < limit; i++) {
            ulamSteps(i);
        }

        System.out.println("With number 5 as the start, the last number is 1.");
    }
}
