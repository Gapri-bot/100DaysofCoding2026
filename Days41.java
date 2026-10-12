import java.util.Scanner;

public class Days41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Temperatur Ruangan: ");
        int suhu = input.nextInt();

        if (suhu < 20) {
            System.out.println("Ruangan Dingin");
        }

        if (suhu >= 20 && suhu <= 30) {
            System.out.println("Ruangan Normal");
        }

        if (suhu > 30) {
            System.out.println("Ruangan Panas");
        }

        input.close();
    }
}
