public class Kalp {
    public static void main(String[] args) {
        for (double y = 1.3; y >= -1.1; y -= 0.1) {
            for (double x = -1.3; x <= 1.3; x += 0.05) {
                double a = x * x + y * y - 1;
                // Kalp denklemi: (x² + y² - 1)³ - x²y³ <= 0
                if (a * a * a - x * x * y * y * y <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}