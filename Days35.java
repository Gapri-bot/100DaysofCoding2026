import java.util.Scanner;

public class Days35 {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int nilai = Input.nextInt();

    if (nilai >=70) {
         System.out.println("Kamu lulus");

         if (nilai >=90) {
            System.out.println("Nilai kamu kelewat bagus");
            
         }
    } else {
        System.out.println("Kamu belum lulus");
        }

    }
}
