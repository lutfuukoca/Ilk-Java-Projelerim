import java.util.Scanner;

public class SaniyeCevir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("saniye giriniz : ");
        int toplamSaniye = scanner.nextInt();

        int saat = toplamSaniye / 3600;
        int kalanSaniye = toplamSaniye % 3600;
        
        int dakika = kalanSaniye / 60;
        int saniye = kalanSaniye % 60;

        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye");

        scanner.close();
    }
}
