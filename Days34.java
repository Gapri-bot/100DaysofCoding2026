import java.util.Scanner;

public class Days34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Grade A - Sangat Baik");
        } else if (nilai >= 80) {
            System.out.println("Grade B - Baik");
        } else if (nilai >= 70) {
            System.out.println("Grade C - Cukup");
        } else {
            System.out.println("Grade D - Tidak Lulus");
        }

        input.close();
    }
}
