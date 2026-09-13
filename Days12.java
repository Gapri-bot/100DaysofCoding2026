// disini saya menambahkan Scanner agar keyboard membaca data yang nanti di input
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        // dibawah ini saya menggunkan Scanner dengan nama input
        // jika nanti pengguna ingin mangambil data yang di ketik
        Scanner input = new Scanner (System.in);
    System.out.print("Nama:");
    String nama = input.nextLine();// untuk membaca semua baris yang di input masuk setelah di enter

    System.out.print("Umur:");
    int umur = input.nextInt();// membaca angka bilangan bulat

    System.out.print("Tinggi:");
    float tinggi = input.nextFloat();// membaca angka bilangan desimal

    System.out.print("Jenis Kelamin:");
    input.nextLine(); // bersihkan Enter
    char jenisKelamin = input.nextLine().charAt(0);// guna dari "0" adalah untuk membaca nilai karakter pertama
    
    // menampilkan biodata yang akan muncul di output
    System.out.println("====BIODATA====");
    System.out.println("Nama\t\t:" + nama);
    System.out.println("Umur\t\t:" + umur);
    System.out.println("Tinggi\t\t:" + tinggi + " m");
    System.out.println("Jenis Kelamin\t:" + jenisKelamin);

    input.close();// untuk menutup scanner karna program sudah selesai
    }
}
