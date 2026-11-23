import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("sıcaklığı giriniz : ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);

        scanner.close();
    }
}