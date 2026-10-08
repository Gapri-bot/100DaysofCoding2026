import java.util.Scanner;

public class Days37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angka tersebut adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah bilangan negatif");
        } else {
            System.out.println("Angka tersebut adalah nol");
        }

        input.close();
    }
}
