import java.util.Scanner;

public class Days31 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        boolean a, b;

        System.out.print("Masukkan Nilai 1:");
        a = input.nextBoolean();
        
        System.out.print("Masukkan Nilai 2:");
        b = input.nextBoolean();

        System.out.println("Hasil and:" + (a && b));
        System.out.println("Hasil or:" + (a || b));
        System.out.println("Hasil not:" + ( !a));

        input.close();
    }
}
