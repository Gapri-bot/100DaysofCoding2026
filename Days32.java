import java.util.Scanner;

public class Days32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Masukkan Angka 1:");
        a = input.nextInt();
        System.out.print("Masukkan Angka 1:");
        b = input.nextInt();

        a++;
        System.out.println("Hasil penjumlahan:" + a);
        b--;
        System.out.println("Hasil pengurangan:" - b);
        System.out.println("Apakah a lebih besar dari b: " + (a > b));
        System.out.println("Apakah a lebih kecil dari b: " + (a < b));
        System.out.println("Apakah a dan b sama sama besar: " + (a == b));
        System.out.println("Apakah a tidak sama dengan b:" + (a != b));
        System.out.println("Apakah a lebih kecil atau sama dengan b:" + (a <= b));
        System.out.println("Apakah a lebih besar atau sama dengan b:" + (a >= b));
        System.out.println("Apakah kedua nilai nya bernilai true:" + (a> 0 && b> 0));
        System.out.println("Apakah salah satu nilai benar:" + (a> 5 || b> 5));
        System.out.println("Apakah nilai a dan b kebalikan dari kondisinya: " + (!(a == b)));

        input.close();
    }

}
