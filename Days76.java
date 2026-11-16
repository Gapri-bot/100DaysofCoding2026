import java.util.Scanner;

public class Days76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = input.nextLine();

        System.out.println("\n=== HASIL MANIPULASI STRING ===");

        System.out.println("Teks asli: " + teks);

        System.out.println("substring(0, 5): " + teks.substring(0, 5));

        System.out.print("Masukkan kata yang ingin diganti: ");
        String cari = input.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String ganti = input.nextLine();

        System.out.println("replace(): " + teks.replace(cari, ganti));

        System.out.println("trim(): '" + teks.trim() + "'");

        input.close();
    }
}
