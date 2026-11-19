import java.util.Scanner;

public class Days79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        System.out.println("\n=== INPUT DATA ARRAY ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\n=== HASIL ARRAY ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + angka[i]);
        }

        input.close();
    }
}
