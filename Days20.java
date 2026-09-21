import java.util.Scanner;

public class KonversiIntKeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Mengubah int menjadi String
        String hasil = String.valueOf(angka);

        System.out.println("Nilai int    : " + angka);
        System.out.println("Nilai String : " + hasil);

        input.close();
    }
}
