import java.util.Scanner;

public class mert_onder_proje_9 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ondalık bir sayı gir: ");
            int decimal = scanner.nextInt();
            String binary = convertToBinary(decimal);
            System.out.println("Binary karşılığı: " + binary);
        }

        public static String convertToBinary(int decimal) {

            StringBuilder binary = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal /= 2;
            }

            if (binary.length() == 0) {
                binary.append(0);
            }

            return binary.toString();
        }
    }






