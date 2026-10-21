import java.util.Scanner;

public class Days50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
