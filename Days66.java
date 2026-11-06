import java.util.Scanner;

public class Days66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
