import java.util.Scanner;

public class Days38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Jus Jeruk");
        System.out.println("3. Kopi");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
           System.out.println("Kamu memilih es teh");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih jus jeruk");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Kopi");
        } else {
           System.out.println("Kamu tidak memilih apa apa");
        }

        input.close();
    }
}
