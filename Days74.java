import java.util.Scanner;

public class Days74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String teks = input.nextLine();

        System.out.println("Teks asli: " + teks);
        System.out.println("Jumlah karakter: " + teks.length());
        System.out.println("Huruf kapital: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        input.close();
    }
}
