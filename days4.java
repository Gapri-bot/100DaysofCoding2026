public class days4 {
    public static void main(String[] args) {
        
        // tipe data numerik bilangan bulat byte 8 bit. Rentang byte yaitu -128 - 127
        byte jumlahanak = 3;
        System.out.printf("Jumlah anak\t:%d orang%n", jumlahanak);

        // tipe data numerik bilangan bulat short 16 bit. Rentang short yaitu -32.768 - 32.767
        short tinggigedung = 1250;
        System.out.printf("Tinggi gedung\t:%,d cm%n", tinggigedung);

        // tipe data numerik bilangan bulat int 32 bit. Rentang int yaitu -2.147.483.648 - 2.147.483.647
        int gajikaryawan = 8500000;
        System.out.printf("Gaji karyawan\t:Rp%,d%n", gajikaryawan);

        // tipe data numerik bilangan bulat long 64 bit. Rentang long yaitu -9.223.372.036.854.775.808 - 9.223.372.036.854.775.807
        long jumlahpenduduk = 8100000000L;
        // nilai long yang melampaui batas nilai int harus menggunakan suffix (L) di akhir angka
        // menunjukkan bahwa angka tersebut merupakan literal bertipe long
        System.out.printf("Jumlah penduduk\t:%,d jiwa%n", jumlahpenduduk);
    }
}
