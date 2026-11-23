import java.util.Locale;
import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        final double ACILIS_UCRETI = 30.0;
        final double KILOMETRE_UCRETI = 20.0;

        Scanner input = new Scanner(System.in);
        double mesafe = input.nextDouble();
        int saat = input.nextInt();

        double ucret = ACILIS_UCRETI + mesafe * KILOMETRE_UCRETI;

        if (saat >= 0) {
            if (saat <= 5) {
                ucret = ucret * 1.5;
            }
        }

        System.out.printf(Locale.US, "Ucret: %.2f%n", ucret);
        input.close();
    }
}