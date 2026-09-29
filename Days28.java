import java.util.Scanner;

public class Days28 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int a, b;

        System.out.print("Angka1:");
        a = input.nextInt();

        System.out.print("Angka2:");
        b = input.nextInt();


        System.out.print("Lebar:");
       
        System.out.println("Apa kedua angka sama:" + (a == b));
        System.out.println("apa kedua angka berbeda:" + (a != b));


        input.close();
    }
}
