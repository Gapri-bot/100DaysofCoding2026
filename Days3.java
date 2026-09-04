public class days3 {
    // disini saya menggunakan deklarasi variabel dan berbagai tipe data
    public static void main(String[] args) {
        String nama = "Ahmad Abd Gapri";
        int umur = 20;
        double tinggiBadan = 168.5;
        char inisial = 'A';
        String status = "Mahasiswa";

        // selanjutnya penggunaan ESCAPE SEQUENCE

        // penggunaan \n untuk membuat baris baru setelah teks "Data Mahasiswa:"
        System.out.println("Data Mahasiswa:\n");

        // penggunaan \t untuk membuat tab (spasi horizontal) agar tampilan rapi sejajar
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("Tinggi\t: " + tinggiBadan + " cm");
        System.out.println("Inisial\t: " + inisial);

        // penggunaan \" menampilkan tanda kutip dua sebagai karakter biasa di output
        System.out.println("Status\t: \"" + status + "\"");

        // penggunaan \b menghapus karakter sebelumnya, contoh "Tiba tibat" -> "Tiba tiba"
        System.out.println("Tiba tibat\b Days 3");

        // penggunaan \\ menampilkan tanda backslash sebagai karakter biasa di output
        System.out.println("Path folder: C:\\Users\\Ahmad\\Documents");
    }
}
