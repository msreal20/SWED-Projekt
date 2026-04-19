public class CollatzCheck {

    public static int collatzSteps(long n) {
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
            collatzSteps(i);
        }

        System.out.println("All numbers below 5 reach 1.");
    }
}
