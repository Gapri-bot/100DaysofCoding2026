import java.util.Scanner;
public class Days22 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int a, b, temp;

        System.out.print("Masukkan nilai a:");
        a = input.nextInt();

        System.out.print("Masukkan nilai b:");
        b = input.nextInt();
        
        System.out.println("===Nilai Sebelum Ditukar===");
        System.out.println("Nilai a:" + a);
        System.out.println("Nilai b:" + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("===Nilai Sesudah Ditukar===");
        System.out.println("Nilai a:" + a);
        System.out.println("Nilai b:" + b);

        input.close();
    
    }
}
