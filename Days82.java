import java.util.Scanner;

public class Days82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String prodi = input.nextLine();

        System.out.println("Perkenalkan saya " + nama + ", dari prodi " + prodi + ".");

        input.close();
    }
}
