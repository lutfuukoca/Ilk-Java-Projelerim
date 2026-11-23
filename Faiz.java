public class Faiz {
    public static void main(String[] args) {
        double tutar = 1000;
        int yil = 0;

        while (tutar <= 2000) {
            tutar = tutar * 1.07;
            yil++;
        }

        System.out.println("Yil: " + yil);
    }
}