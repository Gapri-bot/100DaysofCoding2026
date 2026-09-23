import java.util.Scanner;
public class Days23 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);

        int sisi, luas;

        System.out.print("Masukkan Panjang Sisi:");
        sisi = input.nextInt();

        luas = sisi * sisi;

        System.out.println("Luas Persegi\t:" + luas);

        input.close();

    }
}
