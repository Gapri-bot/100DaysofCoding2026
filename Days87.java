import java.util.Scanner;

public class Days87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\n=== DATA ARRAY SEBELUM DIUBAH ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }

        System.out.print("\nMasukkan index yang ingin diubah: ");
        int index = input.nextInt();

        if (index >= 0 && index < jumlah) {
            System.out.print("Masukkan nilai baru: ");
            angka[index] = input.nextInt();

            System.out.println("\nData berhasil diubah!");
        } else {
            System.out.println("\nIndex tidak valid!");
        }

        System.out.println("\n=== DATA ARRAY SETELAH DIUBAH ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }

        input.close();
    }
}
