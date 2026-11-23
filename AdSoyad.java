import java.util.Scanner;

public class AdSoyad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        System.out.print("adSoyad giriniz : ");

        scanner.nextLine();

        String adSoyad = scanner.nextLine();

        System.out.println("Merhaba " + adSoyad + ", " + yas + " yasindasin.");

        scanner.close();
    }
}