import java.util.Scanner;
public class OperatorPenugasan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        int nilai = input.nextInt();
        int awal = nilai;
        nilai += 5;
        int hasilTambah = nilai;
        nilai -= 3;
        int hasilKurang = nilai;
        nilai *= 2;
        int hasilKali = nilai;
        nilai /= 4;
        int hasilBagi = nilai;
        nilai %= 3;
        int hasilModulus = nilai;
        System.out.println("\nHasil Operator Penugasan");
        System.out.println("Nilai awal       = " + awal);
        System.out.println("Hasil += 5       = " + hasilTambah);
        System.out.println("Hasil -= 3       = " + hasilKurang);
        System.out.println("Hasil *= 2       = " + hasilKali);
        System.out.println("Hasil /= 4       = " + hasilBagi);
        System.out.println("Hasil %= 3       = " + hasilModulus);
        input.close();
    }
}
