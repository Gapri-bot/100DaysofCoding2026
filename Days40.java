import java.util.Scanner;

public class Days40 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Urutan Hari 1-7: ");
        int a = input.nextInt();

        if ( a >= 1 && a <= 5) {
            System.out.println("Hari Kerja");
        }

        else if ( a >=6 && a <=7) {
            System.out.println("Hari Libur");
        }

         else  {
            System.out.println("Nomor Hari Tidak Valid");
         }

        input.close();
    }
}
