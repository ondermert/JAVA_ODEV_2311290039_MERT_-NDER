import java.util.Scanner;

public class mert_onder_proje_17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir kelime giriniz: ");
            String kelime = scanner.nextLine().toLowerCase();
            int sesliHarfSayisi = 0;
            int sessizHarfSayisi = 0;

            for (int i = 0; i < kelime.length(); i++) {
                char harf = kelime.charAt(i);
                if (harf >= 'a' && harf <= 'z') {
                    if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö'
                            || harf == 'u' || harf == 'ü') {
                        sesliHarfSayisi++;
                    } else {
                        sessizHarfSayisi++;
                    }
                }
               }
            System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
            System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);
            scanner.close();
        }
              }


