public class mert_onder_proje_8 {

        public static void main(String[] args) {
            int n = 20;
            int[] fibonacci = new int[n];

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println("Fibonacci Serisi ( 20 tane terim):");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }


