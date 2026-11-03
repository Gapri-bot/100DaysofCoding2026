import java.util.Scanner;

public class Days63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka M: ");
        int m = input.nextInt();

        System.out.print("Masukkan pangkat N: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }

        System.out.println(m + " pangkat " + n + " adalah: " + hasil);

        input.close();
    }
}
