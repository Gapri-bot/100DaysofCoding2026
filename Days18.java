import java.util.Scanner;
public class days18_konversi_otomatis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        byte angka = input.nextByte();
        // Konversi otomatis dari byte ke int
        int hasil = angka;
        System.out.println("Nilai byte : " + angka);
        System.out.println("Nilai int  : " + hasil);
        input.close();
    }
}
