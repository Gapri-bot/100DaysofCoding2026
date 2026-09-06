public class Days5 {
    public static void main(String[] args) {
        // Program sederhana menghitung BMI (Body Mass Index)
        // Menggunakan tipe data float dan double
        // float di gunakan untuk menghitung pecahan desimal yang tidak butuh ketelitian presisi
        // sedangkan untuk double sebaliknya

        // kalau pakai float akhiran nya harus dikasih "f"

        float Beratbadan = 54.5f;

        // kalau pakai double akhirannya ngk usah ada huruf

        double Tinggibadan = 168;

        // rumus menghitung BMI: berat badan di bagi (tinggi badan * tinggi badan)
        double bmi = Beratbadan / (Tinggibadan * Tinggibadan);

        System.out.println("======================");
        System.out.println("KALKULATOR BMI");
        System.out.println("======================");

        // menampilkan hasil berat badan, tinngi badan, dan BMI ke layar
        System.out.println("Berat Badan (float)\t: " + Beratbadan + "kg");
        System.out.println("Tinggi Badan (double)\t: " + Tinggibadan + "cm");
        System.out.println("======================");
        System.out.println("BMI\t\t\t: " + bmi);
        System.out.println("======================");
        System.out.println("\"ARIGATO GOZAIMASU :)\"");
        System.out.println("======================");
    }
}
