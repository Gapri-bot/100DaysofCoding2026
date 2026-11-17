import java.util.Scanner;

public class Days77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = input.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        System.out.println("Panjang teks: " + teks.length());
        System.out.println("Huruf besar: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        System.out.println("Apakah teks kosong? " + teks.isEmpty());
        System.out.println("Apakah teks mengandung Java? " + teks.contains("Java"));
        System.out.println("Apakah teks sama dengan Java? " + teks.equals("Java"));
        System.out.println("Apakah teks sama dengan java? " + teks.equalsIgnoreCase("java"));

        if (teks.length() >= 5) {
            System.out.println("5 karakter pertama: " + teks.substring(0, 5));
        } else {
            System.out.println("Teks kurang dari 5 karakter.");
        }

        System.out.println("Mengganti Java: " + teks.replace("Java", "Python"));
        System.out.println("Menghapus spasi awal dan akhir: '" + teks.trim() + "'");

        input.close();
    }
}
