import java.util.Scanner;

public class Days80 {
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

        System.out.println("\n=== DATA ARRAY ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }

        System.out.print("\nMasukkan index yang ingin diakses: ");
        int index = input.nextInt();

        if (index >= 0 && index < jumlah) {
            System.out.println("Data pada index " + index + " adalah: " + angka[index]);
        } else {
            System.out.println("Index tidak tersedia!");
        }

        input.close();
    }
}
