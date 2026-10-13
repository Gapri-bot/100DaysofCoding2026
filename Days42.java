import java.util.Scanner;

public class Days42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Gaji Kotor: Rp");
        double gajiKotor = input.nextDouble();

        double potongan;

        if (gajiKotor > 10000000) {
            potongan = gajiKotor * 0.15;
        } else if (gajiKotor > 5000000) {
            potongan = gajiKotor * 0.10;
        } else if (gajiKotor > 0) {
            potongan = gajiKotor * 0.05;
        } else {
            potongan = 0;
            System.out.println("Gaji tidak valid!");
        }

        double gajiBersih = gajiKotor - potongan;

        System.out.println("\n=== HASIL PERHITUNGAN GAJI ===");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Kotor: Rp" + gajiKotor);
        System.out.println("Potongan: Rp" + potongan);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);

        input.close();
    }
}
