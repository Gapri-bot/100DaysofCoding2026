import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai A: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai B: ");
        int b = input.nextInt();
        int sisa = a % b;
        System.out.println("Sisa Bagi: " + sisa);
    }
}
