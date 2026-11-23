import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secim;
        int islem = 0;

        do {
            System.out.println("1) Kitap ara  2) Odunc al  3) Iade et  0) Cikis");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Kitap ara");
                    islem++;
                    break;
                case 2:
                    System.out.println("Odunc al");
                    islem++;
                    break;
                case 3:
                    System.out.println("Iade et");
                    islem++;
                    break;
                case 0:
                    System.out.println("Cikis");
                    break;
                default:
                    System.out.println("Gecersiz secim");
                    break;
            }
        } while (secim != 0);

        System.out.println("Islem sayisi: " + islem);
    }
}