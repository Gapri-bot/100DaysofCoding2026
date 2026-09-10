public class Days9 {

    public static void main(String[] args) {
        
        String Heroname;
        int Level;
        int Power;
        int Agility;
        // di bawah ini adalah contoh pengguanaan variabel constanta
        // yang dimana nilai nya tidak bisa di ubah lagi ketika sudah di inisialisasi
        final int Speed;// (variabel constanta final)

        Heroname = "Assasin";
        Level = 99;
        Power = 80;
        Agility = 99;
        Speed = 99;

        System.out.println("Hero Name:" + Heroname);
        System.out.println("Hero Level\t:" + Level);
        System.out.println("Hero Power\t:" + Power);
        System.out.println("Hero Agility\t:" + Agility);
        System.out.println("Hero Speed\t:" + Speed);

        // jika misalnya kita ingin mengubah nilai secara paksa
        // contoh nya ketika kamu menambahkan variabel dan nilai baru: "Speed = 80"
        // maka hasilnya akan terjadi eror= variable Speed may already have been assigned
    }

}
