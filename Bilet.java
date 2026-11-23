import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı girin: ");
        int yas = input.nextInt();

        System.out.print("Öğrenci misiniz? (e/h): ");
        String ogrenci = input.next();

        if (yas <= 6) {
            System.out.println("Bilet: 0 TL");
        } else if (yas <= 17) {
            System.out.println("Bilet: 80 TL");
        } else if (yas >= 65) {
            System.out.println("Bilet: 60 TL");
        } else {
            if (ogrenci.equalsIgnoreCase("e")) {
                System.out.println("Bilet: 80 TL");
            } else {
                System.out.println("Bilet: 150 TL");
            }
        }

        input.close();
    }
}