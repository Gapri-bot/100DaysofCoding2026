import java.util.Scanner;

public class Days85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }

        input.close();
    }
}
