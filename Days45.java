import java.util.Scanner;

public class Days45 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Kamu memilih Bakso");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}
