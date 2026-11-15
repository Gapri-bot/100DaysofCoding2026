import java.util.Scanner;

public class Days75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String teks1 = input.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String teks2 = input.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN ===");

        System.out.println("equals(): " + teks1.equals(teks2));

        System.out.println("equalsIgnoreCase(): " + teks1.equalsIgnoreCase(teks2));

        System.out.println("contains(): " + teks1.contains(teks2));

        System.out.println("isEmpty(): " + teks1.isEmpty());

        input.close();
    }
}
