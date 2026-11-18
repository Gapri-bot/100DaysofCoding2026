import java.util.Scanner;

public class Days78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MEMBUAT AKUN ===");

        System.out.print("Buat Username: ");
        String username = input.nextLine();

        System.out.print("Buat Password: ");
        String password = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("\n=== LOGIN AKUN ===");

        String userLogin;
        String passLogin;

        while (true) {
            System.out.print("Masukkan Username: ");
            userLogin = input.nextLine();

            System.out.print("Masukkan Password: ");
            passLogin = input.nextLine();

            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("\nLogin berhasil! Selamat datang.");
                break;
            } else {
                System.out.println("\nUsername atau Password salah!");
                System.out.println("Silakan coba lagi.\n");
            }
        }

        input.close();
    }
}
