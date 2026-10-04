import java.util.Scanner;

public class Days33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai:");
        int nilai = input.nextInt();

        if (nilai >=75) {
            System.out.println("Omedetoo!!! kamu lulus");
        } else {
            System.out.println("Akira menai!!! coba lagi tahun depan");
            
        }

        input.close();
    }
}
