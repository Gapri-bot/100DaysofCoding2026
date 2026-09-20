import java.util.Scanner;

public class days19_konversi_manual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        long angka = input.nextLong();

        // Konversi manual dari long ke int
        int hasil = (int) angka;

        System.out.println("Nilai long : " + angka);
        System.out.println("Nilai int  : " + hasil);

        input.close();
    }
}
