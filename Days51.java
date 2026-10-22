import java.util.Scanner;

public class Days51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah perulangan: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        input.close();
    }
}
