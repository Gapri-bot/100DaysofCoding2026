public class Days6 {
    public static void main(String[] args) {
        // ===== Tipe Data CHAR =====
        char inisialnama ='G';  // menyimpan satu karakter, inisial nama
        char grade = 'A';       // menyimpan grade nilai siswa

         // ===== Tipe Data BOOLEAN =====
        System.out.println("Inisial Nama\t:" + inisialnama);
        System.out.println("Grade\t\t:" + grade);

        // ===== Tipe Data BOOLEAN =====
        boolean sudahdaftar = true;     // status: benar (true)
        boolean belumdaftar = false;    // status: salah (false)

        System.out.println("Sudah Daftar\t:" + sudahdaftar);
        System.out.println("Belum Daftar\t:" + belumdaftar);

        boolean lulus = (grade == 'A');   // true karena grade bernilai 'A'
        System.out.println("Lulus?\t\t:" + grade);
    }
} 
