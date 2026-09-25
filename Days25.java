import java.util.Scanner;
public class Days25 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        double phi = 3.14;
        double jarijari,luas;

        System.out.print("jari-jari:");
        jarijari = input.nextDouble();

        luas = phi * jarijari * jarijari;

        System.out.println("Luas Lingkaran: " + luas);

        input.close();

    }
}
