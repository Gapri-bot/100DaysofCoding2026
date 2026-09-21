import java.util.Scanner;

public class days21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        String angka = input.nextLine();

        int hasil = Integer.parseInt(angka);

        System.out.println("Nilai String : " + angka);
        System.out.println("Nilai Integer: " + hasil);

        input.close();
    }
}
