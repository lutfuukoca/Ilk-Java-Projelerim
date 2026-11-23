import java.util.Scanner;

public class VkiHesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz : ");
        double boy = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.printf("VKI: %.2f\n", vki);

        if (vki < 18.5) {
            System.out.println("Zayif");
        } else if (vki < 25) {
            System.out.println("Normal");
        } else if (vki < 30) {
            System.out.println("Fazla kilolu");
        } else {
            System.out.println("Obez");
        }
        
        scanner.close();
    }
}
