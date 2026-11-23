import java.util.Scanner;

public class Dogrula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int not;

        do {
            not = input.nextInt();

            if (not < 1 || not > 5) {
                System.out.println("Gecersiz, tekrar:");
            }
        } while (not < 1 || not > 5);

        System.out.println("Gecerli not: " + not);
    }
}