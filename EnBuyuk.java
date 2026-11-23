import java.util.Scanner;

public class EnBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" İlk Sayıyı giriniz: ");
        int birinci = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int ikinci = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");    
        int ucuncu = input.nextInt();

        int enBuyuk = birinci;

        if (ikinci > enBuyuk) {
            enBuyuk = ikinci;
        }
        if (ucuncu > enBuyuk) {
            enBuyuk = ucuncu;
        }

        System.out.println("En buyuk: " + enBuyuk);
        input.close();
    }
}