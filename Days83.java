import java.util.Scanner;

public class Days83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();

            total += angka[i];
        }

        System.out.println("Hasil penjumlahan semua elemen array = " + total);

        input.close();
    }
}
