import java.util.Scanner;

public class Days65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();

        System.out.println("Pola garis vertikal:");

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        input.close();
    }
}
