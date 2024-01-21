import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    class Main {
        private int atmNo;
        private Map<String, Hesap> hesaplar;
        public Main(int atmNo) {
            this.atmNo = atmNo;
            this.hesaplar = new HashMap<>();
        }
        public void hesapEkle(String hesapNo, String sifre, double bakiye) {
            Hesap hesap = new Hesap(hesapNo, sifre, bakiye);
            hesaplar.put(hesapNo, hesap);
        }

        public boolean kullaniciKontrol(String hesapNo, String sifre) {
            if (hesaplar.containsKey(hesapNo)) {
                Hesap hesap = hesaplar.get(hesapNo);
                return hesap.getSifre().equals(sifre);
            }
            return false;
        }

        public void paraYatir(String hesapNo, double miktar) {
            if (hesaplar.containsKey(hesapNo)) {
                Hesap hesap = hesaplar.get(hesapNo);
                hesap.paraYatir(miktar);
                System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + hesap.getBakiye() + " TL");
            } else {
                System.out.println("Hesap bulunamadı.");
            }
        }

        public void paraCek(String hesapNo, double miktar) {
            if (hesaplar.containsKey(hesapNo)) {
                Hesap hesap = hesaplar.get(hesapNo);
                if (hesap.paraCek(miktar)) {
                    System.out.println(miktar + " TL çekildi. Yeni bakiye: " + hesap.getBakiye() + " TL");
                } else {
                    System.out.println("Yetersiz bakiye.");
                }
            } else {
                System.out.println("Hesap bulunamadı.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("ATM Numarası: ");
            int atmNo = scanner.nextInt();
            Main atm = new Main(atmNo);

            // Örnek hesaplar oluşturuluyor
            atm.hesapEkle("123456", "1234", 1000.0);
            atm.hesapEkle("789012", "5678", 500.0);

            System.out.print("Hesap Numarası: ");
            String hesapNo = scanner.next();

            System.out.print("Şifre: ");
            String sifre = scanner.next();

            if (atm.kullaniciKontrol(hesapNo, sifre)) {
                System.out.println("1 - Para Yatır\n2 - Para Çek");
                System.out.print("İşlem Seçiniz: ");
                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Yatırılacak Miktar: ");
                        double yatirilacakMiktar = scanner.nextDouble();
                        atm.paraYatir(hesapNo, yatirilacakMiktar);
                        break;
                    case 2:
                        System.out.print("Çekilecek Miktar: ");
                        double cekilecekMiktar = scanner.nextDouble();
                        atm.paraCek(hesapNo, cekilecekMiktar);
                        break;
                    default:
                        System.out.println("Geçersiz işlem.");
                }
            } else {
                System.out.println("Hesap numarası veya şifre hatalı.");
            }
        }
    }

    class Hesap {
        private String hesapNo;
        private String sifre;
        private double bakiye;

        public Hesap(String hesapNo, String sifre, double bakiye) {
            this.hesapNo = hesapNo;
            this.sifre = sifre;
            this.bakiye = bakiye;
        }

        public String getHesapNo() {
            return hesapNo;
        }

        public String getSifre() {
            return sifre;
        }

        public double getBakiye() {
            return bakiye;
        }

        public void paraYatir(double miktar) {
            bakiye += miktar;
        }

        public boolean paraCek(double miktar) {
            if (bakiye >= miktar) {
                bakiye -= miktar;
                return true;
            } else {
                return false;
            }
        }
    }


