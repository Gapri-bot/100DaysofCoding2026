import java.util.Scanner;

public class Days54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();

        if (N % 1 != 0) {
            System.out.println("Pecahan");
        } else if (N % 2 == 0) {
            System.out.println("Bulat Genap");
        } else {
            System.out.println("Bulat Ganjil");
        }

        if (N > 0) {
            System.out.println("Positif");
        } else if (N < 0) {
            System.out.println("Negatif");
        }

        if (N >= 0 && N % 1 == 0) {
            System.out.println("Natural/Cacah");
        }

        input.close();
    }
}
