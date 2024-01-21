public class mert_onder_proje_10 {

        public static void main(String[] args) {
            int sayi = 2;
            int adet = 0;

            System.out.println("İlk 20 asal sayı:");

            while (adet < 20) {
                if (asalMi(sayi)) {
                    System.out.print(sayi + " ");
                    adet++;
                }
                sayi++;
            }
        }

        // Bir sayının asal olup olmadığını kontrol eden metod
        public static boolean asalMi(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


