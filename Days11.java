// Kita "ambil" alat bernama Scanner dari rak bernama java.util
// Scanner ini gunanya buat baca input yang diketik user
import java.util.Scanner;
public class Days11 {

    public static void main(String[] args) {
        // Menyalakan alat Scanner tadi, terus dikasih nama "input"
        // System.in artinya alat ini "mendengarkan" ketikan dari keyboard
        Scanner input = new Scanner(System.in);

        // String -> untuk kalimat/teks pamjang
        System.out.print("Masukkan Nama Lengkap:");
        String nama = input.nextLine();

        //  Byte -> untuk angka bulat keAhcil (-128 sampai 127)
        System.out.print("Masukkan Umur:");
        byte umur = input.nextByte();

        // Short -> untuk angka bulat, lebih besar dari byte
        System.out.print("Masukkan Tahun Lahir:");
        Short tahunlahir = input.nextShort();

        // int -> untuk angka bulat biasa (paling sering digunakan)
        System.out.print("Masukkan Tanggal Saat ini:");
        int tanggal = input.nextInt();

        // long -> untuk angka bulat yang sangat besar
        System.out.print("Masukkan No HP:");
        long nohp = input.nextLong();

        // float -> untuk angka desimal (koma) ukuran kecil
        System.out.print("Masukkan Tinggi Badan:");
        float tinggibadan = input.nextFloat();

        // double -> untuk angka desimal, lebih presisi dari float
        System.out.print("Masukkan Berat Badan:");
        double beratbadan = input.nextDouble();

        // boolean -> cuma punya dua pilihan = true dan false
        System.out.print("Apakah Anda Termasuk Mahasiswa aktif atau tidak:");
        boolean aktif = input.nextBoolean();

        // char -> satu huruf saja
        // Scanner gak punya cara langsung baca 1 huruf
        // jadi kita baca satu kata dulu pakai next(), lalu ambil huruf pertamanya
        System.out.print("Jenis Kelamin (L/P):");
        char jeniskelamin = input.next().charAt(0);

        // sebelum baca kalimat panjang, kita bersihkan dulu sisa enter
        // yang masih nyangkut dari input sebelumnya
        input.nextLine();

        // menampilkan semua data yang kita masukkan di atas tadi
        System.out.println("\n=====DATA MAHASISWA=====");
        System.out.println("Nama Lengkap\t:" + nama);
        System.out.println("Umur\t\t:" + umur);
        System.out.println("Tahun Lahir\t:" + tahunlahir);
        System.out.println("Tanggal Sekarang:" + tanggal);
        System.out.println("No Hp\t\t:" + nohp);
        System.out.println("Tinggi Badan\t:" + tinggibadan);
        System.out.println("Berat Badan\t:" + beratbadan);
        System.out.println("Aktif\t\t:" + aktif);
        System.out.println("Jenis Kelamin\t:" + jeniskelamin);

        // menutup Scanner karena sudah di pakai
        input.close();
    }
}
