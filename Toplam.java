import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int adet = 0;

        int sayi = input.nextInt();      // ilk okuma: döngüden önce

        while (sayi != 0) {              // 0 gözcü: toplanmaz, sayılmaz
            toplam += sayi;
            adet++;
            sayi = input.nextInt();      // sonraki okuma: gövdenin sonunda
        }

        System.out.println("Toplam: " + toplam);
        System.out.println("Adet: " + adet);
    }
}