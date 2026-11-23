public class pi {
    public static void main(String[] args) {
        double pi = 0.0;
        int n = 1; // Number of terms in the series
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                pi += 1.0 / (2 * i + 1);
            } else {
                pi -= 1.0 / (2 * i + 1);
            }
        }
        pi *= 4; // Multiply by 4 to get the value of pi
        System.out.println("Approximation of Pi: " + pi);
    }
}
