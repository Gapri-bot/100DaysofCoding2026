import java.util.Scanner;

public class Days26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double alas, tinggi, luas;

        alas = input.nextDouble();
        tinggi = input.nextDouble();

        luas = 1/2.0 * alas * tinggi;

        System.out.println(luas);

        input.close();
    }
}
