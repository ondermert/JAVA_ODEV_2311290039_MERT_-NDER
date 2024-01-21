import java.util.Scanner;

public class mert_onder_proje_13 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Üçgen oluşturmak için üç sayı girin:");
            System.out.print("1. Kenar: ");
            double kenar1 = scanner.nextDouble();
            System.out.print("2. Kenar: ");
            double kenar2 = scanner.nextDouble();
            System.out.print("3. Kenar: ");
            double kenar3 = scanner.nextDouble();


            if (isUcgen(kenar1, kenar2, kenar3)) {
                System.out.println(" bir üçgen oluşturulabilir.");
                if (isEskenar(kenar1, kenar2, kenar3)) {
                    System.out.println("Bu eşkenar bir üçgendir.");
                }

                else if (isIkizkenar(kenar1, kenar2, kenar3)) {
                    System.out.println("Bu ikizkenar bir üçgendir.");
                }
                else if (isDikKenar(kenar1, kenar2, kenar3)) {
                    System.out.println("Bu dik kenar bir üçgendir.");
                }
                else {
                    System.out.println("Bu  normal bir üçgendir.");
                }
            } else {
                System.out.println("Bununla üçgen oluşturulamaz.");}
        }
        public static boolean isUcgen(double a, double b, double c) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }
        public static boolean isEskenar(double a, double b, double c) {
            return (a == b) && (b == c);
        }

        public static boolean isIkizkenar(double a, double b, double c) {
            return (a == b) || (a == c) || (b == c);
        }

        public static boolean isDikKenar(double a, double b, double c) {
            double[] kenarlar = {a, b, c};
            java.util.Arrays.sort(kenarlar);
            return Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2], 2);
        }
        }


