public class main {
    public static void main(String[] args) {

        //Menggunakan println() untuk mencetak dan pindah baris secara   otomatis
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama       : Ahmad Abd Gafri");
        System.out.println("Asal       : Majene");

        System.out.println();

        // Menggunakan print() untuk mencetak tanpa pindah baris
        System.out.print("Program Studi : ");
        System.out.println("Pendidikan Teknologi Informasi");

        System.out.println();

        // Menggunakan printf() untuk mencetak dengan format khusus
        String nim = "H0725310";
        int umur = 20;

        System.out.printf("NIM        : %s%n", nim);
        System.out.printf("Umur       : %d Tahun%n", umur);
         // %n digunakan untuk membuat baris baru dalam printf()
        // %d digunakan untuk menampilkan angka bulat
        // %s digunakan untuk menampilkan string
    }
}
