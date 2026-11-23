import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        int dogru = 0;

        String cevap1 = klavye.next();
        String cevap2 = klavye.next();
        String cevap3 = klavye.next();

        if (cevap1.equalsIgnoreCase("B")) {
            dogru++;
        }

        if (cevap2.equalsIgnoreCase("D")) {
            dogru++;
        }

        if (cevap3.equalsIgnoreCase("A")) {
            dogru++;
        }

        System.out.println("Dogru: " + dogru + " / 3");

        klavye.close();
    }
}