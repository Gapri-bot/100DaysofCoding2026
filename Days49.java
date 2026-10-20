import java.util.Scanner;

public class Days49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
