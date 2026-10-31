import java.util.Scanner;

public class Days60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }

        System.out.println("Hasil penjumlahan angka 1 sampai " + n + " adalah: " + jumlah);

        input.close();
    }
}
