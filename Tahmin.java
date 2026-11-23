import java.util.Scanner;

public class Tahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HEDEF = 42;

        int tahmin = -1;    // hedefe eşit olmayan başlangıç değeri
        int deneme = 0;

        while (tahmin != HEDEF) {
            tahmin = input.nextInt();
            deneme++;

            if (tahmin < HEDEF) {
                System.out.println("Daha buyuk");
            } else if (tahmin > HEDEF) {
                System.out.println("Daha kucuk");
            }
        }

        System.out.println("Bildin! Deneme: " + deneme);
    }
}