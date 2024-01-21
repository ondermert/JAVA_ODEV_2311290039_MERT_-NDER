import java.util.Scanner;

public class mert_onder_proje_6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = 10;
            int[] sayilar = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Lütfen " + (i + 1) + ". sayıyı gir: ");
                sayilar[i] = scanner.nextInt();
            }

            int enBuyukSayi = sayilar[0];
            int enBuyukSira = 1;

            for (int i = 1; i < n; i++) {
                if (sayilar[i] > enBuyukSayi) {
                    enBuyukSayi = sayilar[i];
                    enBuyukSira = i + 1;
                }
            }

            // Sonucu ekrana yazdır
            System.out.println("En büyük sayı: " + enBuyukSayi);
            System.out.println("Girildiği sıra: " + enBuyukSira);

            // Scanner kapat
            scanner.close();
        }
    }


