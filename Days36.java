import java.util.Scanner;

public class Days36 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka tersebut adalah bilangan genap");
        } else {
            System.out.println("Angka tersebut adalah bilangan ganjil");
        }

        input.close();
    }
}
