import java.util.Scanner;

public class Days70 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris:");
        int n = input.nextInt();

        for (int baris = 1; baris <=n; baris++) {
            for (int kolom =1; kolom <= baris; kolom++) {
                System.out.print("*");
            }
                System.out.println();
        }

        input.close();
    }
}
