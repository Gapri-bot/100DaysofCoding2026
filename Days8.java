public class Days8 {
    public static void main(String[] args){

        // deklarasi tipe data dan nama variabel
        String nama;
        int umur,angkatan;

        // inisialisasi (mengisi nilai untuk pertama kali)
        nama = "Ahmad";
        umur = 19;
        angkatan = 2024;

        // output sebelum update 
        System.out.println("=====Sebelum update=====");
        System.out.println("Nama\t:" + nama);
        System.out.println("Umur\t:" + umur);
        System.out.println("Angkatan:" + angkatan);

        // Mengganti nilai lama dengan nilai yang baru
        nama = "Gapri";
        umur = 20;
        angkatan = 2025;
        
        // output sesudah update
        System.out.println("=====Sesudah Update=====");
        System.out.println("Nama\t:" + nama);
        System.out.println("Umur\t:" + umur);
        System.out.println("Angkatan:" + angkatan);
    }
}
