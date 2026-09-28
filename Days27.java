import java.util.Scanner;
public class Days27 {
    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        int angka;

        System.out.print("Masukkan Angka:");
        angka = input.nextInt();

        System.out.println("Nilai Awal:");

        angka++;
        System.out.println("Setelah increment:" + angka);

        angka--;
        System.out.println("Setelah decrement:" + angka);

        input.close();
        
    }
}
