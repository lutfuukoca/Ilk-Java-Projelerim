import java.util.Scanner;

public class BursHesaplama {
    public static void main(String[] args) {
        System.out.println("Fırat Üniversitesi Teknoloji Fakültesi Yazılım Mühendisliği Burs Hesaplama Programına Hoşgeldiniz");
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adnınızı ve Soyadınızı Giriniz: ");
        String adSoyad = input.nextLine();
        System.out.println("Sayın " + adSoyad + ", Lütfen Ortalamanızı Giriniz: ");
        double puan = input.nextDouble();

        if (puan == 0) {
            System.out.println("Ortalama 0 olduğu için program sonlandırılıyor.");
            input.close();
            System.exit(0);
        }

        System.out.println( "Lütfen Ailenizin Aylık Gelirini Giriniz: ");
        double gelir = input.nextDouble();
        System.out.println("Lütfen Ailenizdeki Kişi Sayısını Giriniz: ");
        int kisiSayisi = input.nextInt();
        System.out.println("Girdiğiniz bilgilerin doğruluğunu onaylıyor musunuz? (E/H)");
        String onay = input.next();
        if (onay.equals("E")) {
            System.out.println("Bilgileriniz onaylandı. Gerekli dönüş yakın zamanda yapılacaktır.");
        } else if (onay.equals("H")) {
            System.out.println("Lütfen formu baştan doldurunuz.");
        }


    }
}