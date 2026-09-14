import  java.util.Scanner;

public class EvaluasiMentor {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan Nama\t:");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM\t:");
        String Nim = input.nextLine();

        System.out.print("Tinggi badan\t:");
        double tinggibadan = input.nextDouble();

        System.out.print("Berat Badan\t:");
        double Beratbadan = input.nextDouble();
        input.nextLine();

        System.out.print("Status Mahasiswa:");
        boolean status = input.nextBoolean();

        System.out.println("Masukkan Nama\t:" + nama);
        System.out.println("Masukkan NIM\t:" + Nim);
        System.out.println("Masukkan TB\t:" + tinggibadan + " M");
        System.out.println("Masukkan BB\t:" + Beratbadan + " Kg");
        System.out.println("Status\t\t:" + status);

        input.close();
    }
}
