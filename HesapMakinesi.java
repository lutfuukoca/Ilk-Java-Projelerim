import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();

        System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
        System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
        System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
        System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
        System.out.println(sayi1 + " % " + sayi2 + " = " + (sayi1 % sayi2));

        scanner.close();
    }
}