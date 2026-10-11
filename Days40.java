import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Urutan Hari 1-7: ");
        int a = input.nextInt();

        if ( a <= 5) {
            System.out.println("Hari Kerja");
        }

        else if (a <=7) {
            System.out.println("Hari Libur");
        }

         else  {
            System.out.println("Nomor Hari Tidak Valid");
         }

        input.close();
    }
}
