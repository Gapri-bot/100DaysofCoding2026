import java.util.Scanner;

public class Days39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Hasil Penjummlahan:" + (a + b));
        } else if (pilihan == 2) {
           System.out.println("Hasil Pengurangan:" + (a - b));
        } else if (pilihan == 3) {
            System.out.println("Hasil Perkalian:" + (a * b));
        } else if (pilihan == 4) {
            System.out.println("Hasil Pembagian:" + (a / b));
        } else {
            System.out.println("Tidak operator untuk pilihan anda");
        }

        input.close();
    }
}
