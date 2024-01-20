import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Hesap Makinası");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");



            int secim = scanner.nextInt();



            System.out.print("İlk sayıyı girin: ");
            double sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            switch (secim) {
                case 1:
                    toplama(sayi1, sayi2);
                    break;
                case 2:
                    cikarma(sayi1, sayi2);
                    break;
                case 3:
                    carpma(sayi1, sayi2);
                    break;
                case 4:
                    bolme(sayi1, sayi2);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }


    }

    private static void toplama(double sayi1, double sayi2) {
        double sonuc = sayi1 + sayi2;
        System.out.println("Toplama Sonucu: " + sonuc);
    }

    private static void cikarma(double sayi1, double sayi2) {
        double sonuc = sayi1 - sayi2;
        System.out.println("Çıkarma Sonucu: " + sonuc);
    }

    private static void carpma(double sayi1, double sayi2) {
        double sonuc = sayi1 * sayi2;
        System.out.println("Çarpma Sonucu: " + sonuc);
    }

    private static void bolme(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            double sonuc = sayi1 / sayi2;
            System.out.println("Bölme Sonucu: " + sonuc);
        } else {
            System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
        }
    }
}
// mert önder 2311290039