import java.util.Scanner;

public class Days88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();

        tampilkanPerkenalan(nama, prodi);

        input.close();
    }

    static void tampilkanPerkenalan(String nama, String prodi) {
        System.out.println("\n=== PERKENALAN ===");
        System.out.println("Perkenalkan saya " + nama + ", dari prodi " + prodi + ".");
    }
}
