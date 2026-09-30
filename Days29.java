import java.util.Scanner;

public class Days29 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a, b;

        System.out.print("Angka1:");
        a = input.nextInt();

        System.out.print("Angka2:");
        b = input.nextInt();

        System.out.println("Apa lebih besar?:" + (a > b));
        System.out.println("Apa lebih kecil?:" + (a < b));

        input.close();
        }
} 
