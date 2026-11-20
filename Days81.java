import java.util.Scanner;

public class Days81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        System.out.println("\n=== MENGISI ARRAY ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\n=== SEMUA ELEMEN ARRAY ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Elemen index " + i + " = " + angka[i]);
        }

        input.close();
    }
}
