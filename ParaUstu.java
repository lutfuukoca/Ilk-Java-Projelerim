import java.util.Scanner;

public class ParaUstu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("toplam kaç kuruşunuz var? : ");
        int toplamKurus = scanner.nextInt();

        int birTl = toplamKurus / 100;
        int kalan = toplamKurus % 100;

        int elliKurus = kalan / 50;
        kalan = kalan % 50;

        int yirmiBesKurus = kalan / 25;
        kalan = kalan % 25;

        int onKurus = kalan / 10;
        kalan = kalan % 10;

        int besKurus = kalan / 5;
        kalan = kalan % 5;

        int birKurus = kalan;

        System.out.println("1 TL: " + birTl);
        System.out.println("50 kurus: " + elliKurus);
        System.out.println("25 kurus: " + yirmiBesKurus);
        System.out.println("10 kurus: " + onKurus);
        System.out.println("5 kurus: " + besKurus);
        System.out.println("1 kurus: " + birKurus);

        scanner.close();
    }
}

