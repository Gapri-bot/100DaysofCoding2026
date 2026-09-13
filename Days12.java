import java.util.Scanner;
public class Days12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Lengkap\t=");
        String nama = input.nextLine();

        System.out.print("Tempat Lahir\t=");
        String tempatlahir = input.nextLine();

        System.out.print("Umur\t\t=");
        int umur = input.nextInt();

        System.out.print("Tinggi Badan\t=");
        double tinggibadan = input.nextDouble();

        System.out.print("Berat Badan\t=");
        double beratbadan = input.nextDouble();
        input.nextLine();

        System.out.print("Jenis Kelamin\t=");
        char jenisKelamin = input.nextLine().charAt(0);

        System.out.print("Semester\t=");
        int semester = input.nextInt();

        System.out.print("IPK\t\t=");
        double ipk = input.nextDouble();
        input.nextLine();

        System.out.print("Status\t\t=");
        String status = input.nextLine();


        System.out.println("==================================");
        System.out.println(         "BIODATA MAHASISWA        ");
        System.out.println("==================================");
        System.out.printf("Nama Lengkap\t: %s%n", nama);
        System.out.printf("Tempat Lahir\t: %s%n",tempatlahir);
        System.out.printf("Umur\t\t: %s%n", umur);
        System.out.printf("Tinggi Badan\t: %s%n",tinggibadan + " M");
        System.out.printf("Berat Badan\t: %s%n",beratbadan + " Kg");
        System.out.printf("Jenis Kelamin\t: %s%n",jenisKelamin);
        System.out.printf("Semester\t: %s%n",semester);
        System.out.printf("IPK\t\t: %s%n",ipk);
        System.out.printf("Status\t\t: %s%n",status);
        System.out.println("==================================");

        input.close();
    }
}
