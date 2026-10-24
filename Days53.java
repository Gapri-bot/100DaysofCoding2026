import java.util.Scanner;

public class Days53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah perulangan: ");
        int jumlah = input.nextInt();

        int i = 1;
        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while (i <= jumlah);

        input.close();
    }
}
