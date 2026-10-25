import java.util.Scanner;

public class Days55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka batas perulangan: ");
        int batas = input.nextInt();

        System.out.println("\nContoh continue:");
        for (int i = 1; i <= batas; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nContoh break:");
        for (int i = 1; i <= batas; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nContoh return:");
        tampilkanPesan();

        System.out.println("Program selesai.");
        input.close();
    }

    static void tampilkanPesan() {
        System.out.println("Pesan sebelum return");
        return;
    }
}
